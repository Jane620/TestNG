package testng.args;

import com.sun.corba.se.spi.ior.ObjectKey;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/31 下午1:15
 * @Description:
 */
public class DataProviderTest {

    @Test(dataProvider = "dateprovider")
    public void dataProvideTest(int number, int expect){
        System.out.println("input: " + number + ",expect: " + expect);
        Assert.assertEquals(number+10,expect);
    }


    @DataProvider(name = "dateprovider")
    public Object[][] provideData(){
        Object[][] params = new Object[][]{{10,20},{30,40},{50,60}};
        return params;
    }
}
