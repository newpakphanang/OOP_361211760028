package Lab3;

import java.util.Scanner;

public class Ex_switch_case {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        //display menu
        System.out.println("What is your favorite food? ");
        System.out.println("1.KFC");
        System.out.println("2.Shabu");
        System.out.println("3.Pizza");
        System.out.println("Select: ");
        int s = scanner.nextInt();    // Input integer from user

                switch (s) { //int or char
                    case 1: System.out.println("Wow, I Like berger at KFC.");
                    case 2: System.out.println("You have to spend 300 THB per person.");
                    case 3:System.out.println(" I do not like pizza.");break;
                    default:System.out.println("Please select 1-3. thank.");









        }












    }












}
