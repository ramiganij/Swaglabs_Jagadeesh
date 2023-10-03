package swaglabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMFindBy {
	@FindBy(id="user-name")WebElement username;
	@FindBy(id="password")WebElement password;
	@FindBy(id="login-button")WebElement login;
	

}
