package dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * O seu amigo quer verificar quais os im�veis est�o dispon�veis em uma certa corretora na regi�o onde ele mora. 
 * A corretora disponibilizou uma API para ele, mas como ele n�o entende nada de programa��o, pediu a sua ajuda. 
 * Para deixar tudo bonitinho, voc� resolveu criar um aplicativo para seu querido amigo, 
 * mas quando foi olhar a API retornava os dados de uma forma esquisita, separado por barras. 
 * Ajude seu amigo deixando a informa��o mais amig�vel poss�vel.
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