package Selenium.Framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSet {

	WebDriver driver;
	String browser;

	public DriverSet(WebDriver driver, String browser) {
		this.driver = driver;
		this.browser = browser;
	}

	public WebDriver browserSelect() {
		try {
			if (browser == "firefox") {
				driver = new FirefoxDriver();

			} else if (browser == "chrome") {
				driver = new ChromeDriver();
			}
		} catch (Exception e) {
			System.out.println(browser + " is not a valid browser");
			e.printStackTrace();
		}
		return driver;
	}

}
