package ch01;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MiniAmongUs extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage amongImage1;
	BufferedImage amongImage2;
	int among1XPoint = 0;
	int among1YPoint = 370;
	int among2XPoint = 200;
	int among2YPoint = 200;
	ImagePanel imagePanel;

	public MiniAmongUs() {
		initData();
		setInitLayout();
		addEventListener();

		Thread th = new Thread(imagePanel);
		th.start();
	}

	private void initData() {
		this.setTitle("미니 어몽어스");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			this.backgroundImage = ImageIO.read(new File("우주배경.jpg"));
			this.amongImage1 = ImageIO.read(new File("어몽어스.png"));
			this.amongImage2 = ImageIO.read(new File("어몽어스2.png"));
		} catch (IOException e) {
			System.err.println("이미지를 불러오는데 실패하였습니다.");
			e.printStackTrace();
		}

		this.imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.add(imagePanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();

				switch (code) {
				case KeyEvent.VK_UP:
					System.out.println("up");
					among2YPoint = (among2YPoint < 0) ? 0 : among2YPoint - 5;
					break;
				case KeyEvent.VK_DOWN:
					System.out.println("down");
					among2YPoint = (among2YPoint > 600) ? 600 : among2YPoint + 5;
					break;
				case KeyEvent.VK_LEFT:
					System.out.println("left");
					among2XPoint = (among2XPoint < 0) ? 0 : among2XPoint - 5;
					break;
				case KeyEvent.VK_RIGHT:
					System.out.println("right");
					among2XPoint = (among2XPoint > 600) ? 600 : among2XPoint + 5;
					break;
				}
				repaint();
			}

		});
	}

	private class ImagePanel extends JPanel implements Runnable {
		@Override
		protected void paintComponent(Graphics g) {
			g.drawImage(backgroundImage, 0, 0, 600, 600, null);
			g.drawImage(amongImage1, among1XPoint, among1YPoint, 100, 100, null);
			g.drawImage(amongImage2, among2XPoint, among2YPoint, 100, 100, null);
		}

		@Override
		public void run() {

			boolean flag = true;
			while (true) {
				if (flag) {
					among1XPoint += 10;
					repaint();
				} else {
					among1XPoint -= 10;
					repaint();
				}

				if (among1XPoint == 600) {
					flag = false;
				}
				if (among1XPoint == 0) {
					flag = true;
				}

				if (among1XPoint == among2XPoint && among1YPoint == among2YPoint) {
					amongImage2 = null;
				}

				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}

}

public class MainTest {

	public static void main(String[] args) {
		new MiniAmongUs();
	}

}
