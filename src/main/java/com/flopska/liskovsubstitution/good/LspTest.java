package com.flopska.liskovsubstitution.good;

public class LspTest {

	private static Rectangle getNewRectangle() {
		// Object returned by some fancy Factory
		return new Rectangle();
	}
	
	private static Square getNewSquare() {
		// Object returned by some fancy Factory
		return new Square();
	}

	public static void main(String[] args) {
		Rectangle r = getNewRectangle();
		
		r.setWidth(5);
		r.setHeight(10);
		
		System.out.println(r.getArea());
	}
}
