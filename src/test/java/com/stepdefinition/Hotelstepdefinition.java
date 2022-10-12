package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hotelbookingbaseclass.Baseutilclass;
import hotelbookingrunnerclass.pageobjectmanager;

public class Hotelstepdefinition extends Baseutilclass {
	

	
	public static pageobjectmanager manager = new pageobjectmanager(driver);
	
	
	

	@Before(order=0,value = "@sydney")
	public void signin() {
		// TODO Auto-generated method stub
		
		

		//entertext(manager.getLogin().getUsernameElement(),username="loguinsdet");
		
//	entertext(manager.getLogin().getPasswordElement(),password= "loguin");
		
	
		
	}
	
	@After(order=1)
	public void signout() {
		// TODO Auto-generated method stub
		
		clickbutton(manager.getLogout().getLogoutbutton());

	}

	
	
	@When("^user clicks login button \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_clicks_login_button(String username , String password) throws Throwable{
		
		
		entertext(manager.getLogin().getUsernameElement(),username);
		
		entertext(manager.getLogin().getPasswordElement(),password);
		
	
	clickbutton(manager.getLogin().getLoginbuttonElement());
	
	}
	
	@When("^user enters the requirements with (\\d+) and (\\d+) $")
	public void user_enters_the_requirements_with(int location, int hotel) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		
		selectdropown(manager.getSearch().getHotelElement(), location);
		
		selectdropown(manager.getSearch().getHotelElement(), hotel);

		selectdropown(manager.getSearch().getRoomElement(), 2);
		
		selectdropown(manager.getSearch().getRoomno(),1);
		
		
		entertext(manager.getSearch().getCheckin(), "20/09/22");
	
		entertext(manager.getSearch().getCheckout(), "22/09/22");

			
		selectdropown(manager.getSearch().getPersons(),1);
				
		selectdropown(manager.getSearch().getChildElement(),0);

		

		clickbutton(manager.getSearch().getSearchElement());
		
	}

		
	
	
		@And("^user selects the room$")
		public void user_selects_the_room() throws Throwable{
			
			clickbutton(manager.getSelect().getChooseElement());
			
			clickbutton(manager.getSelect().getContinueElement());

			
			
		}
		

		

		@And("^user enters the booking details$")
		public void user_enters_the_booking_details() throws Throwable{
			
			entertext(manager.getBook().getFirstnameElement(), "Manick");
			
			entertext(manager.getBook().getSecondElement(),"basha");

			entertext(manager.getBook().getAddressElement(),"998" + Keys.ENTER + "british colony" + Keys.ENTER);
			
			entertext(manager.getBook().getCcElement(),"9875624587456254");
			
			selectdropown(manager.getBook().getCcvElement(),2);
			
			selectdropown(manager.getBook().getMonthElement(),3);	
					
			selectdropown(manager.getBook().getYearElement(), 12);		
			
			entertext(manager.getBook().getCvvElement(),"987");
			
			clickbutton(manager.getBook().getBooknowElement());

					
			log.info("Waiting for the button visibility");
		}
		
		
		
		@Then("^booking has been completed$")
		public void booking_has_been_completed() throws Throwable{
			

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			

			clickbutton(manager.getBook().getWaitElement());
			
			checkingtitle("Select");
			
		}

		

	
		
		
		
	
}



