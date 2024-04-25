/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import db.DB;
import java.sql.Connection;

public class Program {
    
    public static void main(String[] args) {
        
        Connection conn = DB.getConnection();
        
        DB.closeConnection();
        
    }
    
}
