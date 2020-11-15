package oop;

public class Fan {
	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;

	private int speed = SLOW;
	private boolean switchedOn = false;
	private double radius = 5;
	private String color = "Blue";

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean getSwitchedOn() {
		return this.switchedOn;
	}

	public void setSwitchedOn(boolean switchedOn) {
		this.switchedOn = switchedOn;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {

		if (this.switchedOn == false) {
			return this.color + this.radius + "\nThe fan is off!";
		} else {
			return this.speed + this.color + this.radius;
		}

	}

}