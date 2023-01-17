package seleniumpro;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signupsele {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	       driver.get("https://www.edubridgeindia.com");
	        driver.get("https://www.edubridgeindia.com/register");
	        
	       // driver.findElement(By.id("register_name")).sendKeys("Snehal Thomake");
	        driver.findElement(By.id("register_mobile")).sendKeys("7887838057");
	       // driver.findElement(By.id("profile_state")).sendKeys("Maharashtra");
	        //driver.findElement(By.name("email")).sendKeys("snehalthomake1999@gmail.com");
	        //driver.findElement(By.id("register_password")).sendKeys("snehal@28");
	        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/form/div[1]/div[2]/button")).click();
	        
	        driver.navigate().to("https://www.edubridgeindia.com/login");
			
			driver.findElement(By.id("login_mobile")).sendKeys("7887838057");
			
			driver.findElement(By.id("login_password")).sendKeys("snehal@28");

			driver.findElement(By.cssSelector("label[class*='form-check form-check-label']")).click();
			//driver.findElement(By.cssSelector("form-check form-check-label")).click();
			driver.findElement(By.id("btnLoginSubmit")).click();
						
         driver.findElement(By.xpath("//*[@id='coursesGridData']")).click();  

			
	       
	        
	        

}
}