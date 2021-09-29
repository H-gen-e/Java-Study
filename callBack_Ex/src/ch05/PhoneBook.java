package ch05;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class PhoneBook extends JFrame {

	// 포함관계
	private InputPhonewNumber inputPhoneNumber;

	// 생성자
	public PhoneBook() {
		this.inputPhoneNumber = new InputPhonewNumber();
		this.inputPhoneNumber.savePhoneNumber();

		initData();
		setInitLayout();
	}

	// method
	private void initData() {
		this.setTitle("phone book");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		ArrayList<String> name = this.inputPhoneNumber.getUserName();
		ArrayList<String> tel = this.inputPhoneNumber.getTelNumber();

		this.setLayout(new GridLayout(name.size(), 2));
		for (int i = 0; i < name.size(); i++) {
			JTextField field1 = new JTextField(name.get(i), 10);
			JTextField field2 = new JTextField(tel.get(i), 20);
			this.add(field1);
			this.add(field2);
		}

		this.setVisible(true);
	}

	// 메인함수
	public static void main(String[] args) {
		new PhoneBook();
	}
}
