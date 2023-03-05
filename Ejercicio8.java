import java.util.Random;
import java.util.Scanner;

public class MicroGuerraDeBarcos {
    public static void main(String[] args) {
        final int FILAS = 4;
        final int COLUMNAS = 4;
        final int CELDAS = FILAS * COLUMNAS;
        final int BARCO = new Random().nextInt(CELDAS); // Seleccionar una celda aleatoria para el barco

        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        int ultimoIntento = -1;

        while (true) {
            System.out.print("Introduce un número entre 0 y " + (CELDAS-1) + ": ");
            int intento = sc.nextInt();

            if (intento == BARCO) {
                System.out.println("¡Has hundido el barco en " + intentos + " intentos!");
                break;
            } else {
                System.out.println("Agua...");
                if (intento == ultimoIntento) {
                    System.out.println("Ya has intentado en esa celda.");
                }
                ultimoIntento = intento;
                intentos++;
            }
        }

        sc.close();
    }
}
