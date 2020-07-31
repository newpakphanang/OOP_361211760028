package Lab2;


import java.util.Scanner;

public class Basicinput {
    public static void main(String[] args) {

        // input data เช่น อ่านข้อมูลจากผู้ใช้ทาง Keyboard หรือ อ่านข้อมูลจากฐานข้อมูล
        // Scanner เป็น library ของ Java ที่ใช้ในการรับข้อมูลจากผู้ใช้

        Scanner scanner = new Scanner(System.in); //ประกาศ Object ชื่อ Scanner

        //1. รับข้อมูลที่เป็ยข้อความ (String) จากผู้ใช้
//        System.out.print("What your name? : ");
//        String name = scanner.nextLine();
//        System.out.println("Your name is "+name);

        //2. รับข้อมูลที่เป้นจำนวนเต็ม (Integer)
        // next Int()
        System.out.print("What is your favorite number? : ");

     int num = scanner.nextInt();
        System.out.println("your favorite number is "+num);


        //3.รับค่าช้อมูลเป็นจำนวนจริง (float)
        System.out.print("What is your favorite number? : ");
        double rnum  = scanner.nextDouble();
        System.out.println("your favorite number is "+rnum);



    }//main
}
