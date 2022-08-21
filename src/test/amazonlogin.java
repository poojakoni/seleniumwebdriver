package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		WebElement all = driver.findElement(By.xpath("//a[@role='button']"));
		all.click();
		
		WebElement bestsell = driver.findElement(By.xpath("//a[@class='hmenu-item']"));
		bestsell.click();
		
		WebElement AmazonLaunchpad = driver.findElement(By.xpath("//a[contains(text(),'Amazon Launchpad')]"));
		AmazonLaunchpad.click();
	}

}
