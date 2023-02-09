import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZeroParaCancelar {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int soma = 0;
		
		//DEFINE O TAMANHO DO ARRAY
		int n;
		n = ler.nextInt();
		
		//ARRAY ONDE FICARAO OS DADOS
		ArrayList<Integer> numeros = new ArrayList<>();
		
		//ADICIONANDO OS NUMEROS DENTRO DO ARRAY
		for(int x = 0; x < n; x++) {
			numeros.add(ler.nextInt());		
		}
		
		//VERIFICANDO OS 0's DO ARRAY E OS APAGANDO JUNTO COM O ANTERIOR
		for(int x = 0; x < numeros.size(); x++) {
			
			if(numeros.get(x) == 0) {
				numeros.remove(x-1);
				numeros.remove(x);
	
			}
			
		}
		
		Collections.sort(numeros);
		
		
		
		System.out.println("Lista " + numeros);
		System.out.println("Soma" + soma);

	}

}
