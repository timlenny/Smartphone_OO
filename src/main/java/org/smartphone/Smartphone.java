package org.smartphone;

import javax.naming.CompositeName;
import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS {

    private String model;
    private String manufacturer;
    private List<Contact> contacts = new ArrayList<>();

    public Smartphone(){};
    public Smartphone(String model, String manufacturer, List<Contact> contacts){
        this.model = model;
        this.manufacturer = manufacturer;
        this.contacts = contacts;
    }

    public boolean startRadio(){
        System.out.println("Radio started");
        return true;
    }

    public boolean stopRadio(){
        System.out.println("Radio stopped");
        return false;
    }

    public String getPosition(){
        return "Stuttgart";
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public Contact getContact(int index){
        return contacts.get(index);
    }

    public Contact getContactByName(String name){
        for(Contact contact: contacts){
            if(contact.getNameOfContact() == name){
                return contact;
            }
        }
        return null; //Nothing found
    }

    public String removeContact(String name){
        for(Contact contact: contacts){
            if(contact.getNameOfContact() == name){
                String returnInfo = contact.toString();
                contacts.remove(contact);
                return returnInfo;
            }
        }
        return ""; //Nothing found
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
