package dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * No show da famosa banda Blue Cold Ice Cubes o vocalista, 
 * Antônio Queda, escolheu todas as pessoas que estavam na posição impar da fila para entrarem no camarote. 
 * Ele fez isso em diversos shows e as pessoas foram a loucura para competirem por essas posições. 
 * Você resolveu criar um programa para saber, de acordo com o número de pessoas na fila, quantas entrariam no camarote.
 */

public class CamaroteDoBlueColdIceCubes {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tamanhoDaFila = sc.nextInt();
        int pessoasNoCamarote = 0;
        
        for (int i = 0; i <= tamanhoDaFila; i++) {
        	if (i % 2 != 0) {
        		pessoasNoCamarote++;
        	}
        }
        
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
        
        sc.close();
    }
}
