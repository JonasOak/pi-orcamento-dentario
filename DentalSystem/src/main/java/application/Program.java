/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();
            
            st = conn.prepareStatement(
                    "INSERT INTO usuario"
                    + "(nome, cargo, login, senha, email)"
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)");
            
            st.setString(1, "Yuri");
            st.setString(2, "Administrador");
            st.setString(3, "yuripaixao");
            st.setString(4, "12345678");
            st.setString(5, "yuripaixao@gmail.com");
            
            int rowsAffected = st.executeUpdate();
            
            System.out.println("Feito! Linhas afetadas: " + rowsAffected);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
    
}
