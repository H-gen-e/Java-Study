package ch03;

import java.awt.Color;

public class Activity1 extends BaseActivity {

	CallBack callBack = new CallBack() {

		@Override
		public void checkPosition(int x, int y) {
			System.out.println("x : " + x);
			System.out.println("y : " + y);
		}
	};

	public Activity1(String name) {
		super(name);
	}

	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		super.panel.setBackground(Color.blue);
	}

}
