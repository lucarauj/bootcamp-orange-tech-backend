package dominandoAlgaritmosBasicosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. 
 * Para aumentar as vendas o dono resolveu colocar uma m�quina onde os clientes, 
 * principalmente as crian�as que est�o muito acostumadas com a tecnologia, poderiam colocar suas moedas e 
 * receber dois doces aleat�rios. Cada 1 real ir� render 2 doces aleat�rios.
 */

public class LojinhaDeDoces {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int doce = sc.nextInt();
        
        int quantidadeDeDoces = doce * 2;
        
        System.out.println("O cliente obteve " + quantidadeDeDoces + " doces");        
        
        sc.close();
    }
}