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
		
		//mostre no ecr� a soma obtida
		System.out.println(soma);
	}
	
	/********************************************************
	   Nome do exerc�cio: "Login"
	 * Dificuldade: 2 - m�dio
	 * Escreva um programa que s� deixa proceder se for introduzido um username e palavra passe correta tendo em conta: 
	 * 1) os 3 usernames e passwords s�o criados pelo programador e guardados num array,
	 * 	  sendo estes apresentados no inicio do programa
	 * 2) o utilizador escolher um deles recorrendo a uma listagem numerada desses utilizadores no ecr� representada por n�meros.
	 * 3) se o utilizador n�o escolher um numero v�lido, o progama volta a perguntar. O mesmo acontece errando na palavra passe, avisando o utilizador
	 * 4) quando o utilizador introduzir uma palavra passe correta, o programa diz bem vindo seguido do username escolhido
	 */
	
	public void exercicio1() {
		/* declarar desde j� todas as vari�veis necess�rias
		 * 
		 */
		//vari�vel para ler a escolha do utilizador
		int escolhido = 0;
		//vari�vel para guardar a password introduzida
		String password = "";
		//vari�vel para validar a password
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
			//o output �: nr da iteracao seguido do username com o index correspendente ao nr da iteracao
			System.out.println((i+1) + ". " + users[i][0]);
		}
		
		//ciclo while para repetir a pergunta caso o utilizador nao introduza um username ou password valida
		while (passValida==false || (escolhido<1 || escolhido>users.length)) {
			//pedo o numero ao utilizador
			System.out.println("Escolha o n�mero correspondente ao username");
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
					System.out.println("Password inv�lida");	
				}
			}
			
		}
		//mostrar a mensagem para o username escolhido
		System.out.println("Bem vindo " + users[escolhido-1][0] + "!");
		
	}
	/********************************************************
	    Nome do exerc�cio: "ordenar"
	 *  Dificuldade: 3 - dif�cil
	 *  Programa que pe�a a introdu��o de n idades e de seguida ordenar as idades por ordem crescente
	 *  1) Pedir ao utilizador quantas idades quer introduzir
	 *  2) Atr�ves de um ciclo, ir pedindo as idades e guardar num array 'idades'
	 *  3) Atrav�s de outro ciclo(s), mudar a ordem do array
	 *  4) Mostrar ao utilizador as idades 
	 */ 
	
	public void exercicio2() {
		//pedir e ler o n
		int n;
		System.out.println("Quantas idades quer introduzir?");
		n = new Scanner(System.in).nextInt();
		
		//sendo n o numero de vezes que o utilizador quer introduzir numeros, o array fica com tamanho n
		int [] idades = new int [n];
		
		//ciclo para ir pedindo as idades ao utilizador, at� o contador chegar a n-1
		for (int i=0;i<n;i++) {
			System.out.println("Introduza uma idade");
			//popular o array com os valores introduzidos
			idades[i] = new Scanner(System.in).nextInt();
		}
				
		//primeiro 'for' para ir testando numero a numero
	    for (int i=0;i<idades.length;i++) {
	    	//'for' para testar se deve substituir um dado n�mero
	    	// j=i+1 porque as idades com index i-1 j� s�o definitivos
	    	//portanto s� vai testar os que est�o � frente
	        for (int j=i+1;j<idades.length;j++) {
	        	//a vari�vel aux � necess�ria para trocar os n�meros
	            int aux = 0;
	            //se o numero em causa (idades[i]) for maior do que o numero a ser testado (idades[j])
	            //vai trocar os dois, resultando no menor ficando no index i
	            //ordenando desta forma por ordem ascendente
	            if (idades[i]>idades[j]) {
	            	//operacao gen�rica de troca entre duas vari�veis
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
	 	Nome do exerc�cio: 'primo'
	 	Dificuldade: 1 - f�cil
	 	Programa que pede e l� um n�mero positivo, e de seguida diz se ele � ou n�o primo
	 */
	
	public void exercicio3() {
		//vari�vel para contar as divis�es com resultado inteiro
		int cont_divs = 0;
		//ler n�mero introduzido
		int n;
		System.out.println("Introduza um n�mero");
		n = new Scanner(System.in).nextInt();
		
		//ciclo para ver por quantos numeros o n � divis�vel
	    for (int i=1;i<=n;i++) {
	        if (n%i==0) {
	            cont_divs+=1;
	        }
	    }
	    
	    //ver se � primo ou n�o (se s� � divis�vel por 1 e por ele pr�prio ent�o o cont_divs � 2)
	    if (cont_divs<=2) {
	    	System.out.println("O n�mero � primo");
	    } else {
	    	System.out.println("O n�mero n�o � primo");
	    }
	}
	
	
}
