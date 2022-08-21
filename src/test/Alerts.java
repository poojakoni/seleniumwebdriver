package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement firstbutton=driver.findElement(By.id("alertButton"));//after clicking pop-up will get,so it has to click on pop-up
		firstbutton.click();
		
		Alert alert=driver.switchTo().alert(); //alert is interface
		System.out.println(alert.getText());
		alert.accept();//accept:ok, dismiss:cancel
		
		WebElement cmbutton=driver.findElement(By.id("confirmButton"));
		cmbutton.click();
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();//accept:ok, dismiss:cancel
		
		
		WebElement Button3 = driver.findElement(By.id("promtButton"));
		Button3.clear();
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.sendKeys("Hello World");
		alert.accept();

		
	}

}
