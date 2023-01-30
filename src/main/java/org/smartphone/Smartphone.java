package org.smartphone;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS {

    private String model;
    private String manufacturer;
    private List<Friend> contacts = new ArrayList<>();

    public Smartphone(){};
    public Smartphone(String model, String manufacturer, List<Friend> contacts){
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

    public List<Friend> getContacts() {
        return contacts;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setContacts(List<Friend> contacts) {
        this.contacts = contacts;
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
