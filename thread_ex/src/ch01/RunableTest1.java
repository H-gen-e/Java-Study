//package ch01;
//
//import javax.swing.JFrame;
//
//// runnable 인터페이스를 구현하여 쓰레드 생성하기
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
//		// Runnable 사용방법
//		// Runnable 을 구현한 객체는 Thread 를 생성해서 
//		// 매개변수에 담고 쓰레드를 시작한다(start())
//		Thread th1 = new Thread(myRunnable);
//		th1.start();
//	}
//
//}
