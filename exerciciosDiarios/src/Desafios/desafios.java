package Desafios;

import java.util.Scanner;

public class desafios {
	
	public desafios() {
		exercicio1();
	}
	
	/* Este exercicio visa obter a capacidade do formando de:
	 *  1) declarar e inicializar um array
	 *  2) utilizar um ciclo devidamente
	 *  3 obter a soma dos conteudos do array recorrendo a um ciclo
	 */
	public void exercicio0() {
		//declare um array paraSomar, com os valores 2,5,4
		int [] paraSomar = {2, 5, 4};
		
		//recorrendo a um ciclo for, some os valores do array paraSomar
		int soma = 0;
		
		for (int i=0;i<paraSomar.length;i++) {
			soma+=paraSomar[i];
		}
		
		//mostre no ecrã a soma obtida
		System.out.println(soma);
	}
	
	/********************************************************
	   Nome do exercício: "Login"
	 * Dificuldade: 2 - médio
	 * Escreva um programa que só deixa proceder se for introduzido um username e palavra passe correta tendo em conta: 
	 * 1) os 3 usernames e passwords são criados pelo programador e guardados num array,
	 * 	  sendo estes apresentados no inicio do programa
	 * 2) o utilizador escolher um deles recorrendo a uma listagem numerada desses utilizadores no ecrã representada por números.
	 * 3) se o utilizador não escolher um numero válido, o progama volta a perguntar. O mesmo acontece errando na palavra passe, avisando o utilizador
	 * 4) quando o utilizador introduzir uma palavra passe correta, o programa diz bem vindo seguido do username escolhido
	 */
	
	public void exercicio1() {
		/* declarar desde já todas as variáveis necessárias
		 * 
		 */
		//variável para ler a escolha do utilizador
		int escolhido = 0;
		//variável para guardar a password introduzida
		String password = "";
		//variável para validar a password
		boolean passValida = false;
		//array de strings (3 users com 'username' e 'password' cada
		String [][] users = new String [3][2];
		//atribuir os nomes e passwords a cada um
		users[0][0]="knight";
		users[0][1]="darknight";
		users[1][0]="master";
		users[1][1]="darkmaster";
		users[2][0]="dragon";
		users[2][1]="dragonslayer";
		
		//listar as opcoes, de uma forma dinamica
		for (int i=0;i<users.length;i++) {
			//o output é: nr da iteracao seguido do username com o index correspendente ao nr da iteracao
			System.out.println((i+1) + ". " + users[i][0]);
		}
		
		//ciclo while para repetir a pergunta caso o utilizador nao introduza um username ou password valida
		while (passValida==false || (escolhido<1 || escolhido>users.length)) {
			//pedo o numero ao utilizador
			System.out.println("Escolha o número correspondente ao username");
			escolhido = new Scanner(System.in).nextInt();
			
			//se o numero do username for valido
			if (escolhido>0 && escolhido<=users.length) {
				//pedir a password para esse username
				System.out.println("Qual a password para o " + users[escolhido-1][0]);
				password = new Scanner(System.in).nextLine();
				
				//se a password for valida
				if (password.equals(users[escolhido-1][1])) {
					//valida a password para poder sair do ciclo
					passValida = true;
				} else {
					System.out.println("Password inválida");	
				}
			}
			
		}
		//mostrar a mensagem para o username escolhido
		System.out.println("Bem vindo " + users[escolhido-1][0] + "!");
		
	}
	/********************************************************
	    Nome do exercício: "ordenar"
	 *  Dificuldade: 3 - difícil
	 *  Programa que peça a introdução de n idades e de seguida ordenar as idades por ordem crescente
	 *  1) Pedir ao utilizador quantas idades quer introduzir
	 *  2) Atráves de um ciclo, ir pedindo as idades e guardar num array 'idades'
	 *  3) Através de outro ciclo(s), mudar a ordem do array
	 *  4) Mostrar ao utilizador as idades 
	 */ 
	
	public void exercicio2() {
		//pedir e ler o n
		int n;
		System.out.println("Quantas idades quer introduzir?");
		n = new Scanner(System.in).nextInt();
		
		//sendo n o numero de vezes que o utilizador quer introduzir numeros, o array fica com tamanho n
		int [] idades = new int [n];
		
		//ciclo para ir pedindo as idades ao utilizador, até o contador chegar a n-1
		for (int i=0;i<n;i++) {
			System.out.println("Introduza uma idade");
			//popular o array com os valores introduzidos
			idades[i] = new Scanner(System.in).nextInt();
		}
				
		//primeiro 'for' para ir testando numero a numero
	    for (int i=0;i<idades.length;i++) {
	    	//'for' para testar se deve substituir um dado número
	    	// j=i+1 porque as idades com index i-1 já são definitivos
	    	//portanto só vai testar os que estão à frente
	        for (int j=i+1;j<idades.length;j++) {
	        	//a variável aux é necessária para trocar os números
	            int aux = 0;
	            //se o numero em causa (idades[i]) for maior do que o numero a ser testado (idades[j])
	            //vai trocar os dois, resultando no menor ficando no index i
	            //ordenando desta forma por ordem ascendente
	            if (idades[i]>idades[j]) {
	            	//operacao genérica de troca entre duas variàveis
	                aux = idades[i];
	                idades[i] = idades[j];
	                idades[j] = aux;
	            }
	        }
	    }
		
	    //ciclo para listar as idades ordenadas
	    for (int i=0;i<n;i++) {
	    	if (i==0) {
	    		System.out.print(idades[i]);
	    	} else {
	    		System.out.print(", " + idades[i]);
	    	}
		}
	    
	}
	
	
	
	/****************************************************
	 	Nome do exercício: 'primo'
	 	Dificuldade: 1 - fácil
	 	Programa que pede e lê um número positivo, e de seguida diz se ele é ou não primo
	 */
	
	public void exercicio3() {
		//variável para contar as divisões com resultado inteiro
		int cont_divs = 0;
		//ler número introduzido
		int n;
		System.out.println("Introduza um número");
		n = new Scanner(System.in).nextInt();
		
		//ciclo para ver por quantos numeros o n é divisível
	    for (int i=1;i<=n;i++) {
	        if (n%i==0) {
	            cont_divs+=1;
	        }
	    }
	    
	    //ver se é primo ou não (se só é divisível por 1 e por ele próprio então o cont_divs é 2)
	    if (cont_divs<=2) {
	    	System.out.println("O número é primo");
	    } else {
	    	System.out.println("O número não é primo");
	    }
	}
	
	
}
