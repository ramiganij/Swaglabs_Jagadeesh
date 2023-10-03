package swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SideMenu {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jaggubhai\\Desktop\\selenim\\jars\\msedgedriver.exe");

		EdgeOptions edgeOptions = new EdgeOptions();

		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.saucedemo.com/");
		// Login Page
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//sidebar menu
		driver.findElement(By.id("react-burger-menu-btn")).click();
		//"about" option
		driver.findElement(By.id("about_sidebar_link")).click();
		driver.navigate().back();
		//"logout" option
		driver.findElement(By.id("logout_sidebar_link")).click();
		
				
	}

}
