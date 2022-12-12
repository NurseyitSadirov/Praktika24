import classs.Contact;
import classs.Passport;
import classs.Whatsapp;
import enumm.Country;
import enumm.Gender;
import enumm.Status;
import service.WhatsappService;
import service.impl.PersonImpl;
import service.impl.WhatsappImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WhatsappImpl whatsapp = new WhatsappImpl();
        PersonImpl personImpl = new PersonImpl();
        List<Passport> passports = new ArrayList<>();
        

        while (true) {
        System.out.println("1.Whatsapp profilge kiruu" );
        System.out.println("2.Passport aluu" );
        System.out.println("3.Whatsap ustanovka kyluu" );
        System.out.println("4.Bazada passportu bar adamdardyn baaryn" );
        System.out.println("5.Message jonotuu" );
        System.out.println("6.Change status" );
        System.out.println("7.Get all whatsapp status" );
        System.out.println("8.Get all country " );
        System.out.println("9.Get all gender" );
        System.out.println("10.Get all whatsapp" );
        System.out.println("11.get person by first name");
        System.out.println("12.getMessage");
       int number = scanner.nextInt();
        switch (number){
            case 9:
                for (Gender g : Gender.values()) {
                    System.out.println(g);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

                }
                break;
            case 7:
                for (Status s : Status.values()) {
                    System.out.println(s);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                break;
            case 8:
                for (Country c : Country.values()) {
                    System.out.println(c);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                break;
            case 3:
                whatsapp.getAllWhatsapp();
                break;
            case 2:
                personImpl.password(passports);
                break;
            case 5:
                try {

                }catch (ClassCastException e){
                    System.out.println("Kata jazup jatasyz");
                }
                break;
            case 1:
                break;
            case 4:
                ((Contact) contact).addContact(contact,whatsapp);
                break;
            case 6:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
        }
    }

    }
}
