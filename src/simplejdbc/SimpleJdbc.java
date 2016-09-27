package simplejdbc;

import java.sql.*;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Riley Laptop
 * @Assignment Name: simplejdbc
 * @Date: Sep 21, 2016
 * @Description: 
 */
//Imports

//Begin Class SimpleJdbc
public class SimpleJdbc {

    //Begin Main Method
    public static void main(String[] args) throws ClassNotFoundException, SQLException {        
        
    // Load the JDBC driver
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver loaded");

    // Establish a connection
    Connection connection = DriverManager.getConnection
      ("jdbc:mysql://localhost/javabook", "scott", "tiger");
    System.out.println("Database connected");

    // Create a statement
    Statement statement = connection.createStatement();
    

    // Execute a statement
    ResultSet resultSet = statement.executeQuery
            ("SELECT firstName FROM Student");
              
      //("select firstName, mi, lastName from Student where lastName "
       // + " = 'Smith'");

    // Iterate through the result and print the student names
    while (resultSet.next())
        System.out.println(resultSet.getString(1));
      //System.out.println(resultSet.getString(1) + "\t" +
      //  resultSet.getString(2) + "\t" + resultSet.getString(3));

    // Close the connection
    connection.close();
  }
  
} //End Class SimpleJdbc