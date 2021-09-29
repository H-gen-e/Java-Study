package ch03;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseActivity extends JFrame {

	private String name;
	protected JPanel panel;

	public BaseActivity(String name) {
		this.name = name;
		initData();
		setInitLayout();
	}

	private void initData() {
		this.setTitle(name);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.panel = new JPanel();
	}

	protected void setInitLayout() {
		this.setVisible(true);
		this.add(panel);
	}

}
