package seleniumpro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;


public class flu {

	public static void main(String[] args) throws InterruptedException  
	{  
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  

	WebDriver driver = new ChromeDriver();  
	
	
	driver.get("https://www.edubridgeindia.com/login");
	driver.findElement(By.xpath("//*[@id='login_mobile']")).sendKeys("7887838057");
	driver.findElement(By.xpath("//*[@id='login_password']")).sendKeys("snehal@28");
	driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[2]/div/div[1]/input")).click(); 

	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    .withTimeout(Duration.ofSeconds(30))
		    .pollingEvery(Duration.ofSeconds(5))
		    .ignoring(NoSuchElementException.class);
	
	


	
	
	
	
}
}