package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class InputPhonewNumber {

	// �������
	private ArrayList<String> userName = new ArrayList<String>();
	private ArrayList<String> telNumber = new ArrayList<>();

	// getter
	public ArrayList<String> getUserName() {
		return this.userName;
	}

	public ArrayList<String> getTelNumber() {
		return this.telNumber;
	}
	
	// setter
//	public void setUserName(ArrayList<String> userName) {
//		this.userName = userName;
//	}
//	public void setTelNumber(ArrayList<String> telNumber) {
//		this.telNumber = telNumber;
//	}

	// method
	public void savePhoneNumber() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		String number = "";

		do {

			System.out.println("�����Ϸ��� -1�� �Է��ϼ���");
			System.out.println("*** �̸��� �Է��ϼ��� ***\n");
			name = sc.nextLine();

			if (!name.equals("-1")) {
				System.out.println("*** ��ȭ��ȣ�� �Է��ϼ��� ***\\n");
				number = sc.nextLine();

				this.userName.add(name);
				this.telNumber.add(number);
			}

		} while (!name.equals("-1"));

		sc.close();
	}

	public void showInfo() {
		System.out.println("-----------------------------");
		for (int i = 0; i < userName.size(); i++) {
			System.out.print("[" + userName.get(i) + "] :\t");
			System.out.println(telNumber.get(i));
		}
		System.out.println("-----------------------------");
	}

}
