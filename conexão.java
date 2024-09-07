import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yasmin
 */
public class conexão {
    // Caminho para o banco de dados
    private static final String URL = "jdbc:sqlite:C:/Users/Yasmin/Desktop/Lista-Telefonica-BD.db"; // Ajuste o caminho conforme necessário

     public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL); }
        
    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Conexão com o banco de dados estabelecida.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
