package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	

	public RetailOrderPage () {
		PageFactory.initElements(getDriver(), this);
	}
		
	@FindBy(id="//a[@id='orderLink']")
		public WebElement orderPageOption;
	
	
	@FindBy(xpath="//img[@class='order__item-img']")
	public WebElement firstOrder;

    @FindBy(xpath="//button[@class='order__content-btn']")
	public WebElement cancelOrderButton;
   
    @FindBy(xpath="//select[@name='reason']")
	public WebElement reasonOption;


   

    @FindBy(xpath="//p['Your Order Has Been Cancelled']")
	public WebElement cancelOrderMessage;


    @FindBy(xpath="//button[@id='returnBtn']")
	public Object returnOption;

    
    @FindBy(xpath="//select[@name='reason']")
	public WebElement resonOption;

    
    @FindBy(xpath="//select[@name='dropOff']")
	public WebElement dropOffInput;


    @FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement returnButton;

    
    @FindBy(xpath="//p['Return was successfull']")
	public WebElement returnOrderMessage;

    
    @FindBy(xpath="//button[@id='reviewBtn']")
	public WebElement reviewButton;

    @FindBy(xpath="//input[@name='headline']")
	public WebElement headlineInput;

    
   @FindBy(xpath="//textarea[@id='descriptionInput']")
	public WebElement descriptionInput;

  
   @FindBy(xpath="//button[@id='reviewSubmitBtn']")
    public WebElement reviewSubmitBtn;

    @FindBy(xpath="//button[@id='reviewBtn']")
    public WebElement reviewPopUp;

   @FindBy(xpath="//button[@class='order__content-btn']")
	public WebElement cancelOrder;

   @FindBy(id="//button[@class='order__content-btn']")

public WebElement returnItemButton;


  



   
   



    


	}


