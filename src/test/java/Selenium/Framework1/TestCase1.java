package Selenium.Framework1;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import Selenium.Framework1.DriverSet;

public class TestCase1 {
	WebDriver driver;
	String browser = "chrome";

	@Before
	public void setUp() throws Exception {
		DriverSet ds = new DriverSet(driver, browser);
		String baseURL = "http://www.google.com";
		ds.browserSelect();
		this.driver=ds.driver;
        driver.get(baseURL);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@After
	public void tearDown() throws Exception {
	}

}
