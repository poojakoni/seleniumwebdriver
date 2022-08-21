package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class onlineclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://learndigital.withgoogle.com/digitalgarage/courses");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		WebElement Signin =driver.findElement(By.linkText("Sign in"));
		Signin.click();
	
		WebElement email =driver.findElement(By.id("mat-input-0"));
		email.sendKeys("abc@xyz.xom");
		
		WebElement password =driver.findElement(By.id("mat-input-1"));
		password.sendKeys("12309");
		
		
	}

}
