package ch03;

public class MainTest {

	public static void main(String[] args) {
		Activity1 activity1 = new Activity1("콜백");
		Activity2 activity2 = new Activity2("콜리");

		activity2.setCallBack(activity1.callBack);

	}

}
