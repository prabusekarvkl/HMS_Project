package HMS.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import HMS.util.WebEventListener;


public class testbase {
	
	
public static WebDriver driver;
public static Properties pop;


//public static EventFiringWebDriver e_driver;
//public static HMS.util.WebEventListener webel;


public testbase()
{
	pop=new Properties();
	try {
		FileInputStream ifconfig=new FileInputStream(System.getProperty("user.dir")+"./src/main/java/HMS/config/config.properties");
	pop.load(ifconfig);	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
public static void StartUp()
{
	String browserName=pop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equals("mbrowser"))
	{
		System.setProperty("webdriver.chrome.driver","./src/test/resources/geckodriver.exe");
		driver=new ChromeDriver();
	}
	
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
driver.get(pop.getProperty("url"));


//e_driver=new EventFiringWebDriver(driver);
//webel=new WebEventListener();
//e_driver.register(webel);
//driver=e_driver;
}

public void ElementVisible(WebElement element)
{
	WebDriverWait wait = new WebDriverWait(driver,50);
	wait.until(ExpectedConditions.visibilityOf(element));
}

}
