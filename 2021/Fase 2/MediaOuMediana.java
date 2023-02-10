import java.util.Scanner;

public class MediaOuMediana {

	public static void main(String[] args) {

		/*
		 * ANOTAÇÕES
		 * 
		 * Média == Mediana
		 * 
		 * Média = (a + b + c)/3
		 * Mediana = a
		 * 
		 * Fórmula para o encontrar o c
		 * c = (2a)-b
		 * 
		 * */
		
		Scanner ler = new Scanner(System.in);		
		
		//VARIAVEIS
		int a;
		int b;
		int c;
		
		//CARREGANDO AS VARIAVEIS
		a = ler.nextInt();
		b = ler.nextInt();
		
		//APLICAÇÃO DA FÓRMULA E IMPRESSÃO DA RESPOSTA
		c = (2*a) - b;
		System.out.println(c);

	}
    
}
