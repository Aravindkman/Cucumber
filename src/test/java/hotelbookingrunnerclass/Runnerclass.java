package hotelbookingrunnerclass;

//import hotelbookingtask.Baseutilclass;

import java.io.IOException;
import java.time.Duration;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import hotelbookingbaseclass.Baseutilclass;
import com.cucumber.listener.*;

import org.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/hotelfeatures", 
				 glue = "com.stepdefinition", 
				 monochrome = true, 
				 dryRun = false, 
				 strict = false, 
				 
				//tags = "@sydney",
				plugin = {"html:Report"
						//,"com.cucumber.listener.ExtentCucumberFormatter:Reports/report3.html"
							})
				 		
public class Runnerclass extends Baseutilclass {
	
	
	public static pageobjectmanager manager = new pageobjectmanager(driver);
	
	@BeforeClass
	public static void setup() throws IOException  {
		// TODO Auto-generated method stub

		 WebDriver driver = Baseutilclass.chooseBrowser("chrome");
		 
		 enterUrl("http://adactinhotelapp.com/");
		 
		
	}
			
		 
	
	

	@AfterClass
	public static void teardown() {
		// TODO Auto-generated method stub
		
		clickbutton(manager.getLogout().getLogoutbutton());
		
		exitformall();

	}
	
	

}
	
	
	/*public void checking_Before_Title() {
		// TODO Auto-generated method stub
		
		System.out.println(driver.getTitle());

	}
	
	
	public void checking_After_Title() {
		// TODO Auto-generated method stub
		
		System.out.println(driver.getTitle());

	}
	

	
	
	
	public void loginpage_Details() throws IOException {
		// TODO Auto-generated method stub
		
		
		excelfile("D:\\sel files\\Adactin data.xlsx", 0);
		
		
		 
		
		entertext(manager.getLogin().getUsernameElement(),particularcelldata(1, 0));
		
		entertext(manager.getLogin().getPasswordElement(), particularcelldata(1, 1));
		
		clickbutton(manager.getLogin().getLoginbuttonElement());

		checkingtitle("Search");
		
		screenshot("D:\\sel files\\2.png");

	}
	
	
	public void searchpage_Details() throws IOException {
		// TODO Auto-generated method stub
		

		selectdropown(manager.getSearch().getLocationElement(), 1);
		
		selectdropown(manager.getSearch().getHotelElement(), 1);

		selectdropown(manager.getSearch().getRoomElement(), 2);
		
		selectdropown(manager.getSearch().getRoomno(),1);
		
		
		entertext(manager.getSearch().getCheckin(), "20/09/22");
	
		entertext(manager.getSearch().getCheckout(), "22/09/22");

			
		selectdropown(manager.getSearch().getPersons(),1);
				
		selectdropown(manager.getSearch().getChildElement(),0);

		

		clickbutton(manager.getSearch().getSearchElement());

		checkingtitle("Select");

		screenshot("D:\\sel files\\3.png");

	}
	
	
	
	
	
	
	
	public void selectpage_Details() throws IOException {
		// TODO Auto-generated method stub

		
		clickbutton(manager.getSelect().getChooseElement());
		
		clickbutton(manager.getSelect().getContinueElement());

		checkingtitle("Book");

		screenshot("D:\\sel files\\4.png");
		
		
	}
	
	
	public void bookingpage_Details() throws IOException {
		// TODO Auto-generated method stub

		
	
		
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

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

		clickbutton(manager.getBook().getWaitElement());
		
		checkingtitle("Select");

		screenshot("D:\\sel files\\5.png");
		
	}
	
	
	public void logoutpage_Details() throws IOException {
		// TODO Auto-generated method stub

		
		

		clickbutton(manager.getLogout().getLogoutbutton());

		checkingtitle("Logout");

		screenshot("D:\\sel files\\6.png");
		
		
		
		
	}
	
	*/
	
	



