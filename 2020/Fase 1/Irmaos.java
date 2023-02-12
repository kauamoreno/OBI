import java.util.Scanner;

public class Irmaos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//VARIAVEIS
		int idadeDeOtavio;
		int idadeMaisNovo;
		int idadeMaisVelho;
		
		//CARREGANDO AS VARIAVEIS
		idadeMaisNovo = ler.nextInt();
		idadeDeOtavio = ler.nextInt();
		
		idadeMaisVelho = idadeDeOtavio + (idadeDeOtavio - idadeMaisNovo);
		
		//IMPRESSAO
		System.out.println(idadeMaisVelho);

	}

}
