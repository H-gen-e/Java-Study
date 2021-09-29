package ch02;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

// 게임 배경이미지 생성
// 배경이 아래로 계속 슬라이드

// 게임 아이콘 생성
// 주인공 캐릭터를 뺀 나머지 아이콘들은 계속 위에서 내려온다

// 주인공 캐릭터 생성
// 주인공 캐릭터는 키보드 방향키로 조절 타노스와 부딪히면 게임종료


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












