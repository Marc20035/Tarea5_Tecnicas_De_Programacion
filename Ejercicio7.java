

class Ejercicio7 {
    public static void main(String[] args) {
        final int TAMAÑO = 20;
        final int TAMAÑO2 = 30;
        int i, j;
        char[][] tab2d = new char[TAMAÑO][TAMAÑO2];
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO2; i++) {
                tab2d[j][i] = (char) (Math.random() * 26 + 'a');
            }
        }
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO2; i++) {
                System.out.print(tab2d[j][i] + " ");
            }
            System.out.println();
        }
    }
}