import java.util.Scanner;

public class AceleradorDeParticulas {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		//VARIAVEIS
		int distanciaDoEmissor = 3;
		int circunferencia = 8;
		int distanciaDoSensor = 2;
		
		int sensorAtingido;
		
		//DISTANCIA TOTAL PERCORRIDA ENTRE O EMISSOR E UM DOS SENSORES  
		int d;
		d = ler.nextInt();
		
		sensorAtingido = d - (distanciaDoEmissor + distanciaDoSensor); 
		sensorAtingido = sensorAtingido % circunferencia;
		
		if(sensorAtingido == 1) {
			System.out.println("1");
		}
		
		if(sensorAtingido == 2) {
			System.out.println("2");
		}
		
		if(sensorAtingido == 3) {
			System.out.println("3");
		}
		
	}

}
