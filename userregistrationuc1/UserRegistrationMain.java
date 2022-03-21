package com.day19.userregistrationuc1.userregistrationuc1;


import com.day19.userregistrationuc1.userregistrationuc1.UserRegistration;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration System Problem");
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 : to validate First Name ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
                break;
        }
    }
}
