package org.meicode.helloworld;

import java.util.ArrayList;

public class User {

    private  String Name;
    Contacts mariam = new Contacts("Mariam", "123");
    Contacts dato = new Contacts("dato", "321");
    Messages msMariam = new Messages("Mariam", "123");
    Messages msDato = new Messages("dato", "321");
    private ArrayList<Contacts> contacts = new ArrayList<>() {{
        add(mariam);
        add(dato);
    }};
    private ArrayList<Messages> messages = new ArrayList<>() {{
        add(msDato);
        add(msMariam);
    }};

    public User(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;

    }

    public void getContacts() {
        for (Contacts cn : contacts) {
            System.out.println("Name:" + cn.getContactName() + "\t Number:" + cn.getNumber());
        }
        ;
    }

    public void getMessage() {
        for (Messages ms : messages) {
            System.out.println("To:" + ms.getContactName() + "\t Message:" + ms.getMessage());
        }
        ;
    }

    public void addContact(Contacts contact) {
        this.contacts.add(contact);
    }

    public void sendMessage(Messages messages) {
        this.messages.add(messages);
    }

    public String searchContact(String name) {
        String Number = null;
        for (Contacts contacts : contacts) {
            if (contacts.getContactName().equals(name)) {
                Number = contacts.getNumber();
            }
        }
        return Number;

    }

    public void deleteContact(String Name) {
        contacts.remove(Name);
    }

    public void goBack() {
        return;
    }
}
