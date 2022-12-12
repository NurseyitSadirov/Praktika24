package service.impl;

import classs.Passport;
import classs.Person;
import classs.Whatsapp;
import enumm.Country;
import enumm.Gender;
import service.PersonService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonImpl  implements PersonService {
    List<Person> people = new ArrayList<>();



    @Override
    public List<Whatsapp> list(List<Whatsapp> message) {
        return message;
    }

    @Override
    public void  password(List<Passport> passports) {
        System.out.println("Full out a from");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID: ");
        int id= scanner.nextInt();
        System.out.println("First name: ");
        String firstName= scanner.next();
        System.out.println("Last name: ");
        String lastName= scanner.next();
        System.out.println("Birthday(yyy-mm-dd)");
        LocalDate localDate= LocalDate.parse(scanner.next());
        System.out.println("Place of birth: ");
        Country country=Country.valueOf(scanner.next());
        System.out.println("Gender: ");
        String gender=scanner.next();
        Gender gen=Gender.valueOf(gender);
        passports.add(new Passport(id,firstName,lastName,localDate,country,gen));
        passports.forEach(System.out::println);

    }

}
