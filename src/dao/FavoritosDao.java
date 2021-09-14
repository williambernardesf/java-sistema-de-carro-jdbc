package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.Autentica;
import model.Favoritos;

public class FavoritosDao {
	private Conexao con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public FavoritosDao(){
        con = new Conexao();
    }
    
    public void insere(Favoritos f){
        
        try{
 

            query =  "INSERT INTO bancocarro.favoritos (nomeUsuario, nomeCarro) VALUES (?, ?)";
            ps = con.getConexao().prepareStatement(query);
            
            ps.setString(1, f.getNomeUsuario());
            ps.setString(2, f.getNomeCarro());
            
            ps.executeUpdate();
            
            System.out.println("A sua lista de favoritos já foi atualizada !");

            
            ps.close();
            
        }
        catch(SQLException ex) {}
  
    } 
    
    public ResultSet listar(Autentica a){
        
        try{
        	
            query = "SELECT * FROM bancocarro.favoritos WHERE favoritos.nomeUsuario = (?)";
            ps = con.getConexao().prepareStatement(query);
            
            ps.setString(1, a.getNome());
            
            rs = ps.executeQuery();
            
            
            return rs;
        }
        catch(SQLException ex) {}
        
        return null;
        }    
    
    

}
