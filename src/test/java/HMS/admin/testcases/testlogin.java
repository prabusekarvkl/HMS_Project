package HMS.admin.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HMS.base.testbase;
import HMS.pages.loginpage;

public class testlogin extends testbase {
loginpage pageobj;
public testlogin()
{
	super();
}
@BeforeClass
public void startup()
{
	StartUp();
	pageobj=new loginpage();
}
@Test(priority=1)
public void checkfortitle()
{
	String actual=pageobj.verfiytitle();
	String expe="Smart Hospital : Hospital Management System";
	Assert.assertEquals(actual, expe);
}
@Test(priority=2)
public void checkforlogo()
{
	Assert.assertTrue(pageobj.logo());
}
@Test(priority=3)
public void Flogin()
{
pageobj.Fpassword();

}
@Test(priority=4)
public void alogin()
{
	pageobj.ALogin();
}
@Test(priority=5)
public void applogin()
{
	pageobj.logintest(pop.getProperty("username"),pop.getProperty("password"));
}
@AfterClass
public void teardown() {
	driver.quit();
}
}
