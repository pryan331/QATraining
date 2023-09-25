package org.java.ForTest;
public class TestMessage {
    private String message;
    public TestMessage(String message) {
        this.message = message;
    }
    public String printMessage() {
        System.out.println(message);
        return message;
    }
    public String WelcomeMessage() {
        message = "tekSyntaxInc" + message;
        System.out.println(message);
        return message;
    }
    public String addMessage() {
        message = "www." + message;
        System.out.println(message);
        return message;
    }
}