package tests.US001;

import org.testng.annotations.Test;
import pages.Page;
import utulities.ConfigReader;
import utulities.Driver;

public class TC01_AramaKutusuTesti {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


    }
}
