package testNG;

import org.java.ForTest.TestMessage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Messagetest {
    String message = ".us";
    TestMessage testMessage = new TestMessage(message);

    @Test(groups = {"functionalTest", "SmokeTest"})
    public void printTest() {
        System.out.println("inside print test");
        message = ".us";
        Assert.assertEquals(message, testMessage.printMessage());
    }

    @Test(groups = {"SmokeTest"},priority = 1)
    public void welcomeMessage() {
        System.out.println("inside welcome Message");
        message = "tekSyntaxInc" + ".us";
        Assert.assertEquals(message, testMessage.WelcomeMessage());
    }

    @Test(groups = {"functionalTest"},priority = 2)
    public void CompleteMessage() {
        System.out.println("inside complete message");
        message = "www." + "tekSyntaxInc" + ".us";
        Assert.assertEquals(message, testMessage.addMessage());
    }
}