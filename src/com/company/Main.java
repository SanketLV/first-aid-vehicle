package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    String name, mobile_no;


    User(String name, String mobile_no) {
        this.name = name;
        this.mobile_no = mobile_no;
    }

}

public class Main {
    static ArrayList<User> users = new ArrayList<User>();
    static Scanner sca = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        menu();


    }

    static void Register() {

//        User inf = new User();



        for (User i : users ) {
        }


    }

    static void menu() {
        while (true) {

            int choice = 0;

            System.out.println("""
                    1. Register 
                    2. Login
                    3. get all user
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
                    // code block
                    break;
                case 3:
                    getAllUser();
                    break;
                case 0:
                    break;
                default:
                    // code block
            }

        }


    }

    static void getAllUser() {
        for (User i : users
        ) {

            System.out.println(i.name);
            System.out.println(i.Mobile_no);

        }

    }
}
