package seleniumpro;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleif {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver(); 
		 driver.get("https://accounts.google.com/");
		 WebElement b= driver.findElement(By.id("identifierId"));
	        b.sendKeys("snehalthomake1999@gmail.com");
	        WebElement c= driver.findElement(By.className(""));
	        c.sendKeys(Keys.ENTER);

}
}