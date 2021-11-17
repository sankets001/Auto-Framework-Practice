package qa.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	public LoginPage(WebDriver driver)
		{	
			PageFactory.initElements(driver, this);
		}		
		@FindBy(xpath="//input[@name='username']")
		WebElement userNameTextBox;

		@FindBy(xpath="//input[@name='password']")
		WebElement passwordTextBox;

		@FindBy(xpath="//input[@value='Login']")
		WebElement loginBtn;

		public void enterUsername(String user){
			userNameTextBox.sendKeys(user);
		}
		public void enterPassword(String pass){
			passwordTextBox.sendKeys(pass);
		}
		public void clickonLoginBtn() {
			loginBtn.click();
		}	

}