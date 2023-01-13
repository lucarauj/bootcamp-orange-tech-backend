package dominandoAlgaritmosBasicosComDesafiosdeCodigoJava;

import java.util.Scanner;

public class DownloadDePacotes {

	/*
	 * Voc� foi contratado para criar um gerenciador de pacotes. Por�m, o que restou
	 * para voc� fazer foi o contador de porcentagem de download dos pacotes. Mas
	 * como o espa�o para essa informa��o ficou pequeno, a empresa optou por fazer
	 * uma escala de 10 � 1. Ent�o a escala ser� 1 = 10%, 2 = 20%, 3 = 30% e etc.
	 * Para cada 10% de download, o programa deve printar, em sequ�ncia e sem
	 * espa�os, uma barra �/�.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tamanho = sc.nextInt();

		switch (tamanho) {

		case 1:
			System.out.println("/");
			break;
		case 2:
			System.out.println("//");
			break;
		case 3:
			System.out.println("///");
			break;
		case 4:
			System.out.println("////");
			break;
		case 5:
			System.out.println("/////");
			break;
		case 6:
			System.out.println("//////");
			break;
		case 7:
			System.out.println("///////");
			break;
		case 8:
			System.out.println("////////");
			break;
		case 9:
			System.out.println("/////////");
			break;
		case 10:
			System.out.println("//////////");
			break;
		}
		sc.close();
	}
}