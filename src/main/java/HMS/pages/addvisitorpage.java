package HMS.pages;

//import java.awt.Desktop.Action;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HMS.base.testbase;
import HMS.util.CommonUtility;
import HMS.util.DatePicker;
//import calenders.datepicker1;

public class addvisitorpage extends testbase {
	
@FindBy(css="div.box-tools.pull-right>a.btn.btn-primary.btn-sm")WebElement addvisi;
@FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/select[1]")WebElement pur;
@FindBy(css = "#formadd > div.box-body > div:nth-child(1) > div:nth-child(2) > div > input")WebElement name;
@FindBy(css="#formadd > div.box-body > div:nth-child(6) > div > div > input")WebElement uploadd;
@FindBy(css="#formadd > div.box-body > div:nth-child(2) > div:nth-child(1) > div > input")WebElement phone;
@FindBy(css="#formadd > div.box-body > div:nth-child(2) > div:nth-child(2) > div > input")WebElement id;
@FindBy(css="#formadd > div.box-body > div:nth-child(3) > div:nth-child(1) > div > input")WebElement nop;
@FindBy(css="#stime_")WebElement intime;
@FindBy(css="#stime_")WebElement outtime;
@FindBy(xpath="//textarea[@id='description']")WebElement note;
@FindBy(css="input#date")WebElement date;
@FindBy(xpath="//h3[contains(text(),'Visitor List')]")WebElement vb;
@FindBy(xpath="//h4[contains(text(),'Add Visitor')]")WebElement av;
	public addvisitorpage()
	{
		PageFactory.initElements(driver, this);
	}
	//public void VisitorBook()
	/*{
		visitorbook.click();
		//addvisi.click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}*/
	public boolean VerifyVisitorBook()
	{
		ElementVisible(vb);
		return vb.isDisplayed();
	}
	public void addvisii()
	{
		addvisi.click();
		
	}
	public boolean VerifyAddVisitor()
	{
		ElementVisible(av);
		return av.isDisplayed();
	
	}
	public void addvisdetails(String data[])
	{
		
		String currentdir= (System.getProperty("user.dir"));
		String fileupload=currentdir+"//src//test//resources//P_20170209_151248.jpg";
		Select s=new Select(pur);
		s.selectByValue(data[0]);
		ElementVisible(pur);
		name.sendKeys(data[1]);
		phone.sendKeys(data[2]);
		id.sendKeys(data[3]);
		nop.sendKeys(data[4]);
		date.click();
		DatePicker date=new DatePicker();
		date.datpicker(data[5]);
		intime.clear();
		intime.sendKeys(data[6]);
		outtime.clear();
		outtime.sendKeys(data[7]);
		note.sendKeys(data[8]);
		CommonUtility.MouseClick(uploadd);
		ElementVisible(uploadd);
		CommonUtility.upload(fileupload);
	
		
	}
	
}
