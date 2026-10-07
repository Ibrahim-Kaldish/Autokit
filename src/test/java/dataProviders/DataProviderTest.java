package dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @DataProvider (name = "validCredentails")
    public Object[][] validCredentails() {
        return new Object[][]{};
    }

    @DataProvider (name = "invalidCredentails")
    public Object[][] invalidCredentails() {
        return new Object[][]{};
    }

}
