package testng.config;

import org.testng.annotations.*;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/29 下午10:35
 * @Description:
 */
public class DBConfig {

    @BeforeSuite()
    public void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite()
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }

    @BeforeTest()
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest()
    public void afterTest() {
        System.out.println("@AfterTest");
    }

}
