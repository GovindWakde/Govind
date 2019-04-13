package com.banctec.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class TestDemo 
{
	
	
  

@Parameters({"Browser"})
@Test
  public void browser(String m1)
  {
	  System.out.println("This is parameter "+m1);
  }
  
  
  
  @Test
  public void f()
  {
	  System.out.println("I am in Test Case");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("I am in before Test");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("I am in after Test");
  }

}
