package com.flopska.singleresponsibility.good;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import lombok.extern.java.Log;

@Log
public class FileLogger {

	public void handle(String error) {
		FileHandler fh;

		try {
			fh = new FileHandler("MyLogFile.log");
			log.addHandler(fh);

			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);

			log.info(error);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
