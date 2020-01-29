package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headlessbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http/wellsfargo.com/");
		System.out.println("Title of the page is" +driver.getTitle());

	}

}
