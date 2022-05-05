package Selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PageUpAndDown {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		//WebDriverManager.chrome.driver.setup();
		WebDriver wb= new ChromeDriver();
		wb.navigate().to("https://demoqa.com/browser-windows");wb.manage().window().maximize(); //Used to maximize the tab
		Actions act = new Actions(wb);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).build().perform();

}}
