//package ch01;
//
//import javax.swing.JFrame;
//
//class MyRunnable extends JFrame {
//
//	Runnable runnable = new Runnable() {
//
//		@Override
//		public void run() {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("--");
//
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	};
//
//	public MyRunnable() {
////		runnable.run();
//	}
//}
//
//public class RunnableTest2 {
//
//	public static void main(String[] args) {
//		MyRunnable run = new MyRunnable();
//		run.runnable.run();
//	}
//
//}
