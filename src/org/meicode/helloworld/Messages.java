package org.meicode.helloworld;

public class Messages {

    private static String contactName;
    private static String message;


    public Messages(String contactName, String message) {

        this.contactName = contactName;
        this.message = message;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
