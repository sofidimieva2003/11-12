package oop;

public class RegularPolygon {
	private int n = 3;
	private double sideLength = 1;
	private double x = 0;
	private double y = 0;

	RegularPolygon() {

	}

	RegularPolygon(int n, double sideLength) {
		this.n = n;
		this.sideLength = sideLength;
	}

	RegularPolygon(int n, double sideLength, double x, double y) {
		this.n = n;
		this.sideLength = sideLength;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return this.n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSideLength() {
		return this.sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getPerimeter() {
		return this.n * this.sideLength;
	}

	public double getArea() {
		return this.n * this.sideLength * this.sideLength / (4 * Math.tan(Math.PI / this.n));
	}

}
