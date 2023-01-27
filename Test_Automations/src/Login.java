import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
 
	WebDriver driver;
	public void lunchbrowser() {
		   
	    // implicit wait - 5 seconds time out
		System.setProperty("webdriver.gecko.driver", "D:\\TestingNotes\\UnicodeTechnology_Testing\\geckodriver-64bit.exe");
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.get("https://staging.grubbrr.com/Login");
		driver.get("https://grubbrronlinestaging.azurewebsites.net/Home/Login/Taco-Bell");   	
	}
	
    public void login() {
    		
    		// Click the Register text useing the link locator
    		driver.findElement(By.linkText("Register Account")).click();
    		
    		// Useing the xpath to parent child tag techniques useing / slah.
    		
    		String a =driver.findElement(By.xpath("//form/div/div/div/h3")).getText();
    		System.out.println("Page of Name Is:"+a);
    		
    		String b = driver.findElement(By.xpath("//form/div/div/div/div/div/div/p[1]")).getText();
    		System.out.println("Name Is:"+b);
    		
    		// Send value in textbox using the xpath parent child tag techniques useing / slah.
    		driver.findElement(By.xpath("//form/div/div/div/div/div/div/p/input[1]")).sendKeys("parth");
    		
    		driver.findElement(By.xpath("//form/div/div/div/div/div/div[2]/p[1]/input[1]")).sendKeys("ka patel");
    		
    		
    		// Useing the Css Selectore locator to give the xpath useing unique attribute in the html tag.
    		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("TestQa");
    		
    		//driver.findElement(By.xpath("//input[@type='text'][1]")).clear();
    		driver.findElement(By.xpath("(//input[@id='Firstname'])[1]")).clear();
    		
    		// driver.findElement(By.cssSelector("input[id='Lastname']:nth-child(1)")).sendKeys("patel");
    		driver.findElement(By.xpath("(//input[@id='Lastname'])[1]")).sendKeys("patel");
    		
    		driver.findElement(By.xpath("(//input[@id='Lastname'])[1]")).clear();
    			
    	
    	
    }
	
	public static void main(String[] args) {
		Login l = new Login();
		l.lunchbrowser();
		l.login();
	}
}


