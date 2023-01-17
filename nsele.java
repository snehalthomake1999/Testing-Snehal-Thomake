package seleniumpro;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class nsele {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	       driver.get("https://login.naukri.com/nLogin/Login.php");
	    	   //driver.findElement(By.cssSelector("#root")).sendKeys("snehalthomake1999@gmail.com");
	    	 // driver.findElement(By.xpath("//*[@id='root']")).sendKeys("snehalthomake1999@gmail.com");
	    	   //driver.findElement(By.xpath("//*[@id='root']")).sendKeys("snehal@28");
	    	  // driver.findElement(By.className("err-border")).sendKeys("snehal@28");;
			driver.findElement(By.cssSelector("label[class*='err-border']")).sendKeys("snehalthomake1999@gmail.com");

	    	 
	
}
}