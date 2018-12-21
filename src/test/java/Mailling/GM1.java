package Mailling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GM1 {
	
	@Test
	public void gm()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.gmail.com");
	}

}
