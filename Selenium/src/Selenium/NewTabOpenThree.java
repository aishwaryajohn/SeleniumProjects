package Selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTabOpenThree
{
			public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
			WebDriver wb = new ChromeDriver();
			//wb.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			
			wb.navigate().to(" https://demoqa.com/browser-windows");
			for(int i=0; i<3;i++) {
				wb.findElement(By.id("windowButton")).click();
//				wb.close();
				Thread.sleep(2000);
			}
			
			//here we have used 1)parent tab/pTab is 'https://demoqa.com/browser-windows'
			//2) other handles are a) 'https://www.google.com' (First handle)
			//b) 'https://opensource-demo.orangehrmlive.com/'
			
			//get the handle of first tab, it will store the first window/tab opened in the parent window(pTab)
			//it can be for a browser
			 String pTab = wb.getWindowHandle();
			 
			 //it is used to store all the windows/tabs that are opened
			 //it will also identity how many tabs/windows are there/opened
			 Set<String> tabs = wb.getWindowHandles();
			
			 Thread.sleep(3000);
			 //for enhanced loop for tabs
			 for(String Handles: tabs)
			 {
				
				 wb.switchTo().window(Handles);
				 wb.switchTo().window(pTab);
					wb.get("https://www.google.com");
					Thread.sleep(3000);
					wb.switchTo().window(Handles);
					wb.get("https://opensource-demo.orangehrmlive.com/");
					wb.switchTo().window(pTab);
					
					//simple alert, it selects the 1st alert from the demoqa website
					wb.get("https://demoqa.com/alerts");
					wb.findElement(By.id("alert button")).click();
					Alert alt = wb.switchTo().alert();
					
					String alertinfo =alt.getText();//to find the information in the alert
					System.out.println(alertinfo);// to print that info
					alt.accept();
					Thread.sleep(3000);
					
					//Confirm alert , it selects the 3rd alert from the demoqa website
					wb.findElement(By.id("confirmButton")).click();
					alt.dismiss();
					Thread.sleep(3000);
					
					//Prompt that is adding values in the prompt box
					wb.findElement(By.id("promptButton")).click();
					alt.sendKeys("Hello");
					alt.accept();
					Thread.sleep(3000);
					
					//wb.close();
					//wb.switchTo().window(Handles);
					
					
			 }
			// wb.quit();
			
			
	}}


