package controller;

import java.util.Scanner;

import view.MenuView;

public class MenuController {
	
	private MenuView menuView;
	private int opcao;
	Scanner sc = new Scanner(System.in);
	
	
	public MenuController() {
		
		menuView = new MenuView();
		
		opcao = 0;
		
		opcao = menuView.telaDeMenu();
		
		
		if(opcao == 1) {
			
			CadastrarUsuarioController cul = new CadastrarUsuarioController();
			
		}else if(opcao == 2) {
			
			ListarUsuarioController luc = new ListarUsuarioController();
			
		}else if(opcao == 3) {
			
			CadastrarFavoritosController cfc = new CadastrarFavoritosController();
			
		}else if(opcao == 4) {
			
			ListarFavoritosController lfc = new ListarFavoritosController();
			
		}else if(opcao == 5) {
			
			ListarCarroController lcc = new ListarCarroController();
			
		}else if(opcao == 6) {
			
			ListarMotoController lmc = new ListarMotoController();
			
		}else if(opcao == 7) {
			
			CadastrarTesteCarroController ctcc = new CadastrarTesteCarroController();
			
		}//else if(opcao == 8) {
			
			//ListarCarroHatchController lchc = new ListarCarroHatchController();
		
		//}else if(opcao == 9) {
			
			//ListarCarroController lcc = new ListarCarroController();
		//}
		else if(opcao == 9) {
			System.out.println("");
			System.out.println("Agradecemos por escolher o nosso sistema !");
			System.out.println("------------ Volte Sempre ! -------------");
			System.exit(0);
		
		}else {
			menuView.telaOpcaoInvalida();
		}		
	 }				
}