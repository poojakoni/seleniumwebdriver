package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidowsnTabsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String ParentWin = driver.getWindowHandle();
		System.out.println("Before Clicking Tab button the win is " + ParentWin);
		
		WebElement Tab = driver.findElement(By.id("tabButton"));
		Tab.click();
		
		System.out.println("After clicking the tab button");
		
		Set<String> allWins = driver.getWindowHandles();//set:uniqe values stored inside the set. set is collection
		
		for (String win : allWins) {
		    
			System.out.println(win);
			
			if(!win.equals(ParentWin)) {//not equals to parent window
				driver.switchTo().window(win);
			}
		}
		
		
		WebElement childHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println(childHeader.getText());
		driver.close(); //Closing child tab
		
		driver.switchTo().window(ParentWin);//Continuing parent tab
		
		WebElement winbutton = driver.findElement(By.id("windowButton"));
		winbutton.click();
		
		driver.quit();//will close all windows or come out from all
	}

}
