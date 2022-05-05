package Selenium;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		//wb.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//simple alert
		wb.navigate().to("https://demoqa.com/alerts");
		
		wb.findElement(By.id("alertButton")).click();
		Alert alt =wb.switchTo().alert();
		String alertinfo = alt.getText();
		System.out.println(alertinfo);
		alt.accept();
		
		
		//confirm button
		Thread.sleep(3000);
		wb.findElement(By.id("confirmButton")).click();
		String alertinfo1 = alt.getText();
		System.out.println(alertinfo1);
		alt.dismiss();
		
		//propmptb we give some input
		
		wb.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		alt.sendKeys(" i am doing");
		String alertinfo2 = alt.getText();
		System.out.println(alertinfo2);
		alt.accept();
		

}}
