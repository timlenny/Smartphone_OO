package org.smartphone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<>();

        while(contacts.size() < 5){
            contacts.add(new Friend("Max Mustermann", (long)(Math.random() * 999999999)));
        }

        Smartphone iPhone = new Smartphone("iPhone8", "Apple", contacts );

        System.out.println(iPhone);

    }
}