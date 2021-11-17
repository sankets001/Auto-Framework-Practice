package sampleTest;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.crm.base.TestBase;
import qa.crm.pages.LoginPage;

public class SampleTest1 extends TestBase{
	LoginPage log;
	public SampleTest1() throws IOException {
		super();
		}
	
	@BeforeMethod
	public void sampletest1() throws IOException{
		initialization();
		log = new LoginPage(driver);
	}	
	@Test
	public void samplelogin() throws IOException {
		log.enterUsername(prop.getProperty("user"));
		log.enterPassword(prop.getProperty("pass"));
		log.clickonLoginBtn();
		
	}
}
