package testng.instance;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/31 下午3:08
 * @Description:
 */
public class CharUtilsTest {

    @DataProvider(name = "testCharUtilsTest")
    public Object[][] dataProvide(){
        return new Object[][]{
            {'A',65},{'a',97},
            {'B',66},{'b',98},
        };
    }

    @Test(dataProvider = "testCharUtilsTest")
    public void CharToASCIITest(final char str, final int ascii){
        int result = CharUtils.CharToASCII(str);
        Assert.assertEquals(result, ascii);
    }

    @Test(dataProvider = "testCharUtilsTest")
    public void ASCIIToCharTest(final char str, final int ascii){
        char result = CharUtils.ASCIIToChar(ascii);
        Assert.assertEquals(result, str);
    }
}
