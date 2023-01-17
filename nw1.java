package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nw1 {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	 driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.switchTo().frame(driver.findElement(By.className("ui-widget-header")));
	WebElement s=driver.findElement(By.id(""));
	WebElement d=driver.findElement(By.id(""));
	ac.dragAndDrop(s, d).build().perform();
}
}
