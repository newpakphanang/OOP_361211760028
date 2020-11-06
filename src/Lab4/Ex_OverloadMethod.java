package Lab4;

public class Ex_OverloadMethod {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        double a = 5.0;
        double b = 10.0;

        //call sum()
        int sum_int =summ(x, y);
        System.out.println(sum_int );
        double sum_double = summ(a,b);
        System.out.println(sum_double);

    }//main

    private static double summ(double a, double b) {
        System.out.println("Data is double.");
        return a + b;


    }

    private static int summ(int x, int y) {
      System.out.println("data is integer");
        return  x + y;

    }


}//class


































