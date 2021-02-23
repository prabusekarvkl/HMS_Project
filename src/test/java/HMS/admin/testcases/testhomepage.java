package HMS.admin.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HMS.base.testbase;
import HMS.pages.FrontOffice;
import HMS.pages.homepage;
import HMS.pages.loginpage;

public class testhomepage extends testbase{
	homepage hmpg;
	loginpage pobj1 = new loginpage();
	FrontOffice fnofz=new FrontOffice();
	//testlogin tlpag = new testlogin();
	public testhomepage()
	{
		super();
	}
	@BeforeClass
	public void startup()
	{
		StartUp();
		loginpage lpag = new loginpage();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		hmpg=lpag.logintest(pop.getProperty("username"),pop.getProperty("password"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	public void checkfrtitle()
	{
		String ac=hmpg.verifytitle();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String ex="Smart Hospital and Research";
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Assert.assertEquals(ac, ex);
				
	}
	
	@Test(priority=2)
	public void checktext()
	{
	Assert.assertTrue(hmpg.label());
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	}

