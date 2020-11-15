package oop;

public class TestFan {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		fan1.setSpeed(fan1.SLOW);
		fan1.setRadius(9);
		fan1.setColor(" GREEN ");
		fan1.setSwitchedOn(true);

		fan2.setSpeed(fan2.FAST);
		fan2.setRadius(5);
		fan2.setColor(" Pink ");
		fan2.setSwitchedOn(false);

		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}
}
