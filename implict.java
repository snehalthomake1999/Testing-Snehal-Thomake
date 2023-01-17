package seleniumpro;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implict {
		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException  
		{  
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  

		WebDriver driver = new ChromeDriver();  
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.get("https://student.dbatuapps.in/itxlogin");  
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("1963171372111");    
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[2]/div/div[1]/div/div[2]/input")).sendKeys("7887838057"); 
		
	   //driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[2]/div/div[1]/input")).click(); 
		
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS );
      driver.navigate().to("https://www.amazon.in");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.quit();		
		

	       
	}
}