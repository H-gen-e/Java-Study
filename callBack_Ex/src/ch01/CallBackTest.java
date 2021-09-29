package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

interface CallBackBtnAction {
	public abstract void clickedButtonAdd();

	public abstract void clickedButtonSub();
}

// 콜백 받는 객체 : CallBackBtnAction 인터페이스를 구현해서 사용한다.
class MainActivity extends JFrame implements CallBackBtnAction {

	private JLabel label;
	private int num = 0;

	public MainActivity() {
		initData();
		setInitLayout();
	}

	private void initData() {
		this.setTitle("callback");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.label = new JLabel(num + "");
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.add(label);
	}

	@Override
	public void clickedButtonAdd() {
		System.out.println("+ call back OK!");
		this.num++;
		this.label.setText(this.num + "");
	}

	@Override
	public void clickedButtonSub() {
		System.out.println("+ call back OK!");
		this.num--;
		this.label.setText(this.num + "");
	}
}

// 콜리 : 콜백 받는 객체의 주소값을 알고 있어야 어떠한 동작이 실행되었다고 알릴 수 있다.
class SubActivity extends JFrame implements ActionListener {

	private JButton button1;
	private JButton button2;
	CallBackBtnAction callBackBtnAction;

	public SubActivity(CallBackBtnAction callBackBtnAction) {
		this.callBackBtnAction = callBackBtnAction;
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		this.setTitle("callee");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.button1 = new JButton("+");
		this.button2 = new JButton("-");
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		this.add(button1);
		this.add(button2);
	}

	private void addEventListener() {
		this.button1.addActionListener(this);
		this.button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton) e.getSource();

		if (targetBtn.getText().equals(button1.getText())) {
			System.out.println("+ clicked");
			// 사용자가 정의한 메서드 호출
			this.callBackBtnAction.clickedButtonAdd();
		} else if (targetBtn.getText().equals(button2.getText())) {
			System.out.println("- clicked");
			this.callBackBtnAction.clickedButtonSub();
		}

	}

}

public class CallBackTest {

	public static void main(String[] args) {
		MainActivity mainActivity = new MainActivity();
		new SubActivity(mainActivity);
	}

}
