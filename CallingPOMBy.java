package swaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class CallingPOMBy {
public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jaggubhai\\Desktop\\selenim\\jars\\msedgedriver.exe");

		EdgeOptions edgeOptions = new EdgeOptions();

		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.saucedemo.com/");
		
		// importing POMBY class by creating object
		POMBY p=new POMBY();
		driver.findElement(p.username).sendKeys("standard_user");
		driver.findElement(p.password).sendKeys("secret_sauce");
		driver.findElement(p.login).click();
		
		

}
}
