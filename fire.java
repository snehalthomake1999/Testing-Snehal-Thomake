package seleniumpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fire {

	public static void main(String[] args) {
		System.setProperty("webdriver.Firefox.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.zomato.com");
		
	}
}
