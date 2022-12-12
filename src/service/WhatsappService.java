package service;
import classs.Whatsapp;
import service.impl.WhatsappImpl;
import java.util.List;

public interface WhatsappService {

    List<WhatsappImpl> getAllWhatsapp();

    void message(List<Whatsapp> list);

    String addContact(List<Whatsapp> whatsapps, Whatsapp whatsapp);

}
