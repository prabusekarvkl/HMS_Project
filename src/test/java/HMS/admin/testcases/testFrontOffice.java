package HMS.admin.testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import HMS.base.testbase;
import HMS.pages.FrontOffice;
import HMS.pages.addvisitorpage;
import HMS.pages.homepage;
import HMS.pages.loginpage;

public class testFrontOffice extends testbase {
  homepage hmpg;
  FrontOffice fnofz;
  addvisitorpage adv;
public testFrontOffice()
{
  super();
}
@Test
public void startup()
{
	StartUp();
  loginpage lpag = new loginpage();
  hmpg=lpag.logintest(pop.getProperty("username"),pop.getProperty("password"));
  fnofz=hmpg.ClickFrontOffice();
  Assert.assertTrue(fnofz.VerifyFofc());
  adv=fnofz.ClickVisitorBook();
}
}