package tests.US001;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Page;
import utulities.ConfigReader;
import utulities.Driver;

public class TC01_AramaKutusuTesti {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Page page = new Page();
        page.aramaMotoru.sendKeys("iphone", Keys.ENTER);

        Driver.closeDriver();
        //Amazon sayfasina gidilip arama kutusu test edildi

        //Yeni kodlar eklendi



    }
}
