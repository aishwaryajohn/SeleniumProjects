package Selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling {
	
//choose and get age
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
			WebDriver wb = new ChromeDriver();
			//WebDriver wb;
			//WebDriverManager.Chromedriver().setup();
			//wb= new ChromeDriver();
			//String ExpectedTitle= "OrangeHRM";
			wb.navigate().to("https://demoqa.com/webtables");
			//wb.findElement(By.xpath("//*[@class=\"rt-tr -odd\"]//preceding-sibling::div[3]")).click();
			//List<WebElement> Age= wb.findElements(By.xpath("//*[@class=\"rt-tr -odd\"]//following-sibling::div[3]"));
		    Thread.sleep(3000);
			//System.out.println(Age.get(0));
		System.out.println(wb.findElement(By.xpath("//*[@class=\"rt-tr -odd\"]//following-sibling::div[2]")).getText());
			
	}

}
