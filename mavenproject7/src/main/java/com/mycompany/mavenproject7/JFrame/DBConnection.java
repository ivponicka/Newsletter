
package com.mycompany.mavenproject7.JFrame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
   static Connection con = null;
   
   
   public static Connection getConnection(){
      try {
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newsletter", "root","");
          System.out.println(con);
        } catch (ClassNotFoundException | SQLException e) {
            e.getMessage();
            e.printStackTrace();
            System.out.println("FAILURE - connection");
            System.out.println(e.getMessage());
        }       
        return con;
   }

}
