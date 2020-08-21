package Lab3;

public class Ex_For {


    public static void main(String[] args) {
        //พิมพ์ Hello 10 ครั้ง
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
        //พิมพ์ตัวเลข 1 - 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        //พิมพ์เลขคู่ ที่อยู่ระหว่าง 1-10 เช่น 2 4 6 8 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) ;
            System.out.println(i);
        }
        //พิมพ์ตัวเลขที่หารด้วย 3 5 ลงตัว อยู่ระหว่าง 1-100
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) ;
            {
                System.out.println(i);

            }


        }


    }
}