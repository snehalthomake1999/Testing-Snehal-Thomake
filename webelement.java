package seleniumpro;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	        driver.get("https://www.edubridgeindia.com");
	
			driver.navigate().to("https://www.edubridgeindia.com/login");
			
			driver.findElement(By.id("login_mobile")).sendKeys("7887838057");
			
			driver.findElement(By.id("login_password")).sendKeys("snehal@28");

			driver.findElement(By.cssSelector("label[class*='form-check form-check-label']")).click();
			
			driver.findElement(By.id("btnLoginSubmit")).click();
						
			driver.findElement(By.className("cursor mb-0")).click();
			
		}
		
}

	
