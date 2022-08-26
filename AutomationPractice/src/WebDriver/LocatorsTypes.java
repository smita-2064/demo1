package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTypes {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("smita@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("762");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
