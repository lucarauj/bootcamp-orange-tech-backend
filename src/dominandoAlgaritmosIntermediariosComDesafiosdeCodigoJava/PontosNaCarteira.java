package dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * A prefeitura da cidade "B", inspirada por uma cidade "A", decidiu implementar um sistema de c�meras que iria verificar 
 * se os carros est�o acima de 80km/h. Por�m, eles queriam tamb�m anotar a placa dos carros no banco de dados para que, 
 * a partir de 3 multas, os motoristas perdessem pontos diretamente na carteira de habilita��o. 
 * Para isso, contrataram voc� para realizar esse programa, logo que voc� fez um trabalho t�o bom para a cidade "A".
 * Lembrando que toda vez que um carro � pego pela c�mera e est� acima da velocidade permitida automaticamente j� � 
 * contabilizado uma multa para ele.
 */

public class PontosNaCarteira {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int velocidade = sc.nextInt();
        int multas = sc.nextInt();
        
        if (velocidade > 80) {
        	multas++;
        	if (multas >= 3) {
        		System.out.println(multas + " multas. Levou pontos na carteira");
        	} else {
        		System.out.println(multas + " multas. Nao levou pontos na carteira" );
        	}
        	
        } else {
        	System.out.println(multas + " multas. Nao levou pontos na carteira" );
        }
        
                
        sc.close();
    }
}