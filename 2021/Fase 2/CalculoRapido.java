import java.util.Scanner;

public class CalculoRapido {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		/*
		 * RESTRIÇOES DO PROBLEMA:
		 * 
		 * 1 ≤ valorSomaDigito ≤ 36
		 * 1 ≤ A ≤ 10 000
		 * 1 ≤ B ≤ 10 000
		 * A ≤ B
		 * 
		 * */
		
		
		//VARIAVEIS
		int valorSomaDigito;
		int a;
		int b;
		
        //INPUT DAS VARIAVEIS
		valorSomaDigito = ler.nextInt();
		a = ler.nextInt();
		b = ler.nextInt();

		//VALOR SAIDA
		int qtdSoma = 0;
		
		for(int x = a; x <= b; x++) {
			
			int n1 = x/10; //DEZENA
			int n2 = x%10; //UNIDADES
			
			int soma = n1 + n2;
			/*
			 * 
			 * ESSE INT soma É O QUE SERÁ COMPARADO À
			 * valorSomaDigito, E A CADA VEZ QUE ELES
			 * FOREM IGUAIS SERÁ INCREMENTADO 1++ À
			 * qtdSoma QUE SERA O VALOR DA SAÍDA
			 * 
			 * */
			
			if(soma == valorSomaDigito) {
				qtdSoma += 1;
			}
		}
		ler.close();
		System.out.println(qtdSoma);
		
	}

}
