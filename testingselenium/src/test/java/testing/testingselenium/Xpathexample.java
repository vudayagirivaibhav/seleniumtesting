package testing.testingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("vvaibhavgr8@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("fsadsa");
	
		

	}

}
