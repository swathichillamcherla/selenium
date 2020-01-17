package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\chkis\\Desktop\\selenim soft\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.id("//*[@id=\"u_0_2\"]")).click();
		System.out.println(driver.getTitle());
		
		//driver.close();


	}
}
