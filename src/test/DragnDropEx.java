package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class DragnDropEx {

	private static WebElement From;
	private static WebElement To;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		

		WebElement bank= driver.findElement(By.xpath("//li[@id='credit2']/a"));
		
		WebElement account= driver.findElement(By.xpath("//ol[@id='bank']/li"));


		Actions act= new Actions(driver);
	 
	
		act.dragAndDrop(bank, account).build().perform();//drag and drop source:bank,destination :account.

	}

}
