package testNG;

import org.testng.annotations.Test;

public class DependentTest {
    @Test
    public void StartApp(){
        System.out.println("application starting");
    }
    @Test(dependsOnMethods = "StartApp")
    public void performLogin(){
        System.out.println("user will login.");
    }
    @Test(dependsOnMethods = "performLogin")
    public void performAction(){
        System.out.println("User is performing an action");
    }
}
