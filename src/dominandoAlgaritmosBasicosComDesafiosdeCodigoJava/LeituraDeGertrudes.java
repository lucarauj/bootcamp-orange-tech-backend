package dominandoAlgaritmosBasicosComDesafiosdeCodigoJava;

import java.util.Scanner;

/* Sua tia Gertrudes � uma leitora ass�dua. E ela gostaria de ter um aplicativo que dissesse para ela, 
 * de acordo com o n�mero de p�ginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 p�ginas por dia. 
 * Como voc� est� aprendendo Java, voc� se disponibilizou para ajud�-la com esse desenvolvimento.
 */

public class LeituraDeGertrudes {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int paginas = sc.nextInt();
        int paginasLidas = 3;
        
        int diasParaLeitura = paginas / paginasLidas;
        
        System.out.println(diasParaLeitura + " dias");
        
        sc.close();
    }
}
