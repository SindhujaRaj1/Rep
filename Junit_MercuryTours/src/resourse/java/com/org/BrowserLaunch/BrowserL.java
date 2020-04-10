package com.org.BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserL {
	protected static WebDriver driver;
	public static WebDriver GetDriver(String browser)
	{
	if(browser.equals("Chrome"))	
	{
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browser.equals("FireFox"))
	{ 
		System.setProperty("webdriver.gecko.driver", "D:/Selenium/geckodriver.exe");
		driver=new FirefoxDriver();
	}
		
	else if(browser.equals("Opera"))
	{ 
		System.setProperty("webdriver.gecko.driver", "D:/Selenium/operadriver_win64/operadriver_win64/operadriver.exe");
		driver=new OperaDriver();
		
	}	driver.manage().window().maximize();
	    String url="http://newtours.demoaut.com/";
		driver.get(url);
		
		return driver;
	}
	public static void select(WebElement a,String b)
	{
		Select s=new Select(a);
		s.selectByVisibleText(b);
	}
	public static void ButtonClick(WebElement c){
		c.click();
	}
	
  public static void radiobutton(WebElement d){
	  d.click();
  }
  public static void sendelement(WebElement e,String f){
	  e.sendKeys(f);
  }
}
