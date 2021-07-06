package MavenDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public void facebookTest(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\927230\\workspace\\Facebook\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email"));
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass"));
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("abc12345");
		driver.findElement(By.name("login"));
		WebElement login =driver.findElement(By.name("login")); 
		login.click();
	
	}
}
    
