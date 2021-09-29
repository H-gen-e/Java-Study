//package ch03;
//
//// Thread.MIN_PRIORITY(1) ~ Thread.MAX_PRIORITY(10)
//// 디폴트 우선순위 : 5
//// 우선순위가 높은 thread가 cpu의 배분을 받을 확률이 높다.
//// setPriority(), getPriority() 를 통해 쓰레드의 우선순위를 조절
//
//class PriorityThread extends Thread{
//	
//	@Override
//	public void run() {
//		int sum = 0;
//		Thread t = Thread.currentThread();
//		System.out.println(t+" start");
//		for(int i=0;i<100000;i++) {
//			sum += i;
//		}
//		System.out.println(t.getPriority()+" : end");
//	}
//}
//
//public class PriorityTest {
//
//	public static void main(String[] args) {
//		int i;
////		for(i=Thread.MIN_PRIORITY;i<=Thread.MAX_PRIORITY;i++) {
////			
////			PriorityThread pt = new PriorityThread();
////			// 쓰레드의 우선순위를 지정하는 방법
////			pt.setPriority(i);
////			pt.start();
////			
////		}
//		
//		PriorityThread pt1 = new PriorityThread();
//		pt1.setPriority(1);
//		PriorityThread pt2 = new PriorityThread();
//		pt2.setPriority(5);
//		PriorityThread pt3 = new PriorityThread();
//		pt3.setPriority(10);
//
//		pt1.start();
//		pt2.start();
//		pt3.start();
//	}
//
//}
