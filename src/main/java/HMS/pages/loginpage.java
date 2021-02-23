package HMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMS.base.testbase;

public class loginpage extends testbase {
	@FindBy(css ="input#email")WebElement uname;
	@FindBy(xpath = "//input[@id='password']")WebElement pword;
	@FindBy(css="button.btn")WebElement sign;
	@FindBy(tagName="img")WebElement HMSlogo;
	@FindBy(linkText="Forgot Password?")WebElement fpass;
	@FindBy(linkText="Admin Login")WebElement Alogin;	
public loginpage()
{
	PageFactory.initElements(driver,this);
}
public String verfiytitle()
{
	return driver.getTitle();
}
public  boolean logo()
{
	return HMSlogo.isDisplayed();
}
public void Fpassword()
{
	fpass.click();
}
public void ALogin()
{
	Alogin.click();
}
public  homepage logintest(String username,String password)
{
	uname.sendKeys(username);
	pword.sendKeys(password);
	sign.click();
	
	return new homepage();
}
}
