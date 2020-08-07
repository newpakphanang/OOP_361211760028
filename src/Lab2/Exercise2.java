package Lab2;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        //หาพื้นที่สามเหลี่ยม 0.5*ฐาน*สูง
        Scanner scanner = new Scanner(System.in);
        //รับค่าฐาน
        System.out.print("ฐาน: " );
        double x = scanner.nextDouble();
        //รับค่าความสูง
        System.out.print("ความสูง:");
        double y = scanner.nextDouble();

        double area = 0.5 * x * y;
        //display
        System.out.print("พื้นที่สามเหลี่ยม: "+area);









    }//main







}
