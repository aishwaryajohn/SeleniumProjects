package Selenium;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class NewTabOpen {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		//WebDriverManager.chrome.driver.setup();
		WebDriver wb= new ChromeDriver();
		wb.navigate().to("https://www.google.com");
		wb.manage().window().maximize(); //Used to maximize the tab
		//WebElement link = wb.findElement(By.partialLinkText("Gmail"));
		Actions act = new Actions(wb);
		WebElement link1 = wb.findElement(By.linkText("Gmail"));
		act.contextClick(link1).build().perform();
		
		//action.perform();
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(MenuKeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(MenuKeyEvent.VK_ENTER);
		Thread.sleep(3000);
		robot.keyPress(MenuKeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(MenuKeyEvent.VK_TAB);
		
		String pTab = wb.getWindowHandle();
		Set<String> tabs = wb.getWindowHandles();
		 System.out.println(tabs);
		 //for enhanced loop for one part
		 for(String Handles: tabs)
		 {
			
			 wb.switchTo().window(Handles);
			
				wb.get("https://opensource-demo.orangehrmlive.com");
				System.out.println(wb.getTitle());
				
				wb.switchTo().window(pTab);
				wb.get("https://www.google.com");

				wb.switchTo().window(Handles);
				wb.quit();
			}
			 System.out.println(wb.getTitle());
		 }

}

