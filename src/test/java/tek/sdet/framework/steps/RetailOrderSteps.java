package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory=new POMFactory();
	
	@When("User click on Orders section")
		public void userClickOnOrdersSection() {
		click(factory.orderPage().orderPageOption);
		logger.info("user cliked on order option");
	}
	
		@When("User click on first order in list")
		public void userClickOnFirstOrderInList() {
			click(factory.orderPage().firstOrder);
			logger.info("user clicked on first order list");
		}
		
		@And("User click on Cancel The Order button")
		public void userClickOnCancelOrderButton() {
			click(factory.orderPage().cancelOrderButton);
			logger.info("user clicked on cancel order");
		}
		
		@And("User select the cancelation Reason {String}")
		public void userSelectTheCancelationReasonBoughtWrongItem(String Element) {
			selectByVisibleText(factory.orderPage().reasonOption,Element);
			logger.info("user selected the bought worng item reason");
			
		}
		
		@And("User click on Cancel Order button")
		public void userClickOnCancelOrderButton1() {
			click(factory.orderPage().cancelOrder);
			logger.info("user clicked on cancel order");
		}
		
		@Then("a cancelation message should be displayed {String}")
		public void ACancelationMessageShouldBeDisplayed(String str) {
			
			String expect=str;
			String actual=getElementText(factory.orderPage().cancelOrderMessage);
			Assert.assertEquals(actual,expect);
			logger.info("cancelation message displayed");
			
		}
		
		@And("User click on Return Items button")
		public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnItemButton);
		
			logger.info("user click on return option");
		}
		
		@And("User select the Return Reason {String}")
		public void userSelectTheReturnReason(String element) {
			selectByVisibleText(factory.orderPage().resonOption , element);
			logger.info("user selected damaged reason");
		}
		@And("User select the drop off service {String}")
		public void userSelectTheDropOffService(String element){
			selectByVisibleText(factory.orderPage().dropOffInput ,element);
			logger.info("user selected the drop off service");
			
		}
		@And("User click on Return Order button")
		public void userClickOnReturnOrderButton() {
			click(factory.orderPage().returnButton);
			logger.info("user clicked on order button");
		}
		@Then("a cancelation message should be displayed {String}")
		public void ACancelationMessageShouldBeDisplayedReturnWasSuccessful(String str) {
			String expect=str;
			String actual=getElementText(factory.orderPage().returnOrderMessage);
			Assert.assertEquals(actual ,expect);
			logger.info("the message was displayed");
		}
		@When("User click on Review button")
		public void userClickOnReviewButton() {
			click(factory.orderPage().reviewButton);
			logger.info("user clicked on review button");
		}
		@When("User write Review headline {String} and {String}")
		public void userWriteReviewHeadlineAnd(String string,String string2) {
			sendText(factory.orderPage().headlineInput, string);
			sendText(factory.orderPage().descriptionInput, string2);
			logger.info("user fill the form");
			
		}
		
		@When("User click Add your Review button")
		public void userClickAddYourReviewButton() {
			click(factory.orderPage().reviewSubmitBtn);
			logger.info("user clicked on reviewSubmitBtn");
		}
		
		@Then("a review message should be displayed {String}")
		public void AReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully(String str) {
			String expect="str";
			String actual=getElementText(factory.orderPage().reviewPopUp);
			Assert.assertEquals(actual ,expect);
			logger.info("the message was displayed");
		}
}
	    