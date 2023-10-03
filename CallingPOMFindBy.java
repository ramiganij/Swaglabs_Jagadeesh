package swaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.PageFactory;

public class CallingPOMFindBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jaggubhai\\Desktop\\selenim\\jars\\msedgedriver.exe");

		EdgeOptions edgeOptions = new EdgeOptions();

		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.saucedemo.com/");
		POMFindBy p=PageFactory.initElements(driver, POMFindBy.class);
		p.username.isDisplayed();
		p.username.isEnabled();
		p.username.sendKeys("standard_user");
		p.password.isDisplayed();
		p.password.isEnabled();
		p.password.sendKeys("secret_sauce ");
		p.login.isDisplayed();
		p.login.isEnabled();
		p.login.sendKeys("login-button");
		p.login.click();

	}

}
