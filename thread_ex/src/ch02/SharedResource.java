package ch02;

// 작업자들이 자원(데이터)를 공유하는 상황일때 처리하는 방법
class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금
	public void saveMoney(int money) {
		
		synchronized (this) {
			int currentMoney = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.setMoney(currentMoney + money);
			System.out.println("입금 후 계좌 잔액 : "+this.getMoney());
		}
	}

	// 출금
	public synchronized void widthdrawMoney(int money) {
		int currentMoney = this.getMoney();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (currentMoney >= money) {
			this.setMoney(currentMoney - money);
			System.out.println("출금 후 계좌 잔액 : " + this.getMoney());
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}

class Father extends Thread {

	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// 입금
		this.account.saveMoney(10_000);
	}
}

class Mother extends Thread {

	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	// 출금
	@Override
	public void run() {
		this.account.widthdrawMoney(5_000);
	}

}

public class SharedResource {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		Father father = new Father(account);
		Mother mother = new Mother(account);

		father.start();
		mother.start();
	}

}
