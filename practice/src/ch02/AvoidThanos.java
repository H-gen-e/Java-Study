package ch02;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

// ���� ����̹��� ����
// ����� �Ʒ��� ��� �����̵�

// ���� ������ ����
// ���ΰ� ĳ���͸� �� ������ �����ܵ��� ��� ������ �����´�

// ���ΰ� ĳ���� ����
// ���ΰ� ĳ���ʹ� Ű���� ����Ű�� ���� Ÿ�뽺�� �ε����� ��������


public class AvoidThanos{

	BufferedImage backgrounImage1;
	BufferedImage backgrounImage2;
	final int WIDTH_SIZE = 800;
	final int HEIGHT_SIZE = 800;
	
	
	
	
	
	private class ImagePanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgrounImage1, 0, 0, 0, 0, null);
			g.drawImage(backgrounImage2, 0, 0, 0, 0, null);
		}
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {

	}

}












