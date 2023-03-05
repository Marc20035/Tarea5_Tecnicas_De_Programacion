import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
        char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char jugadorActual = 'X';
        boolean hayGanador = false;

        while (!hayGanador) {
            // Imprimir tablero
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }

            // Pedir jugada
            Scanner scanner = new Scanner(System.in);
            System.out.print("Jugador " + jugadorActual + ", ingresa fila (1-3): ");
            int fila = scanner.nextInt() - 1;
            System.out.print("Jugador " + jugadorActual + ", ingresa columna (1-3): ");
            int columna = scanner.nextInt() - 1;

            // Verificar si la celda está libre
            if (tablero[fila][columna] != ' ') {
                System.out.println("La celda ya está ocupada, intenta de nuevo.");
                continue;
            }

            // Marcar jugada
            tablero[fila][columna] = jugadorActual;

            // Verificar si hay ganador
            if (tablero[0][0] == jugadorActual && tablero[0][1] == jugadorActual && tablero[0][2] == jugadorActual ||
                tablero[1][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[1][2] == jugadorActual ||
                tablero[2][0] == jugadorActual && tablero[2][1] == jugadorActual && tablero[2][2] == jugadorActual ||
                tablero[0][0] == jugadorActual && tablero[1][0] == jugadorActual && tablero[2][0] == jugadorActual ||
                tablero[0][1] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][1] == jugadorActual ||
                tablero[0][2] == jugadorActual && tablero[1][2] == jugadorActual && tablero[2][2] == jugadorActual ||
                tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual ||
                tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                hayGanador = true;
            }

            // Cambiar de jugador
            if (jugadorActual == 'X') {
                jugadorActual = 'O';
            } else {
                jugadorActual = 'X';
            }
        }
    }
}
