package pages;

import com.codeborne.selenide.SelenideElement;

import pages.components.CalendarComponent;
import pages.components.ResultsTableComponent;

import java.io.File;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class RegistrationPage {
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            phoneNumberInput = $("#userNumber"),
            subjectInputLabel = $("#subjectsInput"),
            hobbyCheckbox = $("#hobbiesWrapper"),
            uploadPictureInput = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            birtdayDropdown = $("#dateOfBirthInput"),
            stateDropdown = $("#state"),
            cityDropdown = $("#city"),
            stateWrapper = $("#stateCity-wrapper"),
            submitButton = $("#submit"),
            genderFemaleRadioButton = $("#genterWrapper").$(byText("Female"));

    // public String FORM_TITLE="Student Registration Form";

    CalendarComponent calendarComponent = new CalendarComponent();
    ResultsTableComponent resultsTableComponent = new ResultsTableComponent();

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        formTitle.shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationPage typeFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeLastName(String value) {
        lastNameInput.val(value);
        return this;
    }

    public RegistrationPage typeEmailAddress(String value) {
        emailInput.val(value);
        return this;
    }

    public RegistrationPage chooseFemaleGender() {
        genderFemaleRadioButton.click();
        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        birtdayDropdown.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage typePhoneNumber(String value) {
        phoneNumberInput.val(value);
        return this;
    }

    public RegistrationPage chooseSubject(String value) {
        subjectInputLabel.val(value).pressEnter();
        return this;
    }

    public RegistrationPage chooseHobby(String value) {
        hobbyCheckbox.$(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture() {
        uploadPictureInput.uploadFromClasspath(("1.png"));
        return this;
    }

    public RegistrationPage typeCurrentAddress(String value) {
        addressInput.val(value);
        return this;
    }

    public RegistrationPage chooseState(String value) {
        stateDropdown.click();
        stateWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage chooseCity(String value) {
        cityDropdown.click();
        stateWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage submitForm() {
        submitButton.click();
        return this;
    }

    public RegistrationPage scrollPage() {
        submitButton.scrollIntoView(true);
        return this;
    }

    public RegistrationPage checkFormOpened() {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        return this;
    }

    public RegistrationPage checkResult(String key, String value) {
        resultsTableComponent.checkResult(key, value);
        return this;
    }
}