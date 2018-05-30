package testng.ignore;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/30 上午10:53
 * @Description:
 */
public class IgonreTest {

    @Test
    public void test1(){
        Boolean flag = true;
        Assert.assertEquals(flag,Boolean.TRUE);
    }

    @Test(enabled = false)
    public void test2(){
        Boolean flag = false;
        Assert.assertEquals(flag,Boolean.TRUE);
    }

    @Test(enabled = true)
    public void test3(){
        Boolean flag = true;
        Assert.assertEquals(flag,Boolean.TRUE);
    }


}
