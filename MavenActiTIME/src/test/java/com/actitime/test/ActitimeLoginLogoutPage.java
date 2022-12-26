package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;


@Listeners(com.actitime.generics.Screenshot.class)
public class ActitimeLoginLogoutPage extends BaseTest 

{
	@Test
	public void loginlogout() throws InterruptedException, IOException
	
	{
		ActitimeLoginPage loginpage=new ActitimeLoginPage(driver);
		loginpage.loginMethod();
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
}
