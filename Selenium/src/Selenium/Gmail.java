package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	
		WebDriver wb= new ChromeDriver();
		wb.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		wb.manage().window().maximize(); //Used to maximize the orange hrm tab
		wb.findElement(By.xpath("//*[@type='email']")).sendKeys("foodlesnoodles17");
		wb.findElement(By.xpath("//*[@type='password']")).sendKeys("arjunreddy");
		//wb.findElement(By.xpath("//*[@id= 'Wxwduf.Us7fWe.JhUD8d']")).click();
		

	}

}





