package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login_Screen {

	public static void main(String[] args) throws InterruptedException {
		
		String testUsername="standard_user";
				
		String testPass="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver", "E:\\alkhateeb\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(testUsername);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(testPass);
		
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	
	Thread.sleep(2000);
	
	String actuailTitle=driver.getTitle();
	String expectetTitle="Swag Labs";
	
	
	Assert.assertEquals(actuailTitle, expectetTitle);
	
	
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
	
	
		
		
		

	}

}
