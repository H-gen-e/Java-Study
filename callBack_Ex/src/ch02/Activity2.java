package ch02;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity2 extends JFrame{

	private String name;
	private JPanel panel;
	private CallBackCheckPosition callBackCheckPosition;
	
	public void setCallBackCheckPosition(CallBackCheckPosition callBackCheckPosition) {
		this.callBackCheckPosition = callBackCheckPosition;
	}
	
	public Activity2(String name) {
		this.name = name;
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		this.setTitle(name);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.panel = new JPanel();
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.add(panel);
		this.panel.setBackground(Color.YELLOW);
	}
	
	private void addEventListener() {
		this.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				callBackCheckPosition.checkPosition(x, y);
			}
		
		});
	}
	
}














