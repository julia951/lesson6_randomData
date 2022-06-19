package utils;

import java.util.Random;

public class RandomDataGenerator {

    public static String randomGender() {
        String[] gender = new String[]{"Male", "Female", "Other"};
        Random random = new Random();
        String randomGender = gender[random.nextInt(gender.length)];
        return randomGender;
    }

    public static String randomMonth() {
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        Random random = new Random();
        String randomMonths = month[random.nextInt(month.length)];
        return randomMonths;
    }

    public static String randomSubjects() {
        String[] subjects = {"Maths", "Economics", "English", "Biology", "Physics",
                "Chemistry", "Computer Science", "Accounting", "History"};
        Random random = new Random();
        String randomSubjects = subjects[random.nextInt(subjects.length)];
        return randomSubjects;
    }

    public static String randomHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        Random random = new Random();
        String randomHobbies = hobbies[random.nextInt(hobbies.length)];
        return randomHobbies;
    }

    public static String randomNumber() {
        Random rnd = new Random();
        return String.format("%d%d%d%03d%04d", rnd.nextInt(8), rnd.nextInt(8), rnd.nextInt(8),
                rnd.nextInt(656), rnd.nextInt(10000));
    }

    public static String randomState() {
        Random generatorState = new Random();
        String[] stateArray = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        int randomIndexState = generatorState.nextInt(stateArray.length);

        return stateArray[randomIndexState];
    }

    public static String randomCity(String state) {
        Random generatorState = new Random();
        String resultCity = randomState();
        int randomIndexCity;
        if (state == "NCR") {
            String[] cityArrayNCR = {"Delhi", "Gurgaon", "Noida"};
            randomIndexCity = generatorState.nextInt(cityArrayNCR.length);
            return cityArrayNCR[randomIndexCity];
        } else if (state == "Uttar Pradesh") {
            String[] cityArrayUttar = {"Agra", "Lucknow", "Merrut"};
            randomIndexCity = generatorState.nextInt(cityArrayUttar.length);
            return cityArrayUttar[randomIndexCity];
        } else if (state == "Haryana") {
            String[] cityArrayHaryana = {"Karnal", "Panipat"};
            randomIndexCity = generatorState.nextInt(cityArrayHaryana.length);
            return cityArrayHaryana[randomIndexCity];
        } else {
            String[] cityArrayRajasthan = {"Jaipur", "Jaiselmer"};
            randomIndexCity = generatorState.nextInt(cityArrayRajasthan.length);
            return cityArrayRajasthan[randomIndexCity];
        }
    }
}