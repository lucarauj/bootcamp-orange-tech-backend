package dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Sua irm� est� com o computador muito lento e pediu para voc� formata-lo. 
 * Mas ela gostaria muito de que todas as m�sicas dela fossem salvas e n�o deletadas 
 * com o resto dos arquivos durante a formata��o. Todas as m�sicas est�o no formato .mp3
 * Crie um programa que cada arquivo com esse formato n�o seja deletado.
 */

public class SalvandoMusicas {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        String arquivoDoPc = sc.next();
        
        if (arquivoDoPc.substring(arquivoDoPc.length() - 4).equals(".mp3")) {
        	System.out.println("Salvar");
        } else {
        	System.out.println("Deletar");
        }
        
        
        System.out.println();
        
        sc.close();
    }
}
