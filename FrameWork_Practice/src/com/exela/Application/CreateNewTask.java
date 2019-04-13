package com.exela.Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.exela.Utility.BrowserLaunch;

public class CreateNewTask extends BrowserLaunch
{
	public WebElement getNewCustomer()
	{
		//driver.findElement(By.xpath("//div[@class='gettingStartedShortcutsLabel']")).click();;
		WebElement newtask=driver.findElement(By.xpath("//span[@class='dashedLink']"));
		return newtask;
	}
	
	public void newCustomer()
	{
		getNewCustomer().click();
	}

}
