package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarFavoritosView {
	
	public void telaListarFavoritos(ResultSet rs){
        
		System.out.println("");
		System.out.println("Essa é a sua lista de favoritos !");
		System.out.println("");
		System.out.println("| Nome do Carro |");
		//System.out.println("Nome do Usuario | Nome do Carro |    Marca  |   Potencia |  Carroceria |  Cor |    Ano |  Portas |  Preco");
        
        try{
            while(rs.next()){
            
                //System.out.print(" " + rs.getString("nomeUsuario") + " | ");
                System.out.print("  | " + rs.getString("nomeCarro") + " | ");
               // System.out.print("   " + rs.getString("marca") + " | ");
                //System.out.print("   " + rs.getInt("potencia") + " HP" +" | ");
               // System.out.print("   " + rs.getString("carroceria") + " | ");
               // System.out.print("   " + rs.getString("cor") + " | ");
                //System.out.print("   " + rs.getInt("ano") + " | ");
                //System.out.print("  " + rs.getInt("portas") + " | ");
               // System.out.print("R$" + rs.getInt("preco"));
                System.out.println("");
            }
          
        }
        catch(SQLException ex) {}
                                   
	}
}
