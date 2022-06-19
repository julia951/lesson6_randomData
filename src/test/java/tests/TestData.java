package tests;

import com.github.javafaker.Faker;
import java.io.File;
import java.util.Locale;

import static utils.RandomDataGenerator.*;

public class TestData {

    Faker faker = new Faker(new Locale("en"));

    String firstName= faker.address().firstName(),
            lastName= faker.address().lastName(),
            email= faker.internet().emailAddress(),
            phoneNumber= randomNumber(),
            gender= randomGender(),
            month=  randomMonth(),
            year= String.valueOf(faker.number().numberBetween(1970, 2000)),
            day=  String.valueOf(faker.number().numberBetween(1, 28)),
            subject= randomSubjects(),
            hobby= randomHobbies(),
            address= faker.address().streetAddress(),
            picture ="./img/1.png",
            state= randomState(),
            city= randomCity(state),
            successModalWindow= "Thanks for submitting the form";
}
