package testng.args;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/31 下午1:38
 * @Description:
 */
public class DataProvideByGroup {

    @Test(dataProvider = "dataProvideByGroup",groups = {"groupA"})
    public void testGroupA(int i){
        Assert.assertEquals(i,1);
    }

    @Test(dataProvider = "dataProvideByGroup",groups = {"groupB"})
    public void testGroupB(int i){
        Assert.assertEquals(i,2);
    }


    @DataProvider(name = "dataProvideByGroup")
    public Object[][] dataProvide(ITestContext iTestContext){
        Object[][] result = null;
        //获取include属性下的groups
        for (String group:iTestContext.getIncludedGroups()){

            System.out.println("group : " + group);

            if ("groupA".equals(group)){
                result = new Object[][]{{1}};
                break;
            }
        }

        if (result == null){
            result = new Object[][]{{2}};
        }
        return result;
    }
}
