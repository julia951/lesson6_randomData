package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;
import pages.components.ResultsTableComponent;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    ResultsTableComponent resultsTableComponent = new ResultsTableComponent();
    TestData testData = new TestData();


    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }
}