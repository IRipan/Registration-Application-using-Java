/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldbs;

/**
 *
 * @author Rio
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class config {
    private static Connection MySQLConfig;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/participants_sopu22_data";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
            System.out.println("Success to Connect");
        } catch(SQLException e){
            System.out.println("Connection database is failed " + e.getMessage());
        }
        return MySQLConfig;
    }
}
