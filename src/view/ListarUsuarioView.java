package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ListarUsuarioView {
		
	public void telaListarUsuario(ResultSet rs){
		
		
        System.out.println("");
        System.out.println("Aqui estão os seus dados !");
        System.out.println("  Nome  | Senha |     Nome Completo    |    Email    | Idade  |");
        
        try{
            while(rs.next()){
            
                System.out.print("" + rs.getString("nomeUsuario") + " | ");
                System.out.print("  " +rs.getString("senha") + " | ");
                System.out.print("  " +rs.getString("nomeComp") + " | ");
                System.out.print("  " +rs.getString("email") + " | ");
                System.out.println("  " +rs.getInt("idade") +  "|");

            }           
        }
        catch(SQLException ex) {}
        
    }
}
