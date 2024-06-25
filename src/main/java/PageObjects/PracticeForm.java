package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm {
    WebDriver driver;

    public PracticeForm(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(id = "userEmail")
    public WebElement email;
    @FindBy(id = "userNumber")
    public  WebElement mobileNumber;
    @FindBy(id = "dateOfBirthInput")
    public  WebElement dateOfBirth;
    @FindBy(xpath = "//*[@id=\"subjectsContainer\"]/div/div[1]")
    public  WebElement subjects;
    @FindBy(id = "currentAddress")
    public WebElement currentAddress;
    @FindBy(className = "css-tlfecz-indicatorContainer")
    public WebElement dropdownState;
    @FindBy(xpath = "//*[@id=\"city\"]/div/div[1]")
    public WebElement dropdownCity;
    @FindBy(id = "submit")
    public  WebElement submitBtn;
    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    public WebElement genderMale;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
    public WebElement hobbiesSports;
    @FindBy(id = "uploadPicture")
    public WebElement uploadPicture;
    @FindBy(xpath = "//*[@id=\"state\"]/div/div[1]/div[1]")
    public WebElement uttarPradesh;
    @FindBy(xpath = "//*[@id=\"city\"]/div/div[1]/div[1]")
    public  WebElement agra;
}
