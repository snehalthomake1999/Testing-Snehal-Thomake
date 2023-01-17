package seleniumpro;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  
public class path {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	       driver.get("https://www.zomato.com");
    driver.findElement(By.linkText("Sign up")).click(); 
}
}