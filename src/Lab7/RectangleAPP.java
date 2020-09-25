package Lab7;

public class RectangleAPP {

    public static void main(String[] args) {

    //create object of Rectangle class
    Ractangle r1 = new Ractangle(); // create object as r1
    r1.setLength(10.0);
    r1.setWidth(5.0);
    //display attributes of object
        displayObjectAttributes(r1);
        //findarea(r1);
        findArea(r1);



        Ractangle r2 = new Ractangle(); // creat object as r2
        r2.setLength(25.0);
        r2.setWidth(15.0);
        //display attributes of object
        displayObjectAttributes(r2);
        //find area rectangle
        findArea(r2);

        Ractangle r3 = new Ractangle(15.0,22.0);
        displayObjectAttributes(r3);
        //find area rectangle
        findArea(r3);









    }

    private static void findArea(Ractangle r) {
            System.out.println("Area of rectangle:"+r.findRectangleArea());
    }

    private static void displayObjectAttributes(Ractangle r) {
    System.out.println("Length:"+r.getLength());
        System.out.println("width:"+r.getWidth());



    }


}
