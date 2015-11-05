package com.icarus.log;

import java.io.FileWriter;
import java.io.IOException;

public class DevLog {
	
	public static final String LOG_FILE = "log.txt";
	
	public static void log(Object message) {
		if (message == null) {
			return;
		}
		
		FileWriter writer = null;
		try {
			writer = new FileWriter(LOG_FILE, true);
			writer.append(message.toString());
			writer.append("\n");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				writer.close();
			} catch (IOException e1) {
			}
		}
	}

}
