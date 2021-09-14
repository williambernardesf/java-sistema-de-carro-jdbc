package view;

import java.util.Scanner;

public class MenuView {

	public int telaDeMenu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("| (1) Cadastrar Usuario");
		System.out.println("| (2) Listar Usuario \n| ");
		System.out.println("| (3) Cadastrar Favoritos");
		System.out.println("| (4) Listar Favoritos \n| ");
		System.out.println("| (5) Listar Todos Os Carros");
		System.out.println("| (6) Listar Todas As Motos \n| ");
		System.out.println("| (7) Fazer nosso teste para achar o seu carro ideal ! \n| ");
		System.out.println("| (9) Sair \n");
		System.out.print(" Opção: ");
		
		return sc.nextInt();
	}
		
	 public void telaOpcaoInvalida(){
	        System.out.println(" *** Opção Inválida *** ");
	        System.out.println();
	    }
	}



