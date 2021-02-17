package com.qa.sut.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigProp {
	static FileInputStream fis;
	public static String readProp(String propName)
	{
		
		 String propFilePath=System.getProperty("user.dir")+"\\Config\\config.properties";
		 System.out.println(propFilePath);
		try {
			fis=new FileInputStream(propFilePath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		Properties prop=new Properties();
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String propValue=prop.getProperty(propName);
		return propValue;
		
	}
 

}
