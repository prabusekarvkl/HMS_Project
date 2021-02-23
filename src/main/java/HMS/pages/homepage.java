package HMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMS.base.testbase;

public class homepage extends testbase {
@FindBy(css="img.topuser-image")WebElement img;
@FindBy(xpath = "//h4[contains(text(),'Super Admin')]")WebElement txt;
@FindBy(css = "ul.sidebar-menu.verttop li:nth-of-type(1)")WebElement foffice;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(2)")WebElement opd;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(3)")WebElement ipd;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(4)")WebElement pharmacy;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(5)")WebElement path;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(6)")WebElement rad;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(7)")WebElement otheater;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(8)")WebElement bbank;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(9)")WebElement tpa;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(10)")WebElement finance;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(11)")WebElement ambulance;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(12)")WebElement hr;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(14)")WebElement msg;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(15)")WebElement dc;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(16)")WebElement inven;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(17)")WebElement fcms;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(18)")WebElement report;
@FindBy(css="ul.sidebar-menu.verttop li:nth-of-type(19)")WebElement setup;

public homepage()
{
	PageFactory.initElements(driver,this);	
}
public String verifytitle()
{
	return driver.getTitle();
}
public boolean label()
{
	img.click();
	return txt.isDisplayed();
}

//public boolean testLabel() {
//	driver.findElement(By.cssSelector(".topuser-image")).click();
//	String navUser = driver.findElement(By.cssSelector("body.skin-blue.fixed.sidebar-mini:nth-child(2) div.wrapper:nth-child(2) header.main-header.affix-top:nth-child(1) nav.navbar.navbar-static-top div.col-md-7.col-sm-9.col-xs-7 div.pull-right div.navbar-custom-menu ul.nav.navbar-nav.headertopmenu li.dropdown.user-menu.open:nth-child(4) ul.dropdown-menu.dropdown-user.menuboxshadow li:nth-child(1) div.sstopuser div.sstopuser-test > h4:nth-child(1)")).getText();
//	if(navUser.equalsIgnoreCase("Super Admin")) {
//		return true;
//	}else {
//	return false;
//	}
//}

public FrontOffice ClickFrontOffice()
{
	foffice.click();
	return new FrontOffice();
	//return new FrontOffice();
}
public void OPD()
{
	opd.click();
}
public void IPD()
{
	ipd.click();
}
public void pharmacy()
{
	pharmacy.click();
}
public void patho()
{
	path.click();
}
public void radio()
{
	rad.click();
}
public void Otheater()
{
	otheater.click();
}
public void BBank()
{
	bbank.click();
}
public void TPA()
{
	tpa.click();
}
public void Finance()
{
	finance.click();
}
public void Ambulance()
{
	ambulance.click();
}
public void HR()
{
	hr.click();
}
public void MSG()
{
	msg.click();
}
public void DC()
{
	dc.click();
}
public void Inven()
{
	inven.click();
}
public void Fcms()
{
	fcms.click();
}
public void Report()
{
	report.click();
}
public void Setup()
{
	setup.click();
}

}
