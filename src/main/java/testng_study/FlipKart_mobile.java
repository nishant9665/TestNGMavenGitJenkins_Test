package testng_study;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipKart_mobile {

	public WebDriver driver;
	    @BeforeMethod
	    public void setUP() {
	    	
	    	
		System.setProperty("webdriver.chrome.driver", ".//All-Exe//chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
	    }
	    
	    
		@Test
		public <Webelement> void flipkart_Login() throws Exception {	
			
		//driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
	    driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9730501258");
		//driver.findElement(By.xpath("//button[@data-cy='continueBtn']")).click();
	    driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Test@09876");
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	    Thread.sleep(3000);
	    String name =driver.findElement(By.xpath("//div[@class='_1psGvi _3BvnxG']/div/div[contains(text(),'Nishant')]")).getText();
	   
	    Assert.assertEquals(name, "Nishant");
	    
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("moto g");
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	    
	    
		
		 List<WebElement> list =driver.findElements(By. xpath("//div[@class='col col-7-12']/div[@class='_4rR01T']")); 
		 for(int i=0;i<list.size();i++) {
		 if(list.get(i).getText().equals("MOTOROLA G30 (Dark Pearl, 64 GB)")) {			 
			//to perform Scroll on application using Selenium
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 
			// js.executeScript("arguments[0].scrollIntoView();", list.get(i));
			 js.executeScript("window.scrollBy(0,350)", "");
			 list.get(i).click();
			 
			 
			 ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles()); 
			 driver.switchTo().window(tab.get(1));
			 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			 
		 }
		 else {
			 Assert.assertFalse(false,"mobile is not found ");
		 }
		// driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
		 
		 
		 
		 
		
		 
		 }
		 

	    
	    
	    
	   
	    
		}
		
	    
	    
		
		@Test(enabled=false)
		public void mmt_Login() {	
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']")).click();
		driver.findElement(By.id("username")).sendKeys("9730501258");
		driver.findElement(By.xpath("//button[@data-cy='continueBtn']")).click();
	}
		
		
		@Test(enabled=false)
		public void firstTest() throws Exception {

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nishant9665@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@09876");
	
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		String userName =driver.findElement(By.xpath("//div[@id='top-header-menu']//span[@class='user-display']")).getText();

		Assert.assertEquals(userName, "nishant narwade");
		driver.quit();
	}

}
