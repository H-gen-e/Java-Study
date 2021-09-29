package ch00;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivity extends JFrame implements CallBackAction{

	private JLabel label;
	private int count = 0;
	
	public MainActivity() {
		initData();
		setInitLayout();
	}

	private void initData() {
		this.setTitle("callback");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.label = new JLabel(count+"");
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		this.add(label);
	}

	@Override
	public void clickedAddBtn() {
		System.out.println("callback : callBack OK!");
		this.count++;
		this.label.setText(this.count+"");
	}

	@Override
	public void clickedSubBtn() {
		System.out.println("callback : callBack OK!");
		this.count--;
		this.label.setText(this.count+"");
	}
	
}
