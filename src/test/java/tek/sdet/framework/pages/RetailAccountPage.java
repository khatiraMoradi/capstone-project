package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage  extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath="//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy(id="nameInput")
	public WebElement profileNameInputField;
	
    @FindBy(id="personalPhoneInput")
   public WebElement profilePhoneNumberField;
    
    @FindBy(xpath="//button[text()=\'Update\']")
    public WebElement profileUpdateButton;
    
    @FindBy(xpath="//div[text()='personal Information Update Successfully']")
    public WebElement personalInfoUpdateSuccessMessage;
    
    
    @FindBy(id="//input[@id='previousPasswordInput']")
    public WebElement previousPasswordFiled;
    
    
    @FindBy(id="//input[@id='previousPasswordInput']")
    public WebElement PasswordValue;
    
    @FindBy(id="//input[@id='newPasswordInput']")
    public WebElement newPasswordFiled;
    
    @FindBy(xpath="//input[@value='Khatira@1234']")
    public WebElement newPasswordValueFiled;

	@FindBy(xpath="//input[@name='confirmPassword']")
	public WebElement confirmPasswordFiled;
	
	@FindBy(xpath="//input[@value='Khatira@1234']")
	public WebElement confirmPasswordValueFiled;
	
	@FindBy(id="//a[@id='accountLink']")
	public WebElement accountOptionButton;
	
	@FindBy(id="//button[@id='credentialsSubmitBtn']")
    public WebElement changePasswordButton;
	
	@FindBy(id="//label[@class='font-bold account__payment-new-label']")
	public WebElement cardNumber;
	
	@FindBy(xpath="//p[@class='text-sm text-blue-700 hover:underline hover:text-red-700']")
	public WebElement AddAPaymentMethod;
	
   @FindBy(xpath="//input[@class='account__payment-new-input']")
   public WebElement cardNumberFiled,cardValue;
   
   @FindBy(xpath="//label[@class='font-bold  w-5/12 text-right text-sm']")
   public WebElement nameOnCard;
   
   @FindBy(id="//input[@id='nameOnCardInput']")
   public WebElement nameOnCardFiled;
   
   
   
   
   @FindBy(xpath="//label[@class='font-bold  w-5/12 text-right text-sm']")
   public WebElement expirationMonth;
   
   @FindBy(xpath="//select[@name='expirationMonth']")
   public WebElement expirationMonthFild;
   
   @FindBy(xpath="//select[@name='expirationYear']")
   public WebElement expirationYear;
   
   
   
   @FindBy(xpath="//input[@name='email']")
   public WebElement EmailInputFiled;
   
   
   @FindBy(xpath="//input[@name='password']")
   public WebElement PasswordInputFiled;
   
   
   
   @FindBy(xpath="//input[@name='confirmPassword']")
   public WebElement confirmPasswordInput;
   
    
   @FindBy(xpath="//input[@name='newPassword']")
   public WebElement newPasswordInput;
   
   
   @FindBy(xpath="previousPassword")
   public WebElement previousPassword;
   
   
   
   
   @FindBy(xpath="//button[@id='credentialsSubmitBtn']")
   public WebElement changePasswordPopUp;
   
   
   
   @FindBy(xpath="//input[@name='cardNumber']")
   public WebElement cardNumberInput;


   
    @FindBy(xpath="//input[@name='nameOnCard']")
    public WebElement nameOnCardInput;
    
    
    
    @FindBy(xpath="//select[@name='expirationMonth']")
	public WebElement expirationMonthInput;

    
    @FindBy(xpath="//select[@name='expirationYear']")
	public WebElement expirationYearInput;

    
    @FindBy(xpath="//input[@name='securityCode']")
	public WebElement securityCodInput;
    
    
    @FindBy(id="//button[@id='credentialsSubmitBtn']")
	public WebElement addCardButton;
    
    
    
    @FindBy(id="//button[@id='paymentSubmitBtn']")
	public WebElement addCard;
    
    
    @FindBy(xpath="//input[@name='securityCode']")
	public Object securityCodeInput;
    
    @FindBy(id="//button[@id='paymentSubmitBtn']")
	public WebElement paymentSubmitBtn;

    
    @FindBy(xpath="//button[@class='text-blue-800 cursor-pointer hover:underline']")
	public WebElement Edit;
    
    @FindBy(xpath="//button[@class='text-blue-800 cursor-pointer hover:underline']")
	public WebElement remove;

    
    @FindBy( xpath="//button[@class='account__btn-submit']")
	public WebElement cardUpdatedPopUp;

    
    @FindBy(xpath="//p['Add Address']")
	public WebElement addAddressIcon;
    
    
    @FindBy(id="//select[@id='countryDropdown']")
	public WebElement countrySelection;

    
    @FindBy(xpath="//input[@name='fullName']")
	public WebElement fullNameInputForAddress;
    
    @FindBy(xpath="//input[@name='phoneNumber']")
	public WebElement phoneNumberInputForAddress;

    @FindBy(xpath="//input[@name='street']")
	public WebElement streetInput;
    
    
    @FindBy(xpath="//input[@name='apartment']")
	public WebElement apartmentInput;
    
    
    @FindBy(xpath="//input[@name='city']")
	public WebElement cityInput;
    
    
    @FindBy(xpath="//select[@name='state']")
	public WebElement state;

    @FindBy(xpath="//input[@name='zipCode']")
	public WebElement zipCode;

    
    @FindBy(xpath="//p['Add Address']")
	public WebElement addedAddressButton;
    
    
    @FindBy(xpath="//button[@class='account__address-btn']")
	public WebElement editAddressOption;
   
    @FindBy(xpath="//p['Add Address']")
	public WebElement AddressAddedPopUp;
    
    @FindBy(id="//input[@id='zipCodeInput']")
	public WebElement zipCodeInput;

    @FindBy(id="//button[@id='addressBtn']")
	public WebElement updatedAddressButton;

    @FindBy(id="//button[@id='addressBtn']")
	public WebElement addressUpdatePopUp;

    
    @FindBy(xpath="//button[@class='account__address-btn']")
	public WebElement removeAddress;

    
   
}
 
	

