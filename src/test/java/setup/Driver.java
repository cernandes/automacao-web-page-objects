package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public WebDriver WebDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\dev\\page-objects\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		return driver;
	}
}
