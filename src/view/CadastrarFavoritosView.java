package view;

import java.util.Scanner;

import model.Favoritos;

public class CadastrarFavoritosView {
	
	public Favoritos telaDeCadastro(Favoritos f) {
		
		f = new Favoritos();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do seu usuário :  ");
		f.setNomeUsuario(sc.nextLine());
		
		System.out.println("Nome do carro : ");
		f.setNomeCarro(sc.nextLine());
		
		return f;
	}
}