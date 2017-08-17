package generic;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements IAutoConst{
	public WebDriver driver;
	
	
	
	@Parameters({"node","browserName"})
	@BeforeMethod
	public void preCondition(String node,String browserName) 
	throws Exception{
		URL system=new URL(node);
		DesiredCapabilities browser=new DesiredCapabilities();
		browser.setBrowserName(browserName);
		driver=new RemoteWebDriver(system,browser);
		
		driver.get("http://localhost");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void postCondition(){
		driver.quit();
	}
}





