package tests;

import org.junit.jupiter.api.Test;

public class TestFormTests extends TestBase {

    @Test
    void successfullTest() {

        registrationPage.openPage()
                .typeFirstName(testData.firstName)
                .typeLastName(testData.lastName)
                .typeEmailAddress(testData.email)
                .chooseFemaleGender()
                .typePhoneNumber(testData.phoneNumber)
                .setDateOfBirth(testData.day, testData.month, testData.year)
                .chooseSubject(testData.subject)
                .chooseHobby(testData.hobby)
                .uploadPicture()
                .typeCurrentAddress(testData.address)
                .chooseState(testData.state)
                .chooseCity(testData.city)
                .submitForm()
                .checkFormOpened()
                .checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Student Email", testData.email)
                .checkResult("Gender", "Female")
                .checkResult("Mobile", testData.phoneNumber)
                .checkResult("Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                .checkResult("Subjects", testData.subject)
                .checkResult("Hobbies", testData.hobby)
                .checkResult("Picture", "1.png")
                .checkResult("Address", testData.address)
                .checkResult("State and City", testData.state + " " + testData.city);
    }
}