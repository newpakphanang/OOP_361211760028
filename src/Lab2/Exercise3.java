package Lab2;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        //ค่างวดผ่อนรถ ราคารถ x เงินดาว Y ดอกเบี้ย Z ค่างวด W
        Scanner scanner = new Scanner(System.in);
        //รับค่าราคารถ
        System.out.println("ราคา(บาท)");
        double x = scanner.nextDouble();
        //รับค่าเงินดาว
        System.out.println("เงินดาวน์(บาท)");
        double y = scanner.nextDouble();
        //รับค่าดอกเบี้ย
        System.out.println("ดอกเบี้ย(%)");
        double z = scanner.nextDouble();
        //รับค่างวด
        System.out.println("จำนวนงวดที่ต้องการผ่อน(งวด)");
        int w = scanner.nextInt();

        double a = x = y;  //ยอดจัด
        double b = a * (z/100)* w/12; //ดอกเบี้ยรวม
        double c = a + b; //ยอดจัด+ดอกเบี้ย
        double m = c / (w); //ผ่อนต่อเดือน
        //display
        System.out.println("ผ่อนงวดละ: "+m);










    }
}