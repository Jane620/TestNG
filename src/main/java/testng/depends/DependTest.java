package testng.depends;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/30 下午5:01
 * @Description:
 */
public class DependTest {

    @Test
    public void testMethod(){
        Assert.assertEquals(Boolean.TRUE,Boolean.TRUE);
    }

    /**
     * 其中groups也可以放置在class上，用于其他类调用的依赖
     */
    @Test(groups = "testgroup")
    public void testGroup(){
        Assert.assertEquals(Boolean.TRUE,Boolean.TRUE);
    }

    @Test(dependsOnMethods = "testMethod")
    public void dependsMethod(){
        System.out.println("dependsMethod");
    }

    @Test(dependsOnGroups = "testgroup")
    public void dependsGroup(){

    }


}
