package credo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver  driver = new FirefoxDriver();
		driver.get("http://www.credomobile.com");
		driver.findElement(By.cssSelector(".banner.l")).click();
         List noPhones =   driver.findElements(By.cssSelector(".border"));
         
         
         System.out.println("The Number of phone frames:" +noPhones.size());

        
	
	}
}
