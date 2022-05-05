package Selenium;
import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.web.Values;
import org.openqa.selenium.support.ui.Select;

public class Demoqa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		//WebDriver wb;
		//WebDriverManager.Chromedriver().setup();
		//wb= new ChromeDriver();
		//String ExpectedTitle= "OrangeHRM";
		wb.navigate().to("https://demoqa.com/upload-download");
		wb.findElement(By.xpath("//*[@id='uploadFile']")).sendKeys("C:/Users/Moolya/Downloads/dummy.docx");
	}}
