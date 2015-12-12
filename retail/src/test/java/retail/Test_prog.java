package retail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_prog
{

	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void testing(String br)
	{
		if(br.matches("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(br.matches("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","e:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		Home h=new Home(driver);
		h.open();
		h.selectdeal();
		
		Products p=new Products(driver);
		p.selectproduct();
		p.close();
	}
}
