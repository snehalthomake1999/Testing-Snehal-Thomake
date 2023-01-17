package seleniumpro;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frontend {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	       driver.get("file:///C:/Users/ADMIN/Desktop/Snehal%20Thomake(7670)/front%20page.html");
	      driver.get("file:///C:/Users/ADMIN/Desktop/Snehal%20Thomake(7670)/login.html#");
	      
	      //Registeration 
	     driver.findElement(By.cssSelector("#login-form > div > div > form.login-form > p:nth-child(6) > a")).click();
	       driver.findElement(By.name("username")).sendKeys("snehalthomake");
	       driver.findElement(By.name("emailid")).sendKeys("snehalthomake1999mail.com");
	        driver.findElement(By.name("New password")).sendKeys("*****");
	       driver.findElement(By.name("Confirm password")).sendKeys("******");


	      //login
	     driver.get("file:///C:/Users/ADMIN/Desktop/Snehal%20Thomake(7670)/login.html#");
	       driver.findElement(By.name("user name")).sendKeys("snehalthomake");
	       driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form[1]/input[2]")).sendKeys("7887838057");
	     driver.findElement(By.xpath("/html/body/div/div[1]/div/a")).click();
	     
	}
}
