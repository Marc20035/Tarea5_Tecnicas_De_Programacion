package ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] tabla = new int[11];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = 10 - i;
        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }
    }
}



