package dominandoAlgaritmosBasicosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * A prefeitura de uma cidade "A" instalou uma c�mera para verificar quem estava acima da velocidade permitida na rodovia 
 * da entrada da cidade. Por�m, ela � uma cidade extremamente movimentada e a prefeitura n�o deu conta de enviar 
 * as multas necess�rias para quem ultrapassasse a velocidade permitida de 60km/h.
 * O seu papel ser� o de criar um programa que verifique os dados recebidos da c�mera e envie uma mensagem dizendo se 
 * o motorista ser� multado ou n�o.
 */

public class IndustriaDeMulta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int velocidadeAtual = sc.nextInt();
		
		if (velocidadeAtual > 60) {
			System.out.println("Foi multado");
		} else {
			System.out.println("Nao foi multado");
		}
		
		sc.close();
	}
}