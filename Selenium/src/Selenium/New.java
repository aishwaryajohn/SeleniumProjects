package Selenium;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

public class New {

		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
			WebDriver wb = new ChromeDriver();
	
	wb.navigate().to("https://www.google.com/");
	11:58
	WebElement link =wb.findElement(By.linkText("Gmail"));
			 Actions act = new Actions(wb);
	11:59
	act.contextClick(link).build().perform();
			 //to click and select
			 Robot rc = new Robot();
			 rc.keyPress(MenuKeyEvent.VK_DOWN);
			 rc.keyPress(MenuKeyEvent.VK_ENTER);
			 Thread.sleep(5000);
			 rc.keyPress(MenuKeyEvent.VK_CONTROL);
			 rc.keyPress(MenuKeyEvent.VK_TAB);
			 //System.out.println(wb.getTitle());
			
			 Set<String> tabs = wb.getWindowHandles();
			 System.out.println(tabs);
			 //for enhanced loop for one part
			 for(String Handles: tabs)
			 {
				
				 wb.switchTo().window(Handles);
				 System.out.println(wb.getTitle());
			 }
			
			// System.out.println(wb.getTitle());











	










}
