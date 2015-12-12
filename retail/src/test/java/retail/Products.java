package retail;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products
{
	WebDriver driver;
	
	public Products(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void selectproduct()
	{
		driver.findElement(By.linkText("Electronics")).click();
		 WebElement e=driver.findElement(By.id("Electronics"));
		List<WebElement> a=e.findElements(By.tagName("img"));
		System.out.println(a.size());
		
	}
	public void close()
	{
		driver.close();
	}

}
