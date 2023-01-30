package org.smartphone;

public class Friend extends Contact{

    private long phoneNumber;

    public Friend(){};

    public Friend(String nameOfContact, long phoneNumber){
        super.nameOfContact = nameOfContact;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nFriend{" +
                ", nameOfContact='" + nameOfContact + " / " +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
