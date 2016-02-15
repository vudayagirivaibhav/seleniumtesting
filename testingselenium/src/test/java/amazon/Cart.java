package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cart {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com/");
		String num ="";
      num = driver.findElement(By.id("nav-cart-count")).getText();
 
 int count = Integer.parseInt(num);
 
 if (count ==0)
 {
	 System.out.println("No error. initial cart count is 0");
 }
		
 else{
	 
	 System.out.println("Error. The initial cart count is " +count);
 }

 
 //Searching item 
 
   System.out.println(" Searching srtarts for Learning Selenium Testing Tools - Third Edition");
 
 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
 
 search.sendKeys("Learning Selenium Testing Tools - Third Edition" +Keys.RETURN);
 
 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
 
 String url1 = driver.getCurrentUrl();
 if(url1.compareTo("http://www.amazon.com/") !=0){
	 
	 System.out.println("New Page loaded");
 }
 else
 {
	 System.out.println(" Still old page");
	 System.exit(1);
 }
 
 // Add cart 
 
 driver.findElement(By.id("result_0")).findElement(By.cssSelector(".a-link-normal.s-access-detail-page.a-text-normal")).click();

 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
 String url2 = driver.getCurrentUrl();
 if(url2.compareTo(url1) !=0){
	 
	 System.out.println("New Page loaded");
 }
 else
 {
	 System.out.println(" Still old page");
	 System.exit(1);
 }
 System.out.println();
 WebElement addToCart = driver.findElement(By.id("submit.add-to-cart"));
 addToCart.click();
 
 
 System.out.println("PASS");

 System.out.print("Verifying final cart contents...");
 num = driver.findElement(By.id("nav-cart-count")).getText();
 count = Integer.parseInt(num);
 if (count == 1) {
     System.out.println("Yes test passed. The number is:" +count);
 } else {
     
     System.err.println("Wrong count: The expected is 1 , but the actual count is :" + count);
     System.exit(3);
 }

 System.out.println("All tests passed.");
 driver.quit();
 
 
 
 
 
 
 
 
 
 
	}

}
