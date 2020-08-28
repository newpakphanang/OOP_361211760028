package Lab3;

import java.util.Scanner;

public class Exercise_Lab3_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "1234";

        int count = 0;
        do {
            System.out.print("Username: ");
            String u = sc.nextLine();
            System.out.print("Password: ");
            String p = sc.nextLine();


            if (u.equals(username) && p.equals(password)) {
                System.out.println("Welcome to MT System.");
                break;
            } else {
                System.out.println("Username or password is not corrected. ");
                count++;
                if (count == 3) {
                    System.out.println("Your account has been Locked. " +
                            "Please, contact admin");

                }
            }
        } while (count < 3);

    }













        }



















































