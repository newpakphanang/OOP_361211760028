package Lab2;

public class MyVariable{

    public static void main(String[] args) {

    //Data type
    //1. integer จำนวนเต็ม
    //2. floating จำนวนจริง
    //3. character ตัวอักขระ 1 ตัว
    //4. String ข้อความ
    //5. boolean ค่าความจริง

    //1. integer เช่น 10 20 30 100 -15 -47
    int x; // ประกาศตัวแปรชื่อ x สำหรับเก็บข้อมูลจำนวนเต็ม
    x = 10;
    System.out.println("x ="+x);
    int y = 20; // ประกาศตัวแปรชื่อ y และมีค่าเท่ากับ 20
    System.out.println("y ="+y);
    System.out.println("x+y"+(x+y));
    int z =x+y; // ประกาศตัวแปรชื่อ z มีค่าเท่ากับ x+y
    System.out.println("z ="+z);

    //2. float and double เช่น 11.11 24.54 12.12
    float a = 10.00f;
    double b =-45.85;



    //3. character เช่น a A # @ $ h J
    char c = 'C'; // ใช้สัญลักษณ์ '_' เพื่อระบุชนิดของข้อมุล
    System.out.println(c);

    //4.String เช่น "Hello RUTH" "My name is
    // String เป็นคลาสในภาษา Java
    // ดังนั้นตัวแปร จึงเป็นการประกาศ object ของคลาส String

    String s = "RUTH"; // ประกาศ object ชื่อ s เก็บข้อความ "RUTH"
    System.out.println(s);
    System.out.println(s.length()); //length() นับจำนวนอักขระ คือค่าเป็นจำนวนเต็ม
    System.out.println(s.toUpperCase()); //แปลงข้อความเป็นพิมพืใหญ่
    System.out.println(s.toLowerCase()); // แปลงข้อความเป็นพิมพ์เล็ก
    // concatenation String คือ การต่อข้อความ
    String msg = "Management Information Technology";
    String conn = s + msg; // เครื่องหมาย + เป็นการต่อข้อความสำหรับตัวแปร String

    String conn2 = s + msg; // concat () ใช้ต่อข้อความเช่นเดียวกับ +

    //5. boolean เก็บค่าได้ 2 ค่า คือ true(1) และ false(0)
    boolean bb = true;
    boolean bb2 =false;
    System.out.println(bb+" "+bb2);






    }//main



}//class







