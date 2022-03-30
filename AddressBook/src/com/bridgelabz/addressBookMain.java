package com.bridgelabz;

import java.util.Scanner;

public class addressBookMain
{
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");
        addressBookMain main = new addressBookMain();
        main.operation();
    }

    private void operation(){
        addressBook contact = new addressBook();
        contact.setUpInfo();
        contact.displayListItems();

        int i;
        int j = 0;
        for (i = 1; i > j; i++) {
            System.out.println("Press 1 to continue adding contacts\nPress 2 to edit a contact\nPress 0 to exit the program");
            Scanner in = new Scanner(System.in);
            int operation = in.nextInt();
            if (operation == 1) {
                contact.setUpInfo();
                contact.displayListItems();
            } else if (operation == 2) {
                contact.editContact();
            } else if (operation == 0) {
                j = i + 2;
            }
        }
    }
}
