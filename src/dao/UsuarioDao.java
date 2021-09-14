package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.Autentica;
import model.Usuario;

public class UsuarioDao {
	private Conexao con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public UsuarioDao(){
        con = new Conexao();
    }
    
    public void insere(Usuario u){
        
        try{
            
            query =  "INSERT INTO usuario (nomeUsuario, senha, nomeComp, email, idade) VALUES (?, ?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query);
            
            ps.setString(1, u.getNomeUsuario());
            ps.setString(2, u.getSenha());
            ps.setString(3, u.getNomeComp());
            ps.setString(4, u.getEmail());
            ps.setInt(5, u.getIdade());
          
            
            ps.executeUpdate();
            
            System.out.println("Usuário cadastrado com sucesso !");
            
            
            ps.close();
            
        }
        catch(SQLException ex) {}
  
    } 
    
    
    public ResultSet listar(Autentica a){
    	
        try{
            query = "SELECT * FROM usuario WHERE nomeUsuario = (?) AND senha = (?)";
            ps = con.getConexao().prepareStatement(query);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getSenha());

            
            rs = ps.executeQuery();
            
            return rs;
        }
        catch(SQLException ex) {}
        
        return null;
        }    

}
