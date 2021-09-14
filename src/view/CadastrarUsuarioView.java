package view;

import java.util.Scanner;

import model.Usuario;

public class CadastrarUsuarioView {
	
	public Usuario telaDeCadastro(Usuario u) {
		
		u = new Usuario();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do seu usuário :  ");
		u.setNomeUsuario(sc.nextLine());
		
		System.out.println("Sua senha : ");
		u.setSenha(sc.nextLine());
		
		System.out.println("Seu nome completo :  ");
		u.setNomeComp(sc.nextLine());
		
		System.out.println("Digite seu email : ");
		u.setEmail(sc.nextLine());
		
		System.out.println("Digite sua idade :  ");
		u.setIdade(sc.nextInt());
		
		return u;
	}
}