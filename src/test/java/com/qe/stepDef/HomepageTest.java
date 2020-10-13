package com.qe.stepDef;

import org.testng.Assert;

import com.qe.pages.Homepage;
import com.qe.utils.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;


public class HomepageTest extends TestBase{
	
	Homepage hp;
	public static Logger log = Logger.getLogger(HomepageTest.class.getName());

	@Given("^I am logged in sucessfully$")
	public void I_am_logged_in_sucessfully() throws Throwable {
		bUti.initialization();
		bUti.URL();
		hp=new Homepage();
		hp.LoginUsername();
	    hp.loginPassword();
	    hp.login();
	    String homepageValidate=hp.validateUserOnHomepage();
	    Assert.assertEquals("Mitali K", homepageValidate);
	    log.info("logged in successfully!");
	}

	@When("^I click on user menu and click My profile option$")
	public void i_click_on_user_menu_and_click_My_profile_option() throws Throwable {
	    hp.usersMenu();
	    hp.myProfile();
        Assert.assertTrue(true);
        log.info("Naviagted to profile page.");
	}

	@When("^I click on edit profile button to edit contact information$")
	public void i_click_on_edit_profile_button_to_edit_contact_information() throws Throwable {
		
		hp.editProfile();
        Assert.assertTrue(true);	    
	}

	@Then("^I click on About tab and enter Lastname and click on save all button$")
	public void i_click_on_About_tab_and_enter_Lastname_and_click_on_save_all_button() throws Throwable {
	    hp.about();
	    hp.aboutLastname();
	    hp.saveAll();
        Assert.assertTrue(true);
        log.info("Lastname is updated.");
        driver.switchTo().defaultContent();

	}

	@Then("^I validate lastname whether it is saved or not$")
	public void i_validate_lastname_whether_it_is_saved_or_not() throws Throwable {

		String lastname=hp.validatelastname();
	   Assert.assertEquals("Mitali Kapuria",lastname ,"Validated lastname");
	}
}
