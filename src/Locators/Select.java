package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {
	
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://www.google.com");
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("https://demoqa.com/automation-practice-form");
	    driver.findElement(By.className("gNO89b")).click();
		((WebElement) driver.findElements(By.className("iUh30 gBIQub tjvcx"))).click();
		
		
		
		
	}

}
