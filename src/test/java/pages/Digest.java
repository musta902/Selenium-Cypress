package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Digest {
    public Digest () {PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

@FindBy(xpath = "//p")
public WebElement gestpage;



    
}
