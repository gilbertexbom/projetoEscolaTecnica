/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gilberto
 */
public class Conexao {
    //Atributos de conexão
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/EscolaTecnica";
    private static final String USR = "adminEscola";
    private static final String PASS = "adminEscola22!";
    
    
    //Métodos de conexão
    public static Connection getConnection(){    
        
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USR, PASS);
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
            return null;
        }
                                                   
    }
    
    public static void closeConnection(Connection con){
        try{
            if(con != null){
                con.close();
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement sttm){
        Conexao.closeConnection(con);
        try{
            if(sttm != null){
                sttm.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
        
    }
    
    public static void closeConnection(Connection con, PreparedStatement sttm, ResultSet rs){
        Conexao.closeConnection(con, sttm);
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }            
    
}
