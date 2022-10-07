package testng_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClearTrip_Test {
	public WebDriver driver;
	 @BeforeMethod
	    public void setUP() {
	    	
	    	
		System.setProperty("webdriver.chrome.driver", ".//All-Exe//chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
	    }
	    
	    
		@Test
		public void clearTrip_Login() throws Exception {	
			
		driver.findElement(By.xpath("//div[@class='pt-6 pb-6 flex flex-top flex-between ']/div[2]")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//div/h4[contains(text(),'From')]//following::div[1]/div/div[1]")).sendKeys("New");
		
		}
		
}
