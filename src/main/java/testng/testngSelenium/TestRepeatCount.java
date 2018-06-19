package testng.testngSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/31 下午4:09
 * @Description:
 */
public class TestRepeatCount {

    @Test(invocationCount = 5)
    public void repeatCount(){
        System.out.println("repeat: ");
    }

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void repeatThreadCount(){
        System.out.println("thread id :" + Thread.currentThread().getId());
    }



    @Test(invocationCount = 1)
    public void loadTestWebsite(){
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.yiibai.com");
        String title = webDriver.getTitle();
        System.out.println("web page title:" + title);
        Assert.assertEquals("google",title);
        //webDriver.quit();
    }

}
