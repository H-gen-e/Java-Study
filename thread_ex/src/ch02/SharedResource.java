package ch02;

// �۾��ڵ��� �ڿ�(������)�� �����ϴ� ��Ȳ�϶� ó���ϴ� ���
class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// �Ա�
	public void saveMoney(int money) {
		
		synchronized (this) {
			int currentMoney = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.setMoney(currentMoney + money);
			System.out.println("�Ա� �� ���� �ܾ� : "+this.getMoney());
		}
	}

	// ���
	public synchronized void widthdrawMoney(int money) {
		int currentMoney = this.getMoney();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (currentMoney >= money) {
			this.setMoney(currentMoney - money);
			System.out.println("��� �� ���� �ܾ� : " + this.getMoney());
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
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
		// �Ա�
		this.account.saveMoney(10_000);
	}
}

class Mother extends Thread {

	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	// ���
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
