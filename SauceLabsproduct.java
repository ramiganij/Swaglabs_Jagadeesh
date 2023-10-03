package swaglabs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceLabsproduct {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jaggubhai\\Desktop\\selenim\\jars\\msedgedriver.exe");

		EdgeOptions edgeOptions = new EdgeOptions();

		WebDriver driverEdge = new EdgeDriver(edgeOptions);
		driverEdge.get("https://www.saucedemo.com/");
		// Login Page
		driverEdge.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement password=driverEdge.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login=driverEdge.findElement(By.id("login-button"));
		login.click();
		// Sauce Labs Backpack Product
		driverEdge.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		//Add to Cart Functionality 
		driverEdge.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		// Remove from cart functionality 
		driverEdge.findElement(By.id("remove-sauce-labs-backpack")).click();
		// Cart Symbol functionality
		WebElement cart=driverEdge.findElement(By.cssSelector("#shopping_cart_container > a"));
		cart.click();
		// Checkout Button
		driverEdge.findElement(By.id("checkout")).click();
		//checkout details
		driverEdge.findElement(By.id("first-name")).sendKeys("Jagadeesh");
		driverEdge.findElement(By.id("last-name")).sendKeys("jaggu");
		driverEdge.findElement(By.id("postal-code")).sendKeys("500081");
		driverEdge.findElement(By.id("continue")).click();
		//Checkout Overview
		driverEdge.findElement(By.id("finish")).click();
		// Back to Homepage
		driverEdge.findElement(By.id("back-to-products")).click();
		
		
		
		
		
		
		

	}

}
