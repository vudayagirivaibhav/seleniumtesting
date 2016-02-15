package testing.testingselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myclass {

	public static void main(String args[]){
		
		WebDriver driver = new FirefoxDriver();  //driver object is initaniated
		
	String baseUrl = "http://newtours.demoaut.com/";
	String expectedTitle = "Welcome: Mercur Tours";
	String actualTitle = " ";
	
	driver.get(baseUrl);  // is used to launch new nrowser session and directs its to url 
	actualTitle = driver.getTitle();
	
	if(actualTitle.contentEquals(expectedTitle)){
		System.out.println("Test Passed!");
	}
	else{
		System.out.println("Test Failed");
	}
	
	
	driver.close();
	
	System.exit(0);
	
		
	}
}
