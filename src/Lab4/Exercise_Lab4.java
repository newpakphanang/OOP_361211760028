package Lab4;


import java.util.Scanner;

public class Exercise_Lab4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //display menu
        System.out.println("จงหาค่าของรูปเลขาคณิต");
        System.out.println("รูปสี่เหลี่ยม");
        System.out.println("รูปสามเหลี่ยม");
        System.out.println("รูปวงกลม");
        System.out.println("Select: ");

        int s = scanner.nextInt();    // Input integer from user

        switch (s) { //int or char
            case 1:// findAreaRec ();
                break;
            case 2:// findAreaTri ();
                break;
            case 3:// findAreaCir ();
                break;

            default:
                System.out.println("Plaese select 1-3.");



        }
    } //main
        private static void findAreaRec () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter width");
            double x = sc.nextDouble();
            System.out.print("Enter length: ");
            double y = sc.nextDouble();

            System.out.println("The area of rectangle is: " + (x * y));
        }
}