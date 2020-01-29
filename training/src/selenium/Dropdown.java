package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("");
		driver.get("");
		

		
		driver.get()
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(10);;
		
		Select month = new select(driver.findElement(By.id("month")));
		month.selectByVisibleText ("Jun");
		
		Select year = new Select(driver.findElemet(By.id("year")));
		year.selectByValue("1999");
		
		
		

	

}
