package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {

		File src = new File("./Configuration/config.properties");
		// src is a variable which is referring to config.properties file

		try {
			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();
			// pro is a object of Properties file through which WE CAN LOAD THE CONFIG FILE
			// INSIDE THE CONSTRUCTOR

			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	//create methods to read and return value
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxPath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getMsEdgePath() {
		String msedgepath = pro.getProperty("msedgepath");
		return msedgepath;
	}

}
