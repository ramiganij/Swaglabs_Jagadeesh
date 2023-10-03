package swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SocialLogos {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jaggubhai\\Desktop\\selenim\\jars\\msedgedriver.exe");

		EdgeOptions edgeOptions = new EdgeOptions();

		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.saucedemo.com/");
		// Login Page
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//social Network functionalities
		driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a")).click();

	}

}
