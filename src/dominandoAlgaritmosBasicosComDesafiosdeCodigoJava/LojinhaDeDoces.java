package dominandoAlgaritmosBasicosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. 
 * Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes, 
 * principalmente as crianças que estão muito acostumadas com a tecnologia, poderiam colocar suas moedas e 
 * receber dois doces aleatórios. Cada 1 real irá render 2 doces aleatórios.
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