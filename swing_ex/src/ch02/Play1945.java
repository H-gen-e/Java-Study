package ch02;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Play1945 extends JFrame {

	BufferedImage bgImage1;
	BufferedImage bgImage2;
	ImagePanel imagePanel;

	final int WIDTH_SIZE = 600;
	final int HEIGHT_SIZE = 600;
	int bgY1;
	int bgY2;
	
	public Play1945() {
		initData();
		setInitLayout();
		addEventListener();
		
		// Thread 생성
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					bgY1--;
					bgY2--;
					
					if(bgY1 < -HEIGHT_SIZE) {
						bgY1 = HEIGHT_SIZE;
					}
					if(bgY2 < -HEIGHT_SIZE) {
						bgY2 = HEIGHT_SIZE;
					}
					
					repaint();
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	
	
	
	

	private void initData() {
		setSize(WIDTH_SIZE, HEIGHT_SIZE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		try {
			this.bgImage1 = ImageIO.read(new File("background.jpg"));
			this.bgImage2 = ImageIO.read(new File("background.jpg"));
		} catch (IOException e) {
			System.err.println("존재하지 않는 파일입니다.");
			e.printStackTrace();
		}
		
		this.imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}

	private void addEventListener() {
		
	}





	private class ImagePanel extends JPanel {
		
		public ImagePanel() {
			bgY1 = 0;
			bgY2 = HEIGHT_SIZE;
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // 캔버스를 베워주는 메서드
			g.drawImage(bgImage1, 0, 0, WIDTH_SIZE, bgY1, null);
			g.drawImage(bgImage2, WIDTH_SIZE, 0, WIDTH_SIZE, bgY2, null);
		}
		
	}

	public static void main(String[] args) {
		new Play1945();
	}
	
}
