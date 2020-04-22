package StepPack;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hook extends AbstractClass {
	@Before
    public void SetUp() throws IOException{
		PropertyValues pr = new PropertyValues();
		String browser = pr.getBrowser();
		
		if ((browser!=null)&&(browser.equalsIgnoreCase("chrome"))) {
	 		WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
		}
		else if ((browser!=null)&&(browser.equalsIgnoreCase("firefox"))) {
	 		WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
		}
		else if ((browser!=null)&&(browser.equalsIgnoreCase("ie"))) {
	 		WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();
		}

		/*System.setProperty("webdriver.chrome.driver","C:\\ITTraining\\AllDriver\\chromedriver_80.exe");
		driver=new ChromeDriver();*/
		
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    @After
    public void teardown(){
        driver.close();
    }
	

}
