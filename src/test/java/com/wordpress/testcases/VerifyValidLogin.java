package com.wordpress.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

@Test
public class VerifyValidLogin {
	
	public void verifyValidLogin() {
		
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage login= new LoginPage(driver);
//		login.typeUserName();
//		login.typePassword();
//		login.submitButton();
		
		login.parameterizedLoginPage("admin", "demo123");
		
//		driver.findElement(By.xpath("//*contains(text(),'Posts')]")).click();
		driver.findElement(By.linkText("Please update now")).click();
	
		
//		driver.quit();
	
	}

	
	

}
