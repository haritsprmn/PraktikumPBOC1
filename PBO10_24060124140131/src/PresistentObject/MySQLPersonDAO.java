/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PresistentObject;
import java.sql.*;

/**
 *
 * @author haritspermana
 * FIle         : MySQLPersonDAO.java
 * Deskripsi    : Implementasi PersonDAO untuk MySQL
 */
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
         String name = person.getName();
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/pbo", "root", "hrtsboy14");
         String query = "INSERT INTO person(name) VALUES ('"+name+"')";
         System.out.println(query);
         Statement s = con.createStatement();
         s.executeUpdate(query);
         con.close();
    }
}
