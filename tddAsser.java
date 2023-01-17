package seleniumpro;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;  


public class tddAsser {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	        

	        driver.navigate().to("https://www.amazon.com/");  
	       driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();  
	        Assert.assertTrue(driver.findElement(By.cssSelector("#nav-hamburger-menu")).isSelected());  
	        System.out.println(driver.findElement(By.cssSelector("#nav-hamburger-menu")).isSelected());
	                  
}
}