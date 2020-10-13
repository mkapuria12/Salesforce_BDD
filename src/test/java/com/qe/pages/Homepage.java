package com.qe.pages;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qe.utils.TestBase;

public class Homepage extends TestBase{
	
	public Homepage(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	WebElement uName;
	public void LoginUsername()
	{
		bUti.waitForPageElementToVisible(uName);
		uName.sendKeys(prop.getProperty("username"));
	}
	
	@FindBy(id="password")
	WebElement uPass;
	public void loginPassword()
	{
		bUti.waitForPageElementToVisible(uPass);
		uPass.sendKeys(prop.getProperty("pass"));
	}
	
	@FindBy(id="Login")
	WebElement loginButton;
	public void login()
	{
		bUti.waitForPageElementToVisible(loginButton);
		loginButton.click();
	}
	
	
	@FindBy(id="userNavLabel")
	WebElement validateUser;
	public String validateUserOnHomepage(){
		bUti.waitForPageElementToVisible(validateUser);
		String name=validateUser.getText();
		return name;	
	}
	
	@FindBy(id="userNavLabel")
	WebElement validateLastname;
	public String validatelastname(){
		bUti.waitForPageElementToVisible(validateLastname);
		String lName=validateLastname.getText();
		return lName;	
	}
	
	@FindBy(xpath="//div[@id='userNav-arrow']")
	WebElement usersDropdown;
	public void usersMenu()
	{
		bUti.waitForPageElementToVisible(usersDropdown);
		usersDropdown.click();
	}
	
	
	@FindBy(xpath="//a[contains(text(),'My Profile')]")
	WebElement myProfileButton;
	public void myProfile()
	{
		bUti.waitForPageElementToVisible(myProfileButton);
		myProfileButton.click();
	}

	
	@FindBy(xpath="//a[contains(@class,'contactInfoLaunch editLink')]//img")
	WebElement editProfileButton;
	public void editProfile()
	{
		bUti.waitForPageElementToVisible(editProfileButton);
		editProfileButton.click();	
	}
	
	@FindBy(id="contactInfo")
	WebElement contact;
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement editProfile_about;
	public void about()
	{
		
		bUti.waitForPageElementToVisible(contact);
		driver.switchTo().frame("contactInfoContentId");
		bUti.waitForPageElementToVisible(editProfile_about);
		editProfile_about.click();
	}
	
	@FindBy(id="lastName")
	WebElement update_Lastname;
	public void aboutLastname()
	{
		bUti.waitForPageElementToVisible(update_Lastname);
		update_Lastname.clear();
		update_Lastname.sendKeys(prop.getProperty("lastName"));
	}
	
	
	@FindBy(xpath="//input[@class='zen-btn zen-primaryBtn zen-pas']")
	WebElement saveAllButton;
	public void saveAll()
	{
		bUti.waitForPageElementToVisible(saveAllButton);
		saveAllButton.click();
	}
	
}
