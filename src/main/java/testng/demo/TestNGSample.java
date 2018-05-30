package testng.demo;

import org.springframework.boot.test.context.SpringBootTest;
import testng.demo.HelloWorld;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 必须集成AbstractTestNGSpringContextTests类
 */
@SpringBootTest(classes = TestNGSample.class)
public class TestNGSample extends AbstractTestNGSpringContextTests{

    @Test()
    public void RandomEmailGeneratorTest(){
        HelloWorld helloWorld = new HelloWorld();
        String email = helloWorld.RandomEmailGenerator();

        Assert.assertNotNull(email);
        Assert.assertEquals(email,"test@1.com");
    }
}
