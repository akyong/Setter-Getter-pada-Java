/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterandgetter.connection;

import java.beans.Statement;
import java.sql.*;

/**
 *
 * @author akyong
 */
public class koneksi {
    public static Connection connection;
    
    public static Connection getConnection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return null;
	}
        
        System.out.println("MySQL JDBC Driver Registered!");
        
        try {
            connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/settergetter","root", "root");

	} catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return null;
	}

	if (connection != null) {
            System.out.println("You made it, take control your database now!");
	} else {
            System.out.println("Failed to make connection!");
	}
        return connection;
    }
    
}
