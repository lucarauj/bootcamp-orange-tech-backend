package dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Sua irmã está com o computador muito lento e pediu para você formata-lo. 
 * Mas ela gostaria muito de que todas as músicas dela fossem salvas e não deletadas 
 * com o resto dos arquivos durante a formatação. Todas as músicas estão no formato .mp3
 * Crie um programa que cada arquivo com esse formato não seja deletado.
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
