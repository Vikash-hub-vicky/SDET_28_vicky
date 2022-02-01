package CreateContactTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreatePurchaseTest {
	
	@Test(groups ="smokeTest")
	public void createPurchaseTest() {
		
		
		
		String browser = System.getProperty("BROWSER");
		String url = System.getProperty("URL");
		
		System.out.println("execute the puchase order");
		
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		else {
			System.out.println("browser is not supported");
		}
		driver.get(url);
		driver.close();
	}
	@Test(groups ="regressionTest")
	public void modifiyePurchaseTest() {
		System.out.println("this is modify");
	}
}
