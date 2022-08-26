package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobile {
	@FindBy(xpath=("(//div[@class=\"eFQ30H\"])[1]")) private WebElement Mob;
	 public Mobile(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public void clk_Mobile()
	 {
		 Mob.click();
	 }

}
