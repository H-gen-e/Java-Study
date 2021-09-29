package ch01;


class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+" : "+Thread.currentThread());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		MyThread th3 = new MyThread();
		
		th1.start();
		th2.start();
		th3.start();
	}

}

// Thread(runnable target) : ���ο� ��ü �������� �����带 �����Ѵ�.
// runnable ������ Ÿ���� ���� �����带 �����ϴ� ������ java�� Ư���� ���ϻ�� �ۿ�
// ���� �ʱ� ������, Thread Ŭ������ ��ӹ޾� Thread �� �����ϴ� ����
// �Ұ����ϱ� �����̴�.