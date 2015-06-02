package com.flopska.dependencyinversion.good;

public class Switch {

	private SwitchClient client;
	private boolean pressed;
	
	public Switch(SwitchClient client) {
		this.client = client;
	}
	
	private void pressSwitch() {
		pressed = !pressed;
		if(pressed) {
			client.setOn();
		} else {
			client.setOff();
		}
	}
}
