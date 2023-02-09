import java.util.Arrays;
import java.util.Scanner;

public class IdadeDeCamila {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		//VARIAVEIS
		int idade1;
		int idade2;
		int idade3;
		
		//CARREGANDO AS VARIAVEIS
		System.out.println("Digite as idades das 3 irmas:");
		idade1 = ler.nextInt();
		idade2 = ler.nextInt();
		idade3 = ler.nextInt();

		//COLOCANDO AS VARIAVEIS EM UM ARRAY
		int[] idades = {idade1, idade2, idade3};
		
		//ORDENANDO OS ELEMENTOS EM ORDEM CRESCENTE
		Arrays.sort(idades);
		
		//ESCOLHENDO SEMPRE A IDADE DO MEIO
		int idadeMeio = idades[1];
		
		System.out.println(idadeMeio);
	}

}
