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
                    "UPDATE usuario "
                    + "SET nome = ?, cargo = ?, email = ? "
                    + "WHERE "
                    + "(id_usuario = ?)");
            
            st.setString(1, "Gordom Freedom");
            st.setString(2, "Testador");
            st.setString(3, "gordomfreedom@gmail.com");
            st.setInt(4, 4);
            
            int linhasAfetadas = st.executeUpdate();
            
            System.out.println("Feito! Linhas afetadas: " + linhasAfetadas);
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
