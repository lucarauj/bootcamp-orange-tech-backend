package dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * O seu amigo quer verificar quais os imóveis estão disponíveis em uma certa corretora na região onde ele mora. 
 * A corretora disponibilizou uma API para ele, mas como ele não entende nada de programação, pediu a sua ajuda. 
 * Para deixar tudo bonitinho, você resolveu criar um aplicativo para seu querido amigo, 
 * mas quando foi olhar a API retornava os dados de uma forma esquisita, separado por barras. 
 * Ajude seu amigo deixando a informação mais amigável possível.
 */

public class ImoveisDisponiveis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String frase = sc.next();

		String [] textoSeparado = frase.split("/");

		System.out.println("Imovel: " + textoSeparado[0] + " R$" + textoSeparado[1] + " " + textoSeparado[2]);

		sc.close();
	}
}