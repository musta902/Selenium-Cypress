package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DragandDropPage;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class dropanddragTest {
    HomePage hp = new HomePage();
    DragandDropPage dp = new DragandDropPage();
    Actions action = new Actions(Driver.getDriver());

    @Test
    public void droganddrop() {
        hp.clik_On_Subpages(9);
        ReusableMethods.waitFor(5);
        Assert.assertEquals(dp.title_A.getText(), "A");

        action.dragAndDrop(dp.option_A, dp.option_B).build().perform();
        /*
         * hp.dropdowElement.click();
         * Assert.assertEquals(hp.dropdown_options.size(), 3);
         * 
         * 
         * Assert.assertNotEquals(hp.selected_option.getText(), "Option 1");
         * hp.dropdown_options.get(1).click();
         * Assert.assertEquals(hp.selected_option.getText(), "Option 1");
         * 
         * hp.dropdown_options.get(2).click();
         * Assert.assertEquals(hp.selected_option.getText(), "Option 2");
         */

    }
}
