package com.fihdqa.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
    String message = "Manisha";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(dataProvider = "data-provider")
    public void testPrintMessage(String value) {
        System.out.println("Inside testPrintMessage()"+" "+value);
	Assert.assertEquals(message, messageUtil.printMessage());
    }
    
    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod() {
        return new Object[][] { { "one" }, { "two" },{ "three" } };
    }
    
//    @Test(expectedExceptions = ArithmeticException.class)
//    public void testPrintMessage() {	
//        System.out.println("Inside testPrintMessage()");     
//        messageUtil.printMessage();    
//    }

}