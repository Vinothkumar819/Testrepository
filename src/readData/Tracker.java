package readData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tracker 
{
	WebDriver driver;
	@BeforeMethod
	public void launchURL() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://thawing-shelf-73260.herokuapp.com/index.jsp");
		WebElement text=driver.findElement(By.id("login"));
		text.sendKeys("kumarvinoth");
		WebElement t=driver.findElement(By.id("password"));
		t.sendKeys("vinothplk");
		WebElement t1=driver.findElement(By.id("submit"));
		t1.click();
	}
	
	@Test
	public void Addcatageroy()
	{
		WebElement text=driver.findElement(By.id("name"));
		text.sendKeys("vinoth");
		WebElement t=driver.findElement(By.id("submit"));
		t.click();
		WebElement text1=driver.findElement(By.id("go_list_categories"));
		text1.click();
	}
	
		
		
	}

