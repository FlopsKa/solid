package com.flopska.liskovsubstitution.good;

import lombok.Data;

@Data
public class Rectangle implements ComputableArea {

	protected int width;
	protected int height;
	
	public int getArea() {
		return getWidth() * getHeight();
	}
}
