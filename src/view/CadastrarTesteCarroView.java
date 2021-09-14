package view;

import java.util.Scanner;

import model.Teste;

public class CadastrarTesteCarroView {
	
	public Teste telaDeCadastro(Teste t) {
		
		t = new Teste();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por gentileza, confirme o nome do seu usuário : ");
		t.setNome(sc.nextLine());
		
		System.out.println("Qual a potência minima que você gostaria ?  ");
		System.out.println("Devemos lembrar que se você é uma pessoa que gosta de andar mais rápido ->");
		System.out.println("-> em rodovias, 200cv de potência minima é o ideal !");
		System.out.print("Resposta : ");
		t.setPotencia(sc.nextInt());
		
		System.out.println("Qual a carroceria que você gostaria ?  ");
		System.out.println("Tipos de carroceria : ->");
		System.out.println(" -> Coupe = São os carros esportivos, com teto baixo e coluna traseira inclinada");
		System.out.println(" -> Hatch = o automóvel é mais compacto");
		System.out.println(" -> Sedan = automóvel de quatro ou duas portas");
		System.out.println(" -> Picape = seria como um pequeno caminhão");
		System.out.print("Resposta : ");
		t.setCarroceria(sc.next());
		
		System.out.println("Qual cor ?  ");
		t.setCor(sc.next());
		
		System.out.println("Acima de qual ano ?  ");
		t.setAno(sc.nextInt());
		
		System.out.println("Quantas portas você gostaria ?  ");
		t.setPortas(sc.nextInt());
		
		System.out.println("Qual o preço máximo que você pagaria ?  ");
		t.setPreco(sc.nextInt());
		
		return t;
	}
}