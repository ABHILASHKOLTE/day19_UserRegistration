package com.day19.userregistrationuc1.userregistrationuc1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static void validFirstName(){
        System.out.print("Enter the First Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$"; //        name Start with caps Abhilash ,and having 1 caps and min 2 small character
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            System.out.println("First name is valid");
        else
            System.out.println("First name is !Invalid");
    }
}