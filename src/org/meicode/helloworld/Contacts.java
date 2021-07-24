package org.meicode.helloworld;

public class Contacts {
    private static String contactName;
    private static String number;

    public Contacts(String contactName, String number) {
        this.contactName = contactName;
        this.number = number;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
