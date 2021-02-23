package HMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMS.base.testbase;

public class FrontOffice extends testbase {
//@FindBy(css = "ul.sidebar-menu.verttop li:nth-of-type(1)")WebElement foffice;
@FindBy(css="div.box-tools.pull-right a:nth-of-type(2)")WebElement visitorbook;
@FindBy(xpath="//h3[contains(text(),'Appointment Details')]")WebElement focheck;

public FrontOffice()
{
	PageFactory.initElements(driver, this);
}

/*
 * public void fofc() { foffice.click(); }
 */
public boolean VerifyFofc()
{
	return focheck.isDisplayed();
}
public addvisitorpage ClickVisitorBook()
{
	visitorbook.click();
	return new addvisitorpage();
}
}
