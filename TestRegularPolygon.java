package oop;

public class TestRegularPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon RP1 = new RegularPolygon();
		RegularPolygon RP2 = new RegularPolygon(5, 1.5);
		RegularPolygon RP3 = new RegularPolygon(4, 2.5, 3, 3);

		System.out.println("regP1 perimeter: " + RP1.getPerimeter() + "\nregP1 area: " + RP1.getArea());
		System.out.println("regP2 perimeter: " + RP2.getPerimeter() + "\nregP2 area: " + RP2.getArea());
		System.out.println("regP3 perimeter: " + RP3.getPerimeter() + "\nregP3 area: " + RP3.getArea());
	}

}
