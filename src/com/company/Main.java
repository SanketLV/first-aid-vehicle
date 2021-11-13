package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    String name, mobile_no, password;


    User(String name, String mobile_no, String password) {
        this.name = name;
        this.mobile_no = mobile_no;
        this.password = password;
    }

    boolean login(String mobile_no, String password) {
        if (this.password.equals(password) && this.mobile_no.equals(mobile_no)) {
            return true;
        }
        return false;

    }

}

class RepairStore {
    String name, address, city;

    RepairStore(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;

    }
}

public class Main {
    static ArrayList<User> users = new ArrayList<User>();
    static ArrayList<RepairStore> repairStore = new ArrayList<RepairStore>();

    static Scanner sca = new Scanner(System.in);


    public static void main(String[] args) {
        // write your code here
        users.add(new User("test1", "8855", "123"));
        users.add(new User("test 2", "5588", "123"));

        menu();
    }

    static void menu() {
        while (true) {

            int choice = 0;
//            System.out.flush();

            System.out.println("""
                    1. Register 
                    2. Login
                    0. exit
                            
                    """);

            System.out.println("Enter Your choice : ");

            choice = sca.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for visit");
                break;
            }


            switch (choice) {
                case 1:
                    Register();
                    break;
                case 2:
                    Login();
                    break;
                case 3:
                    getAllUser();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opps!!,Wrong choice please select again \n\n");
                    // code block
            }

        }


    }

    static boolean Register() {

        String name, mobile_no, password;


        System.out.println("Enter your name : ");
        name = sca.next();

        System.out.println("Enter your mobile Number : ");
        mobile_no = sca.next();

        System.out.println("Enter your a password : ");
        password = sca.next();


        for (User i : users) {

            if (i.mobile_no.equals(mobile_no)) {
                System.out.println("This Mobile Number is already registered");
                return false;
            }

        }
        User inf = new User(name, mobile_no, password);
        users.add(inf);
        System.out.println("You registered successfully");
        return true;
    }

    static boolean Login() {

        String mobile_no, password;

        System.out.println("Enter your mobile Number : ");
        mobile_no = sca.next();

        System.out.println("Enter your a password : ");
        password = sca.next();


        for (User i : users) {

            if (i.login(mobile_no, password)) {
                System.out.println("Login Successfully");
                return true;
            }

        }
        System.out.println("Invalid mobile number or password");
        return false;
    }

    static void getAllUser() {
        for (User i : users
        ) {
            System.out.println(i.name);
            System.out.println(i.mobile_no);

        }
    }
}
