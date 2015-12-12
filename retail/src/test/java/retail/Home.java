package retail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Home 
{
	
	WebDriver driver;
	public Home(WebDriver driver)
	{
      this.driver=driver;		
	}
	public void open()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.retailmenot.com/");
	}
    public void selectdeal()
    {
    	driver.findElement(By.id("menu")).click();
		driver.findElement(By.linkText("Product Deals")).click();
    	
    }
}
