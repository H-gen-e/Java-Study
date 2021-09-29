package ch00;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SubActivity extends JFrame implements ActionListener {

	private JButton buttonAdd;
	private JButton buttonSub;
	private CallBackAction callBackAction;
	
	public SubActivity(CallBackAction callBackAction) {
		this.callBackAction = callBackAction;
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		this.setTitle("callee");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.buttonAdd = new JButton("+");
		this.buttonSub = new JButton("-");
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		this.add(buttonAdd);
		this.add(buttonSub);
	}

	private void addEventListener() {
		this.buttonAdd.addActionListener(this);
		this.buttonSub.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedBtn = (JButton)e.getSource();
		
		if(clickedBtn.getText().equals(buttonAdd.getText())) {
			System.out.println("callee : +1");
			callBackAction.clickedAddBtn();
		}
		else if(clickedBtn.getText().equals(buttonSub.getText())) {
			System.out.println("callee : -1");
			callBackAction.clickedSubBtn();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
