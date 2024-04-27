/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            
            st.setString(1, "Yuri");
            st.setString(2, "Administrador");
            st.setString(3, "yuripaixao");
            st.setString(4, "12345678");
            st.setString(5, "yuripaixao@gmail.com");
            
            int rowsAffected = st.executeUpdate();
            
            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt("1");
                    System.out.println("Pronto! Id = " + id);
                }
            }
            else {
                System.out.println("Nenhuma linha foi alterada!");
            }
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
