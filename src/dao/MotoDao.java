
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MotoDao {
	private Conexao con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public MotoDao(){
        con = new Conexao();
    }
    
    
    public ResultSet listar(){
        
        try{
            query = "SELECT * FROM moto";
            ps = con.getConexao().prepareStatement(query);
            
            rs = ps.executeQuery();
            
            return rs;
        }
        catch(SQLException ex) {}
        
        return null;
        }    
}
