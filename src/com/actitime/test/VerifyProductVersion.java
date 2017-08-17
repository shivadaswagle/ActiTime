package com.actitime.test;

import org.testng.annotations.Test;
import com.actitime.page.EnterTimeTrackPage;
import com.actitime.page.LoginPage;
import generic.BaseTest;
import generic.Excel;

public class VerifyProductVersion extends BaseTest{

	@Test(priority=3)
	public void testVerifyProductVersion(){
		String sheet="VerifyProductVersion";
		String un=Excel.getCellValue(XLPATH,sheet,1,0);
		String pw=Excel.getCellValue(XLPATH,sheet,1,1);
		String pv=Excel.getCellValue(XLPATH,sheet,1,2);
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.clickHelpMenu();
		e.clicAboutActiTIMEMenu();
		e.verifyProductVersion(pv);
		e.clickCloseButton();
		e.clickLogout();
	}
}


