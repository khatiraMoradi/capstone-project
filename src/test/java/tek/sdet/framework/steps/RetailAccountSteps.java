package tek.sdet.framework.steps;



import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps  extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	private Object result;
	

	
	
	@When("User Click On Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user Clicked on Account option");
	}
	
	@When("User update Name{String} and phone{String}")
	public void userUpdateNameAndPhone(String nameValue,String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField,nameValue);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField,phoneValue);
		logger.info("user updated Name and phone values");
	}
	@When("User click on Update button")
	public void UserClickOnUpdateButton() {
	click(factory.accountPage().profileUpdateButton);
	logger.info("user clicked on Update button");
}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}
	
	
	@When(" User click on Account option")
	public void UserClickOnAccountOption() {
		click(factory.accountPage().accountOptionButton);
		logger.info("user clicked on account option");
	}
	
	
	
	@And(" User enter below information")
	public void UserEnterBelowInformation(DataTable data) {
		List<Map<String,String>>map = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassword, map.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, map.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput, map.get(0).get("confirmPassword"));
		 logger.info("User entered the below information");
	}
		
	
	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePasswordButton);
		logger.info("Password Updated Successfully");
	}
	
	@Then("a message should be displayed ‘Password Updated Successfully")
	public void messageShouldBeDisplayed() {
	waitTillPresence(factory.accountPage().changePasswordPopUp)	;
	String message="password Updated Successfully";
	Assert.assertEquals(message, result);
	logger.info("password changed");
	}
	
	
	@When("User click on Account option")
	public void userClickOnAccountOptionButton() {
		click(factory.accountPage().accountOptionButton);
		logger.info("user clicked on account option");
	}
	
	
		@And(" User click on Add a payment method link")
		public void userClickOnAddAPaymentMethodLink() {
			click(factory.accountPage().AddAPaymentMethod);
			logger.info("user clicked on add a payment method");
		}
		
		@And("User fill Debit or credit card information")
		public void userFillDebitOrCreditCardInformation(DataTable datatable) {
			List<Map<String,String>>map=datatable.asMaps(String.class,String.class);
			sendText(factory.accountPage().cardNumberInput,map.get(0).get("cardNumber"));
			sendText(factory.accountPage().nameOnCardInput,map.get(0).get("nameOnCardInput"));
			selectByVisibleText(factory.accountPage().expirationMonthInput,map.get(0).get("expirationMonthInput"));
			selectByVisibleText(factory.accountPage().expirationYearInput,map.get(0).get("expirationYearInput"));
			sendText(factory.accountPage().securityCodInput,map.get(0).get("securityCodInput"));
		}
		
		@And("User click on Add your card button")
		public void userClickOnAddYourCardButton() {
			click(factory.accountPage().addCardButton);
			logger.info("user clicked on add card button");
		}
		
		@Then("a message should be displayed ‘Payment Method added successfully")
		public void AMessageShouldBeDisplyedPaymentMethodAddedSuccessfully() {
			String actual="Pyment method updated successfully";
			String expect=getElementText(factory.accountPage().cardUpdatedPopUp);
			Assert.assertEquals(actual, expect);
			logger.info("payment method added successfully");
			
		}
		
		@When("User click on added card")
		public void userClickOnAddedCart() {
			click(factory.accountPage().addCard);
			logger.info("user click on added card");
		}
		
		
		
		
		
		@And("User click on Edit option of card section")
		public void userClickOnEditOptionOfCardSection() {
			click(factory.accountPage().Edit);
			logger.info("user click on edit option");
		}
		
		@And("user edit information with below data")
		public void userEditInformationWithBelowData(DataTable dataTable) {
			List<Map<String,String>>map=dataTable.asMaps(String.class, String.class);
			clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
			sendText(factory.accountPage().cardNumberInput,map.get(0).get("cardNumber"));
			clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
			sendText(factory.accountPage().nameOnCardInput,map.get(0).get("nameOnCard"));
			
			selectByVisibleText(factory.accountPage().expirationMonthInput,map.get(0).get("expirationMonth"));
			selectByVisibleText(factory.accountPage().expirationYearInput,map.get(0).get("expirationYear"));
			clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
			sendText(factory.accountPage().securityCodInput,map.get(0).get("securityCode"));
			logger.info("user enter the following information");
			
			
		}
		@And("user click on Update Your Card button")
		public void userClickOnUpdateYourCardButton() {
			click(factory.accountPage().paymentSubmitBtn);
			logger.info("user clicked on update card button");
		}
		
		
	   @Then("a message should be displayed ‘Payment Method updated Successfully")
	   public void AMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		   String actual="payment method updated successfully";
		   String expect=getElementText(factory.accountPage().cardUpdatedPopUp);
		   Assert.assertEquals(actual,expect);
		   logger.info("message displayed successfully");
				   
			
	   }
	   
	   @And("User click on remove option of card section")
	   public void userClickOnRemoveOptionOfCardSection() {
		  click(factory.accountPage().remove);
		  logger.info("user clicked on remove btn");
	   }
	   
	   
	   @Then("payment details should be removed")
	   public void paymentDetailsShouldBeRemoved() {
		   Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentSubmitBtn));
		   logger.info("card was removed");
	   }
	   
	   
		@When("User click on Add address option")
		public void userClickOnAddAddressOption() {
			click(factory.accountPage().addAddressIcon);
			logger.info("User clicked on add adress icon");
		}
		
	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String,String>>map=dataTable.asMaps(String.class, String.class);
		selectByValue(factory.accountPage().countrySelection,map.get(0).get("country"));
		sendText(factory.accountPage().fullNameInputForAddress,map.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumberInputForAddress,map.get(0).get("phoneNumber"));
		sendText(factory.accountPage().streetInput,map.get(0).get("streetAddress"));
		sendText(factory.accountPage().apartmentInput,map.get(0).get("apartment"));
		sendText(factory.accountPage().cityInput,map.get(0).get("city"));
		selectByValue(factory.accountPage().state,map.get(0).get("state"));
		sendText(factory.accountPage().zipCode,map.get(0).get("zipCod"));
		logger.info("user added the address information");
		
	}
	
	
	@When("User click Add Your Address button") 
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addedAddressButton);
		logger.info("user clicked in address button");
	}
	
	
	@Then("a message should be displayed ‘Address Added Successfully")
	public void AMessageShouldBeDisplayedAddressAddedSuccessfully() {
		String actual="Adress Added Successfully";
		String expect=getElementText(factory.accountPage().AddressAddedPopUp);
		Assert.assertEquals(actual, expect);
		logger.info("message was displayed successfully");
		
	}
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		waitTillPresence(factory.accountPage().editAddressOption);
		click(factory.accountPage().editAddressOption);
		logger.info("user clicked on edit address option");
	}
	
	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformationThere(DataTable dataTable) {
		List<Map<String,String>>map=dataTable.asMaps(String.class ,String.class);
		selectByValue(factory.accountPage().countrySelection,map.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullNameInputForAddress);
		sendText(factory.accountPage().fullNameInputForAddress,map.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInputForAddress);
		sendText(factory.accountPage().phoneNumberInputForAddress,map.get(0).get("phoneNumber"));
		waitTillPresence(factory.accountPage().streetInput);
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput,map.get(0).get("streetAddress"));
		sendText(factory.accountPage().apartmentInput,map.get(0).get("apt"));
		waitTillPresence(factory.accountPage().cityInput);
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput,map.get(0).get("city"));
		selectByValue(factory.accountPage().state,map.get(0).get("state"));
		waitTillPresence(factory.accountPage().zipCodeInput);
		sendText(factory.accountPage().zipCodeInput,map.get(0).get("zipCode"));
		logger.info("user updated the address information");
		
	}
	
	
	@And("User click update Your Address button")
	public void userClickUpdateYourAddressButton()	{
		click(factory.accountPage().updatedAddressButton);
		logger.info("user click on address update buttton");
		
	}
	@Then("a message should be displayed ‘Address Updated Successfully")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully(){
		String actual="Address Updated Successfully";
	    String expect=getElementText(factory.accountPage().addressUpdatePopUp);
	    Assert.assertEquals(actual,expect);
	    logger.info("Message was displayed successfuly");
	    
	}
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddress);
		logger.info("message was displayed successfully");
		
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertFalse(isElementDisplayed(factory.accountPage().remove));
		logger.info("Address was removed");
	}
}
	
