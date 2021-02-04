package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test	
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "driver_lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	}

}
