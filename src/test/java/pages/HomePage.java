package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePage {
<<<<<<< HEAD
    public HomePage () {PageFactory.initElements(utilities.Driver.getDriver(), this);
=======
    public HomePage() {
        PageFactory.initElements(utilities.Driver.getDriver(), this);
>>>>>>> master
    }

    @FindBy(xpath = "(//li)[1]/a")
    public WebElement AB_Testing;


    @FindBy(xpath = "//h3")
    public WebElement title;
    
    @FindBy(xpath = "//option[@selected]")
    public WebElement selected_option;

    @FindBy(xpath = "//select[@id='dropdown']")
    public WebElement dropdowElement;
    @FindBy(xpath = "//select[@id='dropdown']/option")
    public List<WebElement> dropdown_options;

    @FindBy(xpath = "//li/a")
    public List<WebElement> options;

    public void clik_On_Subpages(int sira) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        ReusableMethods.waitForPageToLoad(10);
      ReusableMethods.waitFor(5);
        options.get(sira).click();
    }

    @FindBy(css =":nth-child(8) > a")
    public WebElement digest_Auth;

  

    

}
