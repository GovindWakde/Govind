package com.exela.TestCases;

import com.exela.Application.LoginPage;

public class LoginTestCases {

	public static void main(String[] args) throws InterruptedException
	{
		LoginPage loginobj=new LoginPage();
		loginobj.launchBrowser("CHROME");
		loginobj.loginSuccessfull("admin", "manager");
		
		System.out.println("Login Sucessfully completed......");
		Thread.sleep(3000);
		loginobj.logout();
		
		

	}

}
