package Locators;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {
		
		
				
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.google.co.in/");
				//driver.findElement(By.xpath("//input[@name=\"q\"]")).//sendKeys("NIlesh Bargaje");
				driver.findElement(By.name("q")).sendKeys("Nilesh Bargaje");
				//Thread.sleep(01);
				//driver.findElement(By.className("gNO89b")).click();
				//driver.findElement(By.linkText("Google Search")).click();
				//driver.findElement(By.name("btnK")).click();
				//driver.findElement(By.id("gNO89b")).click();
				//driver.findElement(By.linkText("Gmail")).click();
				driver.findElement(By.cssSelector("#submit")).click();
			}

		}
 


