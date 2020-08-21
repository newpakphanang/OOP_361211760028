package Lab3;

import java.util.Scanner;

public class Ex_While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 1;
        while (num != 0) {
            System.out.println("Enter integer: ");
            num = sc.nextInt();
        }
        System.out.println("Good Bye.");

    }
    }

