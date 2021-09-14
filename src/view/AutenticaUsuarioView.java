package view;

import java.util.Scanner;

import model.Autentica;

public class AutenticaUsuarioView {
	
	public Autentica telaDeAutentica(Autentica a) {

		a = new Autentica();

		Scanner sc = new Scanner(System.in);

		System.out.println("Por gentileza confirme seu usuário :  ");
		a.setNome(sc.nextLine());

		System.out.println("Digite a sua senha : ");
		a.setSenha(sc.nextLine());

		return a;
	}
}