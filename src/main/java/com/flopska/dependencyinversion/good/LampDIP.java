package com.flopska.dependencyinversion.good;

public class LampDIP implements SwitchClient {

	private boolean shines = false;

	public void setOn() {
		this.shines = true;
	}

	public void setOff() {
		this.shines = false;
	}

}
