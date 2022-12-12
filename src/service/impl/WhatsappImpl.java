package service.impl;
import classs.Contact;
import classs.Whatsapp;
import service.WhatsappService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatsappImpl implements WhatsappService {


    @Override
    public List<WhatsappImpl> getAllWhatsapp() {
        Scanner scanner  = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("id:");
        int id = scanner1.nextInt();
        System.out.println("phoneNumber");
        String  phoneNumber = scanner.nextLine();
        System.out.println("Name :");

        String name = scanner.nextLine();

        System.out.println("Password :");
        String password = scanner.nextLine();

        List<Whatsapp> whatsapps = new ArrayList<>();
        whatsapps.add(new Whatsapp(id,name,phoneNumber,password));
        System.out.println(whatsapps);






        return null;
    }

    @Override
    public void message(List<Whatsapp> list) {
        System.out.println("VAtsap parolun jazynyz:");
        String otvet = new Scanner(System.in).nextLine();
        for (Whatsapp pas : list) {
            if (otvet.equalsIgnoreCase(pas.getPassword())) ;

    }
}

    @Override
    public String addContact(List<Whatsapp> whatsapps, Whatsapp whatsapp) {
        return null;

    }



//        for (Whatsapp pas:whatsapps) {
//            if (otvet.equalsIgnoreCase(pas.getPasword())){
//                if (messegs.isEmpty()){
//                System.out.println("KimGe sns jazasyn");
//                     String otvet2 = new Scanner(System.in).nextLine();
//                for (Contact c:contacts) {
//                  if (otvet2.equalsIgnoreCase(c.getFullname())){
//                      while (true){
//                          System.out.print("Sms jazynyz:");
//                          String sms = new Scanner(System.in).nextLine();
//                          System.out.print("Otpravit da ili net?");
//                          String joop3 = new  Scanner(System.in).nextLine();
//                          if (joop3.equalsIgnoreCase("da")){
//                              System.out.println(pas.getUserName() + ":" + sms);
//                              messegs.add(new Messeg(pas.getUserName(),sms));
//                          }else break;
//                  }
//
//                }else {
//                      System.out.println("Sizdin kontacta mynday adam jok!");
//                  }
//
//            }
//
//        }
//            }}}
//
//    @Override
//    public void sob(List<Messeg> messegs, List<Whatsapp> whatsapps) {
//        System.out.println("Whatsap parol");
//        String parol = new Scanner(System.in).nextLine();
//        for (Whatsapp w:whatsapps) {
//            if (parol.equalsIgnoreCase(w.getPasword())){
//                if (messegs.isEmpty()){
//                    System.out.println("Net novyx sobshenia");
//                }
//                else {
//                    for (Messeg m:messegs) {
//                        System.out.println(m);
//
//                    }
//                }
//            }
//
////        }
//    }
    }


