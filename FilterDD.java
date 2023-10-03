package swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class FilterDD {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jaggubhai\\Desktop\\selenim\\jars\\msedgedriver.exe");

		EdgeOptions edgeOptions = new EdgeOptions();

		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.saucedemo.com/");
		// Login Page
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//filter dropdown selection
		WebElement filter=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		filter.click();
		Select filterdrop=new Select(filter);
		filterdrop.selectByVisibleText("Name (Z to A)");
		filterdrop.selectByVisibleText("Price (low to high)");

	}

}
