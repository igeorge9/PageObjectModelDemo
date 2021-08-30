package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
By username=By.id("user_login");
By password=By.xpath("//input[@id='user_pass']");
By loginbtn=By.xpath("//input[@value='Log In']");

public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
	
public void parameterizedLoginPage(String userid,String pass)
{
	driver.findElement(username).sendKeys(userid);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(loginbtn).click();
}
/*public void typeUserName()
{
	driver.findElement(username).sendKeys("admin");
}
public void typePassword()
{
	driver.findElement(password).sendKeys("demo123");
}
public void submitButton() 
{
	driver.findElement(loginbtn).click();
}*/
}
