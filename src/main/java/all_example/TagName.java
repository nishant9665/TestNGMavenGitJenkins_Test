package all_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com/ncr");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
 
        WebElement searchBox = driver.findElement(By.name("q"));
        String tagName = searchBox.getTagName();        
        System.out.println("Tag Name : " + tagName);
 
        driver.quit();
	}

}
