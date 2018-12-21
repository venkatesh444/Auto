package Socialmedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FB1 {

	@Test
	public void face()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com");
	}
	
	
}
