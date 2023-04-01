package tek.sdet.framework.steps;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
	
	
	@Given("User is on retail websit")
	public void UserIsOnRetailWebsit() {
		String expectedTitle ="React App";
		String actualTitle= getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle+"is equal to"+expectedTitle);
			
		}


	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allSection);
		logger.info("user clicked on all section");
	}
	
	
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionArePresentInShopByDepartmentSidebar(DataTable dataTable) {
    
	List<List<String>>shopByDepartment=dataTable.asLists(String.class);
	for(int i=0;i<shopByDepartment.get(0).size();i++) {
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[test()='" + shopByDepartment.get(0).get(i)+"']"))));
		logger.info(shopByDepartment.get(0).get(i)+"is present");
		
	}
	}
	@And("User on{String}")
	public void userOnElectronics(String department) {
		List<WebElement>dep=factory.homePage().sideBar;
		for(WebElement element: dep) {
			if(element.getText().equals(department)) {
				element.clear();
				break;
				
			}
		}
	}
	@Then("below options are present in departmen")
	public void belowOptionArePresentInDepartment(DataTable dataTable) {
		List<List<String>>departmentOptions=dataTable.asLists(String.class);
		List<WebElement>dep=factory.homePage().sideBar;
		for(int i=0; i<departmentOptions.get(0).size(); i++) {
			for(WebElement element:dep) {
				if(element.getText().equals(departmentOptions.get(0).get(i))) {
					Assert.assertTrue(element.isDisplayed());
					logger.info(element.getText()+"is present");
							
				}
				}
			}
		}
		
		@When("User change the category to {String}")
		public void userChangeTheCategoryTo(String Value) {
			selectByVisibleText(factory.homePage().allDepartment, Value);
		logger.info(Value+"was selected from the drop down");
	}
		
		
		@When("User search for an item {String}")
		public void userSearchForAnItem(String value) {
			sendText(factory.homePage().searchInputField,value);
			logger.info("user entered"+value);
		}
		
		
		@When("User click on Search icon")
		public void userClickOnSearchIcon() {
			click(factory.homePage().searchButton);
			logger.info("user clicked on search button");
		}
		
		
		@When("User click on item")
		public void userClicKOnItem() {
			waitTillPresence(factory.homePage().productNameItem);
			click(factory.homePage().productNameItem);
			
			logger.info("user clicked on item");
		}
		
		@When("User select quantity {String}")
		public void userSelectQuantity(String qty) {
			selectByVisibleText(factory.homePage().Qty2, qty);
			logger.info("user selected quantity" +qty);
			
			
		}
		
		@When("User click add to Cart button")
		public void userClickAddToCartButton() {
			click(factory.homePage().addToCartButton);
			logger.info("user clicked add to cart button");
		}
		
		@Then("the cart icon quantity should change to {String}")
		public void theCartIconQuantityShouldChangeTo(String expectedQuantity) {
			Assert.assertEquals(expectedQuantity,factory.homePage().cartQuantity.getText());
			logger.info(expectedQuantity +"is displayed");
			
			
		}
		
		@Then("User click on Cart option")
		public void userClickOnCartOption() {
			click (factory.homePage().cart);
			logger.info("user clicked on cart");
			
			
		}
		
		@Then("User click on Proceed to Checkout button")
		public void userClickedOnProceedToCheckoutButton() {
			click (factory.homePage().proceedToCheckout);
			logger.info("user clicked on proceed to checkout button");
		}
		
		@Then("User click Add a new address link for shipping address")
		public void userClickAddNewAddressLinkForShippingAddress() {
			click(factory.homePage().addAddressButton);
			logger.info("user clicked add a new address button");
		}
		
		@Then("User click Add a credit card or Debit Card for Payment method")
		public void userClickAddAcreditCardOrDebitCardForPaymentMethod() {
			click(factory.homePage().AddPymentBtn);
			logger.info("user clicked on add payment button");
		}
		
		@Then("User click on Place Your Order")
		public void userClickedOnPlaceYourOrder() {
			waitTillClickable(factory.homePage().placeOrderBtn);
			click(factory.homePage().placeOrderBtn);
			logger.info("user clicked on place order button");
		}
			
		}
		
		

		
