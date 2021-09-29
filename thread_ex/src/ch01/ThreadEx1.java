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

// Thread(runnable target) : 새로운 객체 생성으로 쓰레드를 생성한다.
// runnable 데이터 타입을 통해 쓰레드를 생성하는 이유는 java의 특성상 단일상속 밖에
// 되지 않기 때문에, Thread 클래스를 상속받아 Thread 를 생성하는 것이
// 불가능하기 때문이다.