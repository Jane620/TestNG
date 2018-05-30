package testng.group;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/30 下午3:12
 * @Description:
 */
public class TestGroup {

    @BeforeGroups("database")
    public void setupDB() {
        System.out.println("setupDB()");
    }

    @AfterGroups("database")
    public void cleanDB() {
        System.out.println("cleanDB()");
    }

    @Test(groups = "selenium-test")
    public void runSelenium(){
        System.out.println("runSelenium()");
    }

    @Test(groups = "selenium-test")
    public void runSelenium1(){
        System.out.println("runSelenium1()");
        Assert.assertEquals(Boolean.FALSE, Boolean.TRUE);
    }

    @Test(groups = "database")
    public void testDBConnection(){
        System.out.println("testDBConnection()");
    }

    @Test(groups = "database")
    public void testDBConnection1(){
        System.out.println("testDBConnection1()");
    }

    @Test(dependsOnGroups = {"selenium-test","database"})
    public void testOther(){
        System.out.println("testOther()");
    }

}
