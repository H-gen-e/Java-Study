//package ch01;
//
//import javax.swing.JFrame;
//
//// runnable �������̽��� �����Ͽ� ������ �����ϱ�
//class MyRunnable extends JFrame implements Runnable{
//
//	@Override
//	public void run() {
//		for(int i=0;i<200;i++) {
//			System.out.print(i+"\t");
//		}
//	}
//	
//}
//
//public class RunableTest1 {
//
//	public static void main(String[] args) {
//		MyRunnable myRunnable = new MyRunnable();
//		
//		// Runnable �����
//		// Runnable �� ������ ��ü�� Thread �� �����ؼ� 
//		// �Ű������� ��� �����带 �����Ѵ�(start())
//		Thread th1 = new Thread(myRunnable);
//		th1.start();
//	}
//
//}
