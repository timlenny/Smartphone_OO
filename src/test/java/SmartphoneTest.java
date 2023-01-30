import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.smartphone.Contact;
import org.smartphone.Friend;
import org.smartphone.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest {

    @Test
    public void startsTheRadio(){
        Smartphone myPhone = new Smartphone();
        Assertions.assertEquals(true, myPhone.startRadio());
    }

    @Test
    public void stopsTheRadio(){
        Smartphone myPhone = new Smartphone();
        Assertions.assertEquals(false, myPhone.stopRadio());
    }

    @Test
    public void isPositionCorrect(){
        Smartphone myPhone = new Smartphone();
        Assertions.assertEquals("Stuttgart", myPhone.getPosition());
    }

    @Test
    public void isRadioToStringValid(){
        List<Contact> contacts = new ArrayList<>();

        while(contacts.size() < 5){
            contacts.add(new Friend("Max Mustermann", (long)(Math.random() * 999999999)));
        }

        Smartphone iPhone = new Smartphone("iPhone8", "Apple", contacts );

        Assertions.assertEquals(true, iPhone.toString().startsWith("Smartphone{model='iPhone8', manufacturer='Apple', contacts=[\n" +
                "Friend{, nameOfContact='Max Mustermann / phoneNumber=")); //Restlicher Teil dynamisch daher abgeschnitten

    }

    @Test
    public void isContactAdded(){
        List<Contact> contacts = new ArrayList<>();

        while(contacts.size() < 5){
            contacts.add(new Friend("Max Mustermann", (long)(Math.random() * 999999999)));
        }

        Smartphone iPhone = new Smartphone("iPhone8", "Apple", contacts );

        iPhone.addContact(new Friend("Justus", 1800123679));

        Assertions.assertEquals(6, iPhone.getContacts().size());

    }

    @Test
    public void isContactGetByIndexRight(){
        List<Contact> contacts = new ArrayList<>();

        Smartphone iPhone = new Smartphone("iPhone8", "Apple", contacts );

        iPhone.addContact(new Friend("Justus", 1800123679));
        iPhone.addContact(new Friend("Rüdiger", 1800123679));
        iPhone.addContact(new Friend("Jojo", 1800123679));

        Assertions.assertEquals("\n" +
                "Friend{, nameOfContact='Rüdiger / phoneNumber=1800123679}", iPhone.getContact(1).toString());

    }

    @Test
    public void isContactGetByNameRight(){
        List<Contact> contacts = new ArrayList<>();

        Smartphone iPhone = new Smartphone("iPhone8", "Apple", contacts );

        iPhone.addContact(new Friend("Justus", 1800123679));
        iPhone.addContact(new Friend("Rüdiger", 1800123679));
        iPhone.addContact(new Friend("Jojo", 1800123679));
        iPhone.addContact(new Friend("Justus", 18023679));
        iPhone.addContact(new Friend("Rüdiger", 1809));


        Assertions.assertEquals("\n" +
                "Friend{, nameOfContact='Jojo / phoneNumber=1800123679}", iPhone.getContactByName("Jojo").toString());

    }

    @Test
    public void isRemoveContactByNameWorking(){
        List<Contact> contacts = new ArrayList<>();

        Smartphone iPhone = new Smartphone("iPhone8", "Apple", contacts );

        iPhone.addContact(new Friend("Justus", 1800123679));
        iPhone.addContact(new Friend("Rüdiger", 1800123679));
        iPhone.addContact(new Friend("Jojo", 1800123679));
        iPhone.addContact(new Friend("Justus", 18023679));
        iPhone.addContact(new Friend("Rüdiger", 1809));


        Assertions.assertEquals("\n" +
                "Friend{, nameOfContact='Jojo / phoneNumber=1800123679}", iPhone.removeContact("Jojo"));

    }



}
