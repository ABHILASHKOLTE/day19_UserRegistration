package com.day19.userregistrationuc1.userregistrationuc2;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void welcome() {
        System.out.println("Welcome to User Registration System Problem");
    }

    public static void main(String[] args) {
        welcome();
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Last Name");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2:
                UserRegistration.validLastName();
                break;
        }
    }
}
