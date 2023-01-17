package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;

public class visibleTsele {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	       driver.get("https://www.facebook.com/r.php?locale=en_GB");
	       driver.findElement(By.name("firstname")).sendKeys("Snehal") ;
	       driver.findElement(By.name("lastname")).sendKeys("Thomake");
	       driver.findElement(By.name("reg_email__")).sendKeys("snehalthomake1999@gmail.com");
	       driver.findElement(By.name("reg_email_confirmation__")).sendKeys("snehalthomake1999@gmail.com");
	       driver.findElement(By.cssSelector("#password_step_input")).sendKeys("snehal@28");
	       
	       Select no1=new Select(driver.findElement(By.xpath("//*[@id='day']")));
	       no1.selectByIndex(27);  
	       
	       Select no2=new Select(driver.findElement(By.xpath("//*[@id='month']")));
	       no2.selectByVisibleText("Sep"); 
	       
	       Select no3=new Select(driver.findElement(By.xpath("//*[@id='year']")));
	       no3.selectByValue("1999"); 
	       
	       	 // no2.deselectByVisibleText("Sep"); 
	       
	         List<WebElement> se=no1.getOptions();
	         System.out.println("day drop down: ");
	         for(WebElement options:se)
		         System.out.println(options.getText());
	         
	         List<WebElement> se2=no2.getOptions();
	         System.out.println("month drop down: ");
	         for(WebElement options:se2)
		         System.out.println(options.getText());
	         
	         List<WebElement> se3=no3.getOptions();
	         System.out.println("year drop down: ");
	         for(WebElement options:se3)
		         System.out.println(options.getText());
	         
	       
	         
	       
	          
	           
	         
	         
 
	     
	}

}
