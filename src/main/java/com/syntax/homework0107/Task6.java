package com.syntax.homework0107;

/*Create Registration Class in which you would have variables as email, userName and password
 that have an access scope only within its own class. After creating an object of the class
 user should be able to call methods and in each method separately pass values to set users email, username and password.
Requirements:
Valid email consider to be only yahoo
Valid userName and password cannot be empty and should be of length larger than 6 characters.
 Also valid password cannot contain userName.*/

import java.util.Scanner;

class Registration{
    private String email;
    private String username;
    private String password;

    Scanner scanner = new Scanner(System.in);

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        String email;
        do{
            System.out.println("Enter email:");
            email = scanner.nextLine();
            if(email.contains("yahoo")) {
                this.email = email;
            } else {
                System.out.println("Email is not valid");
            }
        } while (!email.contains("yahoo"));

    }

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        String username;
        do {
            System.out.println("Enter username:");
            username = scanner.nextLine();
            if (username.length() > 6) {
                this.username = username;
            } else {
                System.out.println("Username is not valid");
            }
        } while (username.length() <= 6);
    }

        public void setPassword() {
        String password;
            do{
                System.out.println("Enter password:");
                password = scanner.nextLine();
                if(password.length()>6 && !password.contains(this.username)){
                    this.password = password;
                } else {
                    System.out.println("Password is not valid");
                }
            } while (password.length()<=6 || password.contains(this.username));

    }

    public String getPassword() {
        return password;
    }
}

class Task6{
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail();
        registration.setUsername();
        registration.setPassword();
        System.out.println(registration.getEmail());
        System.out.println(registration.getUsername());
        System.out.println(registration.getPassword());

    }
}
