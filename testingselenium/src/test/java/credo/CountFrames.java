package credo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver  driver = new FirefoxDriver();
		driver.get("http://www.credomobile.com");
		driver.findElement(By.cssSelector(".banner.l")).click();
         List noPhones =   driver.findElements(By.cssSelector(".border"));
         
         
         System.out.println("The Number of phone frames:" +noPhones.size());
        
       String retail =  driver.findElement(By.cssSelector(".retail-price>span")).getText();
       String newReatilStr = retail.replace("$", "").replace(",", "");
       
       float retailprice = Float.parseFloat(newReatilStr);
  System.out.println(retail);
  System.out.println(newReatilStr);
  System.out.println(retailprice);
  
	
       if(retail == "" || retailprice<0){
    	   System.out.println(" Wrong Retail price");
    	   
       }
       
       else{
    	   System.out.println("correct retail price");
       }
       
       
       List<WebElement> el = driver.findElements(By.cssSelector(".border"));
      
       
       
       el.get(4).findElement(By.cssSelector(".btnSeeDetails.btn-primary.canChangeOrAddHandset")).click();
       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
       
       WebElement zip = driver.findElement(By.cssSelector("#zip"));
       
       zip.sendKeys("95112" +Keys.ENTER);
       
       
       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
       
       System.out.println(" added 4th element to cart");
       
       
       
	}
}
