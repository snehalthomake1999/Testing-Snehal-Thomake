package seleniumpro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.Firefox.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.zomato.com");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		String title1 = driver.getTitle();
		String url1=driver.getCurrentUrl();
		
		System.out.println("The title of the page is:" +title1);
		
		System.out.println("The title of the page is: "+url1);
		driver.navigate().to("https://www.flipkart.com/");
		
		String title2 = driver.getTitle();
		System.out.println("The title of the page is" +title2);
		
		
	    driver.quit(); //closing browser
		
		
	}
}
