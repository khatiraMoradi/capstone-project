package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	
	@FindBy(id="hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath="//div[@class='sidebar-content-item']/span")
	public List<WebElement>sideBarElements;
	
	@FindBy(xpath="//span[text()='Electronics']/span")
	public WebElement electronicsSideBar;
	
	@FindBy(xpath="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	@FindBy(xpath="//span[text()='Smort Home']")
	public WebElement smartHomeSideBar;
	
	@FindBy(xpath="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	@FindBy(xpath="//text()='Automative']")
	public WebElement automativeSideBar;
	
	@FindBy(xpath="//dive[@class='sidebar_content-item']/span")
	public List<WebElement>sideBarOptionElements;
	
	

	@FindBy(id="ProfileImage")
	public WebElement ProfileImage;

	
    
    
    @FindBy(id="accountLink")
	public WebElement accountOption;
    
    
    @FindBy(id="signinLink")
	public WebElement signInOption;
    
   @FindBy(xpath="//button[@class='w-full  login__valid login__submit']")
	public WebElement loginButton;

   
     @FindBy(xpath="//span['All']")
     public WebElement allSection;

     @FindBy(xpath="//h1[@class='sidebar__content-header']")
	public List<WebElement> sideBar;

     @FindBy(xpath="//button[@id='hamburgerBtn']")
	public WebElement allDepartment;

     @FindBy(id="//input[@id='searchInput']")
	public WebElement searchInputField;

     
     @FindBy(xpath="//h1[@class='product__name']")
	public WebElement productNameItem;

     @FindBy(xpath="//label[@class='product__cart-qty']")
	public WebElement Qty2;

     @FindBy(xpath="//span['Add to Cart']")
	public WebElement addToCartButton;

     @FindBy(xpath="//input[@class='cart__item-quantity']")
	public Object cartQuantity;

     
     @FindBy(xpath="//p['Cart' ]")
	public WebElement cart;

     
     @FindBy(id="//button[@id='proceedBtn']")
	public WebElement proceedToCheckout;
     
     
    @FindBy(id="//button[@id='addAddressBtn']")
	public WebElement addAddressButton;

    @FindBy(id="//button[@id='addPaymentBtn']")
	public WebElement AddPymentBtn;

    @FindBy(id="//button[@id='placeOrderBtn']")
	public WebElement placeOrderBtn;


     
   

  

    
  
	
	
	

	

}
