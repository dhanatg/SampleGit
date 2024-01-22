package org.app.locator;

import org.app.base.BaseClassTask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorTask extends BaseClassTask{
static WebDriver driver;
	
	public static WebElement getusername()
	{
		return driver.findElement(By.id("email"));	
		
	}
	
	public static WebElement getpassword() {
		return driver.findElement(By.id("pass"));
		
	}
	
	public static WebElement getloginbutton() {
		return driver.findElement(By.name("login"));
		
	}
	
}

