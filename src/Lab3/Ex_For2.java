package Lab3;

import java.util.Scanner;

public class Ex_For2 {
    public static void main(String[] args) {
     // ให้รับค่าข้อมูลจากผู้ใช้เป็นจำนวนเต็ม 10 ครั้ง
     // แสดงผลรวม และค่าเฉลี่ย
         Scanner sc = new Scanner(System.in);
         int total =0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter integer: ");
            int num = sc.nextInt();
            //System.out.println(num);
            total += num;  //ข้อมูลที่ผู้ใช้ใส่มาจะถูกบวกรวมกันเก็บไว้ในตัวแปร total
        }
         //display
         System.out.println("Total : " + total);
         System.out.println("Average: " + (total/10));

        }
















































    }


