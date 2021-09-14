package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Teste;
import model.Usuario;

public class TesteDao {
	private Conexao con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
	
	public TesteDao(){
        con = new Conexao();
        
    }
	
	 public void insereTeste(Teste t){
	        
	        try{
	            
	            query =  "INSERT INTO teste (nomeUsuario, potencia, carroceria, cor, ano, portas, preco) VALUES (?, ?, ?, ?, ?, ?, ?)";
	            ps = con.getConexao().prepareStatement(query);
	            
	            ps.setString(1, t.getNome());
	            ps.setInt(2, t.getPotencia());
	            ps.setString(3, t.getCarroceria());
	            ps.setString(4, t.getCor());
	            ps.setInt(5, t.getAno());
	            ps.setInt(6, t.getPortas());
	            ps.setInt(7, t.getPreco());
	            
	            ps.executeUpdate();
	            
	            System.out.println("");
	            
	            
	            ps.close();
	            
	        }
	        catch(SQLException ex) {}
	  
	    } 
	
	 public ResultSet listarTeste(Teste t) {
	    	try{
	            query = "SELECT * FROM carro  WHERE potencia > (?) AND carroceria = (?) AND cor = (?) AND ano > (?) AND portas = (?) AND preco < (?)";
	            ps = con.getConexao().prepareStatement(query);
	            
	            ps.setInt(1, t.getPotencia());
	            ps.setString(2, t.getCarroceria());
	            ps.setString(3, t.getCor());
	            ps.setInt(4, t.getAno());
	            ps.setInt(5, t.getPortas());
	            ps.setInt(6, t.getPreco());

	            
	            rs = ps.executeQuery();
	            
	            
	            
	            
	            return rs;
	        }
	        catch(SQLException ex) {}
	    	System.out.println("Não temos nada em nosso estoque que entre nas suas opções");
	        
	        return null;
	    }

}
