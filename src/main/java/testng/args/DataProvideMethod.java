package testng.args;

import com.sun.corba.se.spi.ior.ObjectKey;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/31 下午1:26
 * @Description:
 */
public class DataProvideMethod {

    @Test(dataProvider = "dataProvideMethod")
    public void test1(int i, int expect){
        Assert.assertEquals(i,expect);
    }

    @Test(dataProvider = "dataProvideMethod")
    public void test2(String str, String expect){
        Assert.assertEquals(str,expect);
    }

    @DataProvider(name = "dataProvideMethod")
    public Object[][] dataProvide(Method method){

        Object[][] result = null;
        String MethodName = method.getName();
        switch (MethodName){
            case "test1":
                result = new Object[][]{{1,1},{100,100}};
                break;
            case "test2":
                result = new Object[][]{{"1","1"},{"2","2"}};
                break;
        }

        return result;
    }
}
