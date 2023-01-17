package seleniumpro;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;

public class Dselect {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	       driver.get("https://www.facebook.com/r.php?locale=en_GB");
	       Select no1=new Select(driver.findElement(By.xpath("//*[@id='day']")));
	       no1.selectByIndex(27);  
	       
	       Select no2=new Select(driver.findElement(By.xpath("//*[@id='month']")));
	       no2.selectByVisibleText("Sep"); 
	       
	       Select no3=new Select(driver.findElement(By.xpath("//*[@id='year']")));
	       no3.selectByValue("1999"); 
	       
	      // no1.deselectAll();
	       
	    
           no1.deselectByIndex(25);
           
           no3.deselectByValue("1998");
           
           no2.deselectByVisibleText("Oct");
	      
	

}

}