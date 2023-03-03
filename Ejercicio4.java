

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votos = new int[4];
        int voto = 0;
        int codigo = 0;
        do {
            System.out.println("Introduce un voto entre 1 y 4");
            voto = sc.nextInt();
            if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++;
            }
            System.out.println("Introduce el código de finalización de votación");
            codigo = sc.nextInt();
        } while (codigo != 68753421);
        for (int i = 0; i < votos.length; i++) {
            System.out.println("El candidato " + (i + 1) + " ha recibido " + votos[i] + " votos");
        }
    }
}