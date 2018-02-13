package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MojaKlasaTest {
	@Test
	public  void MojaKlasa() {
		// TODO Auto-generated method stub
		String exePath = "C:\\Users\\mario\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		//driver.get("http://gmail.com");
		driver.navigate().to("http://gmail.com");
		System.out.println(driver.getTitle());
		String actual_title = driver.getTitle();
		String expected_title = "Gmail";
		if (actual_title.equals(expected_title)) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case fail");
		}
		driver.close();
		driver.quit();
	}

}
