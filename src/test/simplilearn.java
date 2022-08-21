
//simple path 
package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplilearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		
		// Step1. Click  on the Login Link
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		//Step2: Enter Username
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");
		
		
		//Step3: Enter Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test@1234");
		
		//Step4 Click Remember Me checkbox
		WebElement Checkbox=driver.findElement(By.className("rememberMe"));
        Checkbox.click();
		
		//Step5: Click pn Login Button
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
		
		//Step6: Validate the error message on screen
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActError = Error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
		if(ActError.equals(ExpError)) {
			System.out.println("TC PAssed");
		}else {
			System.out.println("Tc Failed");
		}
		
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total num of links are " + Links.size());
		
		for(int index=0;index<Links.size();index++) {
			
			System.out.println(Links.get(index).getAttribute("href"));
			
		}
				
	}}
