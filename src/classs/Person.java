package classs;

import enumm.Country;
import enumm.Gender;
import enumm.Status;

import java.time.LocalDate;

public class Person {
        private int id;
        private String firstName;
        private String lastName;
        private LocalDate localDate;
        private Country country;
        private Gender gender;
        private Status status = Status.HI_I_USE_WHATSAPP;

    public Person(int id, String firstName, String lastName, LocalDate localDate,Country country,Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.localDate = localDate;
        this.country = country;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", localDate=" + localDate +
                ", country=" + country +
                ", gender=" + gender +
                '}';
    }
}
