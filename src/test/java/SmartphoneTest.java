import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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
        List<Friend> contacts = new ArrayList<>();

        while(contacts.size() < 5){
            contacts.add(new Friend("Max Mustermann", (long)(Math.random() * 999999999)));
        }

        Smartphone iPhone = new Smartphone("iPhone8", "Apple", contacts );

        Assertions.assertEquals(true, iPhone.toString().startsWith("Smartphone{model='iPhone8', manufacturer='Apple', contacts=[\n" +
                "Friend{, nameOfContact='Max Mustermann / phoneNumber=")); //Restlicher Teil dynamisch daher abgeschnitten

    }

}
