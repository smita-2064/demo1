package handlingOfDynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElements {
	public static void  main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Apple mobile");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        String ratings=driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[4]")).getText();
        System.out.println(ratings);
        Thread.sleep(2000);
        driver.quit();
        

}
}
