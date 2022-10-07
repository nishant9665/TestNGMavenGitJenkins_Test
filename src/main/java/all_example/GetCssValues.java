package all_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCssValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		 By bySearchButton = By.name("btnK");
		WebElement googleSearchBtn = driver.findElement(bySearchButton); 
		System.out.println("Color of a button before mouse hover: "	+ googleSearchBtn.getCssValue("color"));
		//Actions action = new Actions(driver);
		//action.moveToElement(googleSearchBtn).perform();
		//System.out.println("Color of a button after mouse hover : "	+ googleSearchBtn.getCssValue("color"));

	}

}
