package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chkis\\Desktop\\selenim soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\chkis\\Documents\\swathi\\screenshot.png"));
		
		
	}

}
