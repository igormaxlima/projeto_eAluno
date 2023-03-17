package projeto_eAluno.modelo;

import java.util.Scanner;

public class Aluno {

	protected String nome;
	protected int matricula;
	protected double nota1;
	protected double nota2;
	protected double nota3;
	private double media;
	
	
	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double getNota3() {
		return nota3;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public double calculadorMedia() {
		double media = (nota1 + nota2 + nota3) / 3;
		return media;
	}
	

	public void CadastroNovoAluno() {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Seja bem vindo ao sistema do e-aluno!");
		
		System.out.println("Informe o seu nome completo: ");
	    nome = leia.nextLine();
		
	    System.out.println("Agora, me diz sua matricula: ");
	    matricula = leia.nextInt();
	    
	    System.out.println("\nMuito Bem!" + nome + ", qual foi a sua nota na Prova 1? :");
	    nota1 = leia.nextDouble();
	    
	    System.out.println("Ok, agora a nota da sua Prova 2: ");
	    nota2 = leia.nextDouble();
	    
	    System.out.println("E por ultimo, a nota da sua Prova 3: ");
	    nota3 = leia.nextDouble();
	    
	    
	    System.out.println("Aluno: " + nome + ", RA: " + matricula);
	    System.out.println("Nota1 = " + nota1);
	    System.out.println("Nota2 = " + nota2);
	    System.out.println("Nota3 = " + nota3);
	    System.out.println("Media: " + calculadorMedia());
	    	
	    if (calculadorMedia() >= 6) {
	    	System.out.println("Parabens " + nome + ", Voce foi aprovado!!" );
	    } else {
	    	System.out.println("Voce foi reprovado.");
	    }

	    System.out.println("\nDeseja inserir outro aluno? [S/N]");
	    String decisao = leia.next();
	    
	    if ("S".equals(decisao)) {
	    	CadastroNovoAluno();
	    } else if (!"S".equals(decisao)) {
	    	System.out.println("Tchau! Fim do programa.");
	    }
	    
	}
}
