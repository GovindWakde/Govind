package com.temporary.PropertiesfileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertiesFileTest {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		// TODO Auto-generated method stub
		
		Properties pro= new Properties();
		pro.load(new FileInputStream(new File(".\\Resource\\config.properties")));
		
		pro.setProperty("browser","FireFox");
		System.out.println(pro.getProperty("browser"));	
		String s=new String();
		s=pro.getProperty("url", "default value");
		System.out.println(s.toString());
		/*System.out.println(pro.getProperty("url","This is default value"));
		System.out.println(pro.getProperty("abc"));
		System.out.println("I am still getting executed");*/
		
		
	/* This code should be contain all the details so we need to load thes details before browser load;
		so we need to create them as static global like as webdriver so we can use to over then project*/
		
		

	}

}
