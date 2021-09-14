package view;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarMotoView {
	
	public void telaListarMoto(ResultSet rs){
        
		System.out.println("");
        System.out.println(" Nome da Moto |   Marca  |   Potencia | Cilindradas | Ano | Cambio | Preco");
        
        try{
            while(rs.next()){
            	System.out.println("");
                System.out.print("  " + rs.getString("nomeMoto") + " | ");
                System.out.print("   " + rs.getString("marca") + " | ");
                System.out.print("   " + rs.getInt("potencia") + " HP" +" | ");
                System.out.print("   " + rs.getInt("cilindradas") + "cc" + " | ");
                System.out.print("   " + rs.getInt("ano") + " | ");
                System.out.print("   " + rs.getInt("cambio") + " | ");
                System.out.print("R$" + rs.getInt("preco"));
                System.out.println("");
            }          
        }
        catch(SQLException ex) {}
          
    }
}