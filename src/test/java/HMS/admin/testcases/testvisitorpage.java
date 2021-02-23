package HMS.admin.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
/*import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;*/
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HMS.base.testbase;
import HMS.pages.FrontOffice;
import HMS.pages.addvisitorpage;
import HMS.pages.homepage;
import HMS.pages.loginpage;
import HMS.util.ReadExcel;
public class testvisitorpage extends testbase{

	addvisitorpage advisipg;
	homepage hmpg;
	String sheetName="Visitor";
	FrontOffice fnofz;
	//WebDriverWait wait=new WebDriverWait(driver,10);
public testvisitorpage()
{
	super();
}
@BeforeClass
public void startup()
{
	StartUp();
	loginpage lpag = new loginpage();
	hmpg=lpag.logintest(pop.getProperty("username"),pop.getProperty("password"));
	fnofz=hmpg.ClickFrontOffice();
	advisipg=fnofz.ClickVisitorBook();
	 Assert.assertTrue(advisipg.VerifyVisitorBook());
}


@DataProvider
public Object[][] getVISTestData(){
  Object data[][] = ReadExcel.getTestData(sheetName);
  return data;
}
@Test(dataProvider="getVISTestData")
public void AddVisitorDetails(String args[]) {
	advisipg.addvisii();

  Assert.assertTrue(advisipg.VerifyAddVisitor());
  advisipg.addvisdetails(args);
}

}
