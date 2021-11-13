package com.company;

import java.util.ArrayList;
import java.util.HashSet;
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

        repairStore.add(new RepairStore("Chhaganbhai Pancher vala", "BRT Stand, near Khodiyarnagar · 083989 70970", "Ahmedabad"));
        repairStore.add(new RepairStore("Ganta gerage", "BRT Stand, near iscon cross road · 083989 70970", "Ahmedabad"));
        repairStore.add(new RepairStore("Gujarat Auto Garage", "BRT Stand, near Khodiyarnagar · 083989 70970", "Rajkot"));
        repairStore.add(new RepairStore("Patel Service Station", "BRT Stand, near Khodiyarnagar · 083989 70970", "Rajkot"));

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
                    if (Login()) {
                        homeMenu();
                    }
                    ;
                    break;
                default:
                    System.out.println("opps!!,Wrong choice please select again \n\n");
                    // code block
            }
        }
    }

    static void homeMenu() {
        while (true) {

            int choice = 0;
//            System.out.flush();

            System.out.println("""
                    1.  Service
                    2 . Repair
                    0. Logout                            
                    """);

            System.out.println("Enter Your choice : ");

            choice = sca.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for visit");
                break;
            }
            switch (choice) {
                case 1:
                    service();
                    break;
                case 2 :
                    repair();
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

    static void service() {
        int i = 1;
        ArrayList<String> location_list_array = new ArrayList<String>();

        for (RepairStore store : repairStore) {
            location_list_array
                    .add(store.city);
        }
        HashSet<String> location_list = new HashSet<String>(location_list_array);
        for (String _location : location_list ) {
            System.out.println(_location);
        }

        System.out.println("Enter your city :");
        String location = sca.next();

        for (RepairStore store : repairStore ) {
            if(store.city.equals(location)){
                System.out.println(store.name);
                System.out.println("\t Address: "+store.address);
            }
        }


    }
    static void repair() {
        int i = 1;
        ArrayList<String> location_list_array = new ArrayList<String>();

        for (RepairStore store : repairStore) {
            location_list_array
                    .add(store.city);
        }
        HashSet<String> location_list = new HashSet<String>(location_list_array);
        for (String _location : location_list ) {
            System.out.println(_location);
        }

        System.out.println("Enter your city :");
        String location = sca.next();

        for (RepairStore store : repairStore ) {
            if(store.city.equals(location)){
                System.out.println(store.name);
                System.out.println("\t Address: "+store.address);
            }
        }


    }
    static void getAllUser() {
        for (User i : users
        ) {
            System.out.println(i.name);
            System.out.println(i.mobile_no);

        }
    }
}
