package com.android.asianpay.model;

public class ContactItem {

    //String -> name, number, address;

    //constructor (Alt+insert)

    //getter setters (Alt+insert)

    String name;
    String number;
    String address;

    public ContactItem(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
