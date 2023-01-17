package seleniumpro;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class explicite {
	
	
	public static void main(String[] args) throws InterruptedException  
	{  
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  

	WebDriver driver = new ChromeDriver();  
	
	WebDriverWait wt =new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://student.dbatuapps.in/itxlogin");  
	
	driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("1963171372111");
	driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[2]/div/div[1]/div/div[2]/input")).sendKeys("7887838057"); 

	wt.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/main/div/div/div/div/div[2]/div/div[1]/input"))).click();
	
	

       
}
	
	
	
	

}
