package Selenium;

import java.awt.AWTException;

import java.util.Set;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class NewTabOpenTwo {
	

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		//WebDriverManager.chrome.driver.setup();
		WebDriver wb= new ChromeDriver();
		wb.navigate().to("https://demoqa.com/browser-windows");wb.manage().window().maximize(); //Used to maximize the tab
		Thread.sleep(2000);
		String pTab = wb.getWindowHandle();
		
		Set<String> tabs = wb.getWindowHandles();
		 System.out.println(tabs);
		 //for enhanced loop for one part
		 for(String Handles: tabs)
		 {
			
			 wb.switchTo().window(Handles);
			
				wb.get("https://www.google.com");
				System.out.println(wb.getTitle()); 
				Thread.sleep(3000);
				
				wb.switchTo().window(pTab); //pTab is the parent tab
				wb.get("https://demoqa.com/browser-windows");
               Thread.sleep(3000);
				wb.switchTo().window(Handles);
				 wb.get("https://opensource-demo.orangehrmlive.com");
				 wb.switchTo().window(pTab);
				 wb.close();
				
				 wb.switchTo().window(Handles);
				 wb.quit();
			}		
		 
		 
		
		

}
}