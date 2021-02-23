package HMS.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import HMS.base.testbase;

public class CommonUtility extends testbase{
	public static void takescreenshot()
	{
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String currentDir = System.getProperty("user.dir");
	  File destination=new File(currentDir+"./Screenshot/"+System.currentTimeMillis()+".png");
	  try {
	    FileHandler.copy(scrFile,destination );
	  } catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	  }
	}
	public static void upload(String uploadsrc)
	{
		try {
			Runtime.getRuntime().exec("./src/test/resources/Upload.exe"+" "+uploadsrc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void MouseClick(WebElement el)  
		{
		Actions action=new Actions(driver);
		action.click(el).build().perform();
	   
	}
	
}
