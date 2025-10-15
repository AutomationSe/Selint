package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {

    @Test(dataProvider = "hhm")
    public void testlogin(String username, String password){
        System.out.println("User has Logged in username: "+username+" and password: "+password);

    }

    //supply multiple sets of data to the above Test method
    //3 sets of data
    @DataProvider(name = "hhm")
    public Object[][] dataMethod(){
         Object[][] data = {{"arun","123"},{"varun","456"},{"senel","785"}};
        return data;
    }


}
