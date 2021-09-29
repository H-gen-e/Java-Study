package ch02;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity1 extends JFrame{

	private String name;
	private JPanel panel;
	
	CallBackCheckPosition callBackCheckPosition = new CallBackCheckPosition() {
		
		@Override
		public void checkPosition(int x, int y) {
			
			System.out.println("x : "+x);
			System.out.println("y : "+y);
		}
	};
	
	public Activity1(String name) {
		this.name = name;
		initData();
		setInitLayout();
	}
	
	private void initData() {
		this.setTitle(this.name);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.panel = new JPanel();
	}
	
	private void setInitLayout() {
		this.setVisible(true);
		this.add(panel);
		this.panel.setBackground(Color.BLUE);
	}
	
	
	
}
