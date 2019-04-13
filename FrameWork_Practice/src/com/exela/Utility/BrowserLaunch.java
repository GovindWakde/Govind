package com.exela.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch
{
	public static WebDriver driver;
	
	public void launchBrowser(String browsername) throws InterruptedException
	{
		
		
		if(browsername=="CHROME")
		{
			System.setProperty("webdriver.chrome.driver", ".\\Resource\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("http://localhost/user/submit_tt.do");
			//driver.get("http://toolsqa.com/automation-practice-form/");		
			
		}else if(browsername=="FIREFOX")
		{
			System.setProperty("webdriver.gecko.driver", ".\\Resource\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}
	}
	

}
