package xyzFinalLuc10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class MyClass {	
	
	WebDriver driver= new EdgeDriver();
	
	SoftAssert Assert = new SoftAssert();
	
	 @BeforeTest
	 public void mySetup() {
	
		 driver.get("https://www.google.com");
		 
	 } 
	 
	 @Test()
	 public void testOne() {
		 driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("ahmad aburob"+Keys.ENTER);
		String sarch_result= driver.findElement(By.id("result-stats")).getText();
		
		String SpiltedText[]=sarch_result.split(" ");
		String thenum_of_the_search_result=SpiltedText[1];
	
		String the_unm_update= thenum_of_the_search_result.replace(",", "");
	
		int Actuall=	Integer.parseInt(the_unm_update);
		int Exbected=10;

	Assert.assertEquals(Actuall, Exbected);
		Assert.assertAll();
				
							
	 }
	 
	 
	 @AfterTest
	 public void theEnd() {
	 driver.close();
	 }
}
