package Selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		
		WebDriver wb= new ChromeDriver();
		wb.navigate().to("https://opensource-demo.orangehrmlive.com");
		JavascriptExecutor js = (JavascriptExecutor) wb;
		//To print the title
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		//to print the domain
		String domain = js.executeScript("return document.domain").toString();
		System.out.println(domain);
		
		//to print the URL
		String URL = js.executeScript("return document.URL").toString();
		System.out.println(URL);
		
		//to print the username, we are using innertext
		String innertextUN = js.executeScript("return document.getElementById('divUsername').innerText").toString();
		System.out.println(innertextUN);
		
		//to refresh the webpage
		Thread.sleep(2000);
		js.executeScript("history.go(0)"); //go(0) --> to refresh the page
		
		//to give username, password and clicking on login button to login
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		Thread.sleep(2000);
		System.out.println("Username Added");
		
		Thread.sleep(3000);
	
		js.executeScript("document.getElementById('txtPassword').value='admin123'");
		System.out.println("Password Added");
		
		js.executeScript("document.getElementById('btnLogin').click();");
		
		//to click on pim and employee list
		js.executeScript("return document.getElementById('menu_pim_viewPimModule')");
		Thread.sleep(2000);
		js.executeScript("return document.getElementById('menu_pim_viewEmployeeList').click()");
		Thread.sleep(2000);
		
		//to scroll the page down(end of the page)
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//to scroll the page upwards(top of the page)
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//to scroll to a particular person's name from the list
		js.executeScript("document.getElementById('ohrmList_chkSelectRecord_9').scrollIntoView()"); //to will scroll the that particular element --> scrollIntoView
		//go to orange hrm-->inspect one particular person--> select that person to get this ohrmList_chkSelectRecord_9
		Thread.sleep(2000);
		
		//using innertext for all the people in the list(class)/table
		// js can get a data frame which web driver cannot
				String table = js.executeScript("return document.getElementById('resultTable').innerText").toString();
		
		//Note: we cannot execute both innertext and inner html simultanoulsy
		
		//using innerhtml for finding the html for all the people(class) in the list/table. we use html for the the person coz we can find exact details like who all 
		//just oly visited the page, who all brought something etc from the html.
				// source pages are created with html, so we can fetch those links too from the table
				String table1 = js.executeScript("return document.getElementById('resultTable').innerHTML").toString();
				System.out.println(table1);
		
		
		
		

}}
