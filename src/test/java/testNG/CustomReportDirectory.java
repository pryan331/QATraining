package testNG;

public class CustomReportDirectory {

    public static void main(String[] args) {
        System.setProperty("org.uncommons.reportng.escape-output", "false");
        System.setProperty("org.uncommons.reportng.title", "TestNG Custom Report");
        System.setProperty("org.uncommons.reportng.failures-only", "false");
        System.setProperty("org.testng.reportng.xml-results", "true");
        System.setProperty("org.testng.reportng.show-parameters", "true");
        System.setProperty("org.testng.reportng.screenshots", "true");
        System.setProperty("org.testng.reportng.test-config", "testng.xml");
        System.setProperty("org.testng.reportng.report-directory", "/Users/harsh/Desktop/TestNGReports");

        org.testng.TestNG.main(args);
    }
}









