//package ch03;
//
//// Thread.MIN_PRIORITY(1) ~ Thread.MAX_PRIORITY(10)
//// ����Ʈ �켱���� : 5
//// �켱������ ���� thread�� cpu�� ����� ���� Ȯ���� ����.
//// setPriority(), getPriority() �� ���� �������� �켱������ ����
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
////			// �������� �켱������ �����ϴ� ���
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
