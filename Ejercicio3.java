

import java.util.Scanner;

class Ejercicio3 {
    public static void main(String[] args) {
        int[] notas = new int[10];
        int nota = 0;
        int suma = 0;
        int contador = 0;
        do {
            System.out.println("Introduce una nota entre 0 y 10");
            nota = sc.nextInt();
            if (nota >= 0 && nota <= 10) {
                notas[contador] = nota;
                suma += nota;
                contador++;
            }
        } while (nota != -1);
        for (int i = 0; i < contador; i++) {
            System.out.println("La nota " + notas[i] + " se ha introducido");
        }
        System.out.println("La media es " + suma / contador);
    }
}