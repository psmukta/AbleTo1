package StepPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hook extends AbstractClass {
	@Before
    public void SetUp(){
		WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		
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
