/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
 import java.sql.*;
 import java.util.*;



public class JavaApplication13 {

    
    public static void main(String[] args) throws SQLException {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        
        try{
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trab1", "root", "");
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("Select * from trab1.dadoscolab");
            while (myRs.next()) {
                   System.out.println(myRs.getString("nome") + "salario: " + myRs.getString("salary"));
            }
          }catch(Exception e) {
                    e.printStackTrace();
                   
          } finally {
                    if (myRs != null)  {
                             myRs.close();
                    
                    }
                    if (myStmt != null) {
                          myStmt.close();
                    }
                    if (myConn != null) {
                          myConn.close();
                    }
                            
                    }     
        }
}
