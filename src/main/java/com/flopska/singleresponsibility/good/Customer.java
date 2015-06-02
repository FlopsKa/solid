package com.flopska.singleresponsibility.good;

public class Customer {
	FileLogger myLogger = new FileLogger();

	public void add() {
		try {
			// do some database stuff here
		} catch(Exception e) {
			myLogger.handle("database error");
		}
	}
}
