package ch03;

import java.util.Scanner;

class Login extends Thread {

	boolean flag = true;

	@Override
	public void run() {
		while (flag) {
			System.out.println("�ε���...");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class TrrminatedThread {

	public static void main(String[] args) {
		int usrInput;
		
		Login login = new Login();
		login.start();
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("������ �����ϰ������, 0�� �Է����ּ���.");
			usrInput = sc.nextInt();
			if(usrInput == 0) {
				login.flag = false;
			}
			
		} while (login.flag == true);
		
		sc.close();
	}
}
