/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.dao;

import controller.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.design.Estudante;

/**
 *
 * @author gilberto
 */
public class EstudanteDao {
    //Atributos de conexão
    private Connection con = null;
    private PreparedStatement sttm = null;
    private ResultSet rs = null;
    
    
    //Métodos
    public void create(Estudante estudante){
        try{
            con = Conexao.getConnection();
            
            sttm = con.prepareStatement("INSERT INTO Estudante(RM, Nome) VALUES(?, ?)");
                        
            sttm.setString(1, estudante.getRm());
            sttm.setString(2, estudante.getNome());
            
            sttm.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } finally{
            Conexao.closeConnection(con, sttm);
        }
    }
    
    public List<Estudante> read(){
        //Lista de estudantes
        List<Estudante> estudantes = new ArrayList<>();
        
        try{
            con = Conexao.getConnection();
            
            sttm = con.prepareStatement("SELECT RM, Nome FROM Estudante");
            
            rs = sttm.executeQuery();
            
            while(rs.next()){
                estudantes.add(new Estudante(
                        rs.getString("RM"),
                        rs.getString("Nome"))
                );
                
            }
            return estudantes;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            return null;
        } finally {
            Conexao.closeConnection(con, sttm, rs);
        }
                                
    }
    
    public void update(Estudante estudante, String rmAntigo){
        
        try{
            con = Conexao.getConnection();
            
            sttm = con.prepareStatement("UPDATE Estudante SET RM = ?, Nome = ? WHERE RM = ?");
            
            sttm.setString(1, estudante.getRm());
            sttm.setString(2, estudante.getNome());
            sttm.setString(3, rmAntigo);
            
            sttm.executeUpdate();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } finally{
            Conexao.closeConnection(con, sttm);
        }
    }
    
    public void delete(Estudante estudante){
        try{
            con = Conexao.getConnection();
            
            sttm = con.prepareStatement("DELETE FROM Estudante WHERE RM = ?");
            
            sttm.setString(1, estudante.getRm());
            
            sttm.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } finally{
            Conexao.closeConnection(con, sttm);
        }
    }
    
    
}
