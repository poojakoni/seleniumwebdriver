//using xpath

package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class fblogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement SignUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		SignUp.click(); //xpath (cnl+f)
	

		
		WebElement FName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement LName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement Mobile =  driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	
		FName.sendKeys("Fname");
		LName.sendKeys("Lname");
		Mobile.sendKeys("123456789");
		Password.sendKeys("abc@123");
	
	WebElement day= driver.findElement(By.name("birthday_day")); //drop down for bday date
	Select dday= new Select(day);
	dday.selectByVisibleText("20");
	
	
	WebElement month= driver.findElement(By.name("birthday_month"));
	Select ddmonth= new Select(month);
	ddmonth.selectByVisibleText("Jan");
	
	WebElement year=driver.findElement(By.name("birthday_year"));
	Select dyear= new Select(year);
	dyear.selectByVisibleText("2000");
	
	System.out.println("Selected month is"+ ddmonth.getFirstSelectedOption().getText());
	
	List<WebElement> months1= ddmonth.getOptions();
	 //for(WebElement elm:months1) {
		// System.out.println(elm.getText());
	//}
	
	List<WebElement>AllMonths=driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
	for(WebElement elm:AllMonths) {
		
		
			System.out.println(elm.getText());	
	}
	
		
		
	String Gender = "Male";
	
	WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));//radio button 
	WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
	WebElement Other = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
	
	if(Gender.equals("Female")) {
		Female.click();
	}else if(Gender.equals("Male")) {
		Male.click();
	}else {
		Other.click();
	}

	//String xpath = "//label[text() = 'placeholder']/following-sibling::input";
	//xpath.replace("placeholder",Gender);
	
	
	//WebElement GendgerRadioBtn = driver.findElement(By.xpath(xpath));
	//GendgerRadioBtn.click();
	
	}

}
