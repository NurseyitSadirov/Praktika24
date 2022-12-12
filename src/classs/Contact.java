package classs;

import service.WhatsappService;
import service.impl.WhatsappImpl;

import java.util.List;
import java.util.Scanner;

public class Contact implements WhatsappService {

    private String PhoneNumber;
    private String UserName;

    public Contact(String phoneNumber, String userName) {
        PhoneNumber = phoneNumber;
        UserName = userName;
    }

    public Contact() {
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "PhoneNumber='" + PhoneNumber + '\'' +
                ", UserName='" + UserName + '\'' +
                '}';
    }

    @Override
    public List<WhatsappImpl> getAllWhatsapp() {
        return null;
    }

    @Override
    public void message(List<Whatsapp> list) {

    }

    @Override
    public String addContact(List<Whatsapp> whatsapps, Whatsapp whatsapp) {
        System.out.println("Phone number: ");
        String phonenumber = new Scanner(System.in).nextLine();
        for (Whatsapp w : whatsapps) {
            if (phonenumber.equalsIgnoreCase(w.getPhoneNumber())){
                System.out.println("""
                        Dobavit
                        yes/no""");
                String tandoo = new Scanner(System.in).nextLine();
                if (tandoo.equalsIgnoreCase("yes")) {
                    System.out.println("Uspeshno");

                }
            }
        }

        return " ";
    }
}
