package firstpackage;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/users/selenium softwares/chromdriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
