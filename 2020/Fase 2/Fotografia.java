import java.util.Scanner;

public class Fotografia {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		//VARIAVEIS DA FOTO
		int alturaFoto = ler.nextInt();
		int larguraFoto = ler.nextInt();
		int areaFoto = alturaFoto * larguraFoto;
		
		//VARIAVEIS DA MOLDURA
		int larguraMoldura;
		int alturaMoldura;
		int areaMoldura = 0;
		
		
		int qtdMolduras = ler.nextInt();
		
		int melhorAreaMoldura = 100000;
		/*
		 * int melhorAreaMoldura = 100000;
		 * 
		 * SERVE PARA CASO POSSUA DUAS MOLDURAS OU MAIS QUE ATENDAM AO FILTRO DE IF'S
		 * NESSE CASO PARA DECIDIR A MELHOR ENTRE ELAS SE USA ESSA VARIAVEL
		 * ELA DECIDIRÁ QUAL POSSUI A MENOR AREA DENTRE AS SELECIONADAS
		 * */
		
		int melhorMoldura = -1; //CASO NEHUMA PASSE PELOS IF DEVE SER IMPRESSO -1
		
		for(int x = 0; x < qtdMolduras; x++) {
			
			//INPUT DAS VARIAVEIS DA MOLDURA
			larguraMoldura = ler.nextInt();
			alturaMoldura = ler.nextInt();
			areaMoldura = alturaMoldura * larguraMoldura;

			if(areaFoto <= areaMoldura) {
	
				if(alturaFoto <= alturaMoldura && larguraFoto <= larguraMoldura) {
	
					if(areaMoldura < melhorAreaMoldura) {
						melhorAreaMoldura = areaMoldura;
						melhorMoldura = x + 1;
					}
				}
			}
		}
		
		System.out.println(melhorMoldura);
	}

}
