package testng.exception;


import org.testng.annotations.Test;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/30 上午10:31
 * @Description:
 */
public class TestRuntime {

    /**
     * 测试异常，当抛出指定的异常时被捕获，则认为测试通过
     * 如果测试过程没有捕获，则认为测试失败
     */
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException(){
        int i = 1/1;
        System.out.println("after division the i is:" +i);
    }
}
