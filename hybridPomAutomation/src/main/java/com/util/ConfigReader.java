package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	/**
	 * method to read the properties values
	 * @return
	 */
	public Properties initializeProperites() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return prop;
	}

}
