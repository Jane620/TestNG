package testng.args;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/30 下午5:10
 * @Description:
 */
public class TestParameterXML {

    Connection connection;

    public static final String location = "/src/main/java/testng/args/";

    @Test
    @Parameters({"dbconfig","poolsize"})
    public void createConnection(String dbconfig, int poolsize){
        System.out.println("dbconfig:" + dbconfig);
        System.out.println("poolsize:"+ poolsize);

        Properties properties = new Properties();
        InputStream inputStream = null;

        try {
            String path = System.getProperty("user.dir") + "/" + dbconfig;
            System.out.println("path : " + path);

            properties.load(new FileInputStream(dbconfig));

            String drivers = properties.getProperty("jdbc.driver");
            String connnetionURL = properties.getProperty("jdbc.url");
            String username = properties.getProperty("jdbc.username");
            String passwd = properties.getProperty("jdbc.password");

            System.out.println("drivers : " + drivers);
            System.out.println("connnetionURL : " + connnetionURL);
            System.out.println("username : " + username);
            System.out.println("passwd : " + passwd);

            Class.forName(drivers);

            connection = DriverManager.getConnection(connnetionURL,username,passwd);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }
    }


}
