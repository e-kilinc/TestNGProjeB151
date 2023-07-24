package pages;

import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class Page {
    public Page() {
        PageFactory.initElements(Driver.getDriver(),this);




    }
}
