package com.flopska.liskovsubstitution.good;

import lombok.Data;

@Data
public class Square implements ComputableArea {
	
	private int width;

	public int getArea() {
		return width * width;
	}

	
}
