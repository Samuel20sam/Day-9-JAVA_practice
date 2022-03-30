package com.bridgelabz;

public class addressBookMain
{
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");
        addressBook contact = new addressBook();
        contact.setUpInfo();
        contact.displayListItems();

    }
}
