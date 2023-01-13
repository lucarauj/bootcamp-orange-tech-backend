package dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Voc� levou sua namorada na incr�vel rede de lanchonetes Dc Monalds e ficou maravilhado como aquele lanche era gostoso. 
 * Por�m, ficou horrorizado como algumas coisas no aplicativo do card�pio estavam erradas. 
 * Ent�o, voc� se ofereceu para ajud�-los com seus conhecimentos de programa��o. Ao conversar com o gerente, 
 * ele te explicou que a vontade da lanchonete era criar um menu com os nomes dos ingredientes formando o lanche, 
 * como no exemplo abaixo:
 * Pao
 * Presunto
 * Carne
 * Pao
 * Ajude o restaurante a programar isso.
 */

public class DcMonalds {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        String ingredientes = sc.next();
        
        String [] textoSeparado = ingredientes.split(";");
        
        System.out.println(textoSeparado[0] + "\n" + textoSeparado[1] + "\n" + textoSeparado[2] + "\n" + textoSeparado[3]);
        
        sc.close();
    }
}