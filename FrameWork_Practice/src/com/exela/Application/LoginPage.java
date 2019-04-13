package com.exela.Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.exela.Utility.BrowserLaunch;

public class LoginPage extends BrowserLaunch
{
	public WebElement getUsername()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		return username;
	}
	
	public WebElement getPassword()
	{
	    WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
	    return password;
		
	}
	
	public WebElement getLoginButton()
	{
	    WebElement loginbutton=driver.findElement(By.id("loginButton"));
	    return loginbutton;
		
	}
	
	public void loginSuccessfull(String username, String password)
	{
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginButton().click();
	}
	
	public WebElement getLogout()
	{
		WebElement logout=driver.findElement(By.xpath("//a[@id='logoutLink']"));
		return logout;		
	}
	
	public void logout()
	{
		getLogout().click();
	}
	
	
	public void loginwithoutusername(String password)
	{
		getPassword().sendKeys(password);
		getLoginButton().click();
	}
	public void loginwithoutpasswword(String username)
	{
		getUsername().sendKeys(username);
		getLoginButton().click();
	}
	public void withoutuserandpassword()
	{
		getLoginButton().click();		
	}


}
