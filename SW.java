package seleniumpro;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SW {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
		       
	        driver.get("http://www.hyrtutorials.com/p/alertsdemo.html");			
    		
	        //simple Alert
	       driver.findElement(By.id("alertBox")).click();  
	        Alert simplealert = driver.switchTo().alert();		
	        String alertMessage= driver.switchTo().alert().getText();			 	
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);	
	        simplealert.accept();		
	        Thread.sleep(2000);	
	        /*
	        //Confirmation Alert
	        driver.findElement(By.id("confirmBox")).click();  
	        Alert conalert = driver.switchTo().alert();		
	        String Message= driver.switchTo().alert().getText();			 	
	        System.out.println(Message);	
	        Thread.sleep(5000);	
	        conalert.accept();
	        Thread.sleep(2000);	
	        System.out.println(driver.findElement(By.id("output")).getText());
	        
	        
	        driver.findElement(By.id("promptBox")).click();  
	        Alert pmalert = driver.switchTo().alert();		
	        String pMessage= driver.switchTo().alert().getText();			 	
	        System.out.println(pMessage);	
	        Thread.sleep(5000);
	        pmalert.sendKeys("Reddy");
	        pmalert.accept();
	        Thread.sleep(2000);	
	        System.out.println(driver.findElement(By.id("output")).getText());
	        */
	      
	        
	        
	        
	    }	

	


}