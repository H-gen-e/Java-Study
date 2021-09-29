package ch03;

import java.util.Scanner;

class MyThread extends Thread{
	
	boolean flag = true;
	
	@Override
	public void run() {
		
		while(flag) {
			System.out.print("-");
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TerminatedThread {

	public static void main(String[] args) {
		
		System.out.println("�۾��ڸ� �����ϰڽ��ϴ�.");
		
		MyThread mt1 = new MyThread();
		mt1.start();
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
			System.out.println("�����Ϸ��� 0���� �Է��Ͻÿ�");
			int usrInput = sc.nextInt();
			
			if(usrInput == 0) {
//				mt1.stop();
				mt1.flag = false;
			}
			
		} while (mt1.flag == true);
		
		sc.close();
		
	}

}
