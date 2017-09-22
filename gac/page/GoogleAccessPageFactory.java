package gac.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleAccessPageFactory {
	WebDriver driver;

	@FindBy(id = "gb_70")
	WebElement siginButtonGoogle;

	@FindBy(id = "gs_htif0")
	WebElement searchTextBoxGoogle;

	public GoogleAccessPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickSignInButton() {
		siginButtonGoogle.click();
	}

}
