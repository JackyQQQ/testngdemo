package com.fihdqa.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
    String message = "Manisha";	
    MessageUtil messageUtil = new MessageUtil(message);
	 
    @Test(dataProvider = "data-provider",dataProviderClass = Test1.class)
    public void testSalutationMessage(String value) {
        System.out.println("Inside testSalutationMessage() "+value);
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message,messageUtil.salutationMessage());
    }
}