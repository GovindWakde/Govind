package com.exela.TestCases;

import com.exela.Application.CreateNewTask;
import com.exela.Application.LoginPage;

public class CreateNewTaskTestCases {

	public static void main(String[] args) throws InterruptedException
	{
		CreateNewTask newtaskobj=new CreateNewTask();
		newtaskobj.launchBrowser("CHROME");
		LoginPage loginobj=new LoginPage();
		loginobj.loginSuccessfull("govind", "govind123");
		newtaskobj.getNewCustomer();
		
		

	}

}
