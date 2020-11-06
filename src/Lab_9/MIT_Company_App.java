package Lab_9;

import java.sql.*;
import java.util.ArrayList;

public class MIT_Company_App {

    public static void main(String[] args) {
        //step 1: load driver
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Load Driver Successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Step 2: Create Connection to DB
        ArrayList<Employee> myEmp = new ArrayList<Employee>();
        String SQCONN = "jdbc:sqlite:MIT.company.sqlite";

        try {
            Connection conn = null;

            conn = DriverManager.getConnection(SQCONN);
            if (conn == null){
                System.out.println("Could not connect to dartabase.");
            }else{

            }

        //sTEP
        Statement stmt = conn.createStatement();
        String sql = "select *from employee";
        ResultSet rs = stmt.executeQuery(sql);
        // Step 4 Display data from database
        if (rs == null){
            System.out.println("Database is empty.");
            }else{}

       while (rs.next()){
           Employee emp = new Employee(rs.getInt(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getDouble(4));
           myEmp.add(emp);//store
       }

        //Step5 Display  data asa object
            System.out.println("Data from database: ");
       for (Employee e:myEmp) {
           System.out.println(e.toString());
       }


        //close connection
        rs.close();
        stmt.close();
        conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }

    }//main



}//class

