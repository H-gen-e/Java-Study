package ch00;

public class MainTest {

	public static void main(String[] args) {
		MainActivity mainActivity = new MainActivity();
		new SubActivity(mainActivity);
	}

}
