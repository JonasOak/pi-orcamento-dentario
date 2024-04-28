package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BD {
    
    private static Connection conn = null;
    
    // Ler propriedades do banco de dados
    private static Properties loadProrperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        }
        catch (IOException e) {
            throw new ExcecaoBd((e.getMessage()));
        }
    }
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProrperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            }
            catch (SQLException e) {
                throw new ExcecaoBd((e.getMessage()));
            }
        }
        return conn;
    }
    
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            }
            catch (SQLException e) {
                throw new ExcecaoBd(e.getMessage());
            }
        }
    }
    
    // Fechar Statement com tratamento de exceção
    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new ExcecaoBd(e.getMessage());
            }
        }
    }
    
    // Fechar ResultSet com tratamento de exceção
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new ExcecaoBd(e.getMessage());
            }
        }
    }
    
}
