package testng.timeout;

import org.testng.annotations.Test;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/30 上午11:39
 * @Description:
 */
public class TimeOut {

    @Test(timeOut = 5000)
    public void timeOut1() throws InterruptedException{
        Thread.sleep(4000);
    }

    @Test(timeOut = 5000)
    public void timeOut2() throws InterruptedException{
        Thread.sleep(6000);
    }

}
