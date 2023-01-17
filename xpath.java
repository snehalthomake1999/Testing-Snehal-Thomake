package seleniumpro;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  
public class xpath {

		public static void main(String[] args) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		        WebDriver driver = new ChromeDriver();  
		       driver.get("https://www.amazon.com");
         driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();  
			driver.findElement(By.name("email")).sendKeys("917887838057");
	         driver.findElement(By.xpath("//*[@id='continue']")).click();  
	         driver.findElement(By.id("ap_password")).sendKeys("snehal@28");
				driver.findElement(By.cssSelector("#signInSubmit")).click();



         
}
}
