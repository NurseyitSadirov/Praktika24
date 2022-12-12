package classs;

import enumm.Country;
import enumm.Gender;
import enumm.Status;

import java.time.LocalDate;

public class Passport extends Person {
    public Passport(int id, String firstName, String lastName, LocalDate localDate, Country country, Gender gender) {
        super(id, firstName, lastName, localDate, country, gender);
    }

    //id,firstName,lastName,localDate,country,gen
}