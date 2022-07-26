package vttp2022.batch2.ssfworkshop4.model;

import java.io.Serializable;
import java.util.Random;

public class Contact implements Serializable {
    private String name;
    private String email;
    private int phoneNumber;
    private String id;

    public Contact() {
        this.id = generateId(8);
    }

    public Contact(String name, String email, int phoneNumber) {
        this.id = generateId(8);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    private synchronized String generateId(int numChars) {
        Random r = new Random();
        StringBuilder strbuilder = new StringBuilder();
        while(strbuilder.length() < numChars) {
            strbuilder.append(Integer.toHexString(r.nextInt()));
        }
        return strbuilder.toString().substring(0,8);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
