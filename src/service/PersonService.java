package service;

import classs.Passport;
import classs.Whatsapp;
import service.impl.PersonImpl;

import java.util.List;

public interface PersonService {

List<Whatsapp> list(List<Whatsapp> whatsapps);

void  password (List<Passport> passports);

}
