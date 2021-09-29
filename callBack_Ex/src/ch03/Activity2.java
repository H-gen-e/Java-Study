package ch03;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Activity2 extends BaseActivity {

	CallBack callBack;

	public void setCallBack(CallBack callBack) {
		this.callBack = callBack;
	}

	public Activity2(String name) {
		super(name);
		addEventListener();
	}

	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		super.panel.setBackground(Color.yellow);
	}

	public void addEventListener() {
		this.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				callBack.checkPosition(x, y);
			}

		});
	}

}
