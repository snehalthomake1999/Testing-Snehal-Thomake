package seleniumpro;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver(); 
	
	        driver.navigate().to("https://www.amazon.com/");  
	        Assert.assertFalse(driver.findElement(By.cssSelector("#nav-hamburger-menu")).isSelected());  
	        System.out.println(driver.findElement(By.cssSelector("#nav-hamburger-menu")).isSelected());
}
}
