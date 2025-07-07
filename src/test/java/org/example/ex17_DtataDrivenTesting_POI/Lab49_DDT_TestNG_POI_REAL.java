package org.example.ex17_DtataDrivenTesting_POI;

import org.example.CommonToAll;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab49_DDT_TestNG_POI_REAL extends CommonToAll {



    @Test(dataProvider = "getData")
    public void test_vwo_login(String email, String password) {
        System.out.println(email + " - " + password);
    }

    @DataProvider
    public  Object[][] getData(){
        return UtilExcel.getTestDataFromExcel("sheet1");
    }
}
