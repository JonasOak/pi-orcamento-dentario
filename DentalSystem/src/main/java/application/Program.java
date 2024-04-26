/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import db.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    
    public static void main(String[] args) {
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            conn = DB.getConnection();
            
            st = conn.createStatement();
            
            rs = st.executeQuery("select * from Cliente");
            
            while (rs.next()) {
                System.out.println(rs.getInt("id_cliente") + ", " 
                                + rs.getString("nome") + ", "
                                + rs.getString("endereco") + ", "
                                + rs.getString("uf") + ", "
                                + rs.getString("telefone") + ", "
                                + rs.getString("documento") + ", "
                                + rs.getString("email"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
        
    }
    
}
