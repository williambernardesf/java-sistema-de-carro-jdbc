
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CarroDao {
	private Conexao con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CarroDao(){
        con = new Conexao();
    }
    
    
    public ResultSet listar(){
        
        try{
            query = "SELECT * FROM carro";
            ps = con.getConexao().prepareStatement(query);
            
            rs = ps.executeQuery();
            
            return rs;
        }
        catch(SQLException ex) {}
        
        return null;
        }    
}
