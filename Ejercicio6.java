
class Ejercicio6 {
    public static void main(String[] args) {
        final int TAMAÑO = 4;
        int i, j, val;
        int[][] tab2d = new int[TAMAÑO][TAMAÑO];
        val = 1;
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                tab2d[j][i] = val;
                val = val + 1;
            }
        }
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                System.out.print(tab2d[j][i] + " ");
            }
            System.out.println();
        }
    }
}

//Modificar el algoritmo nuevamente, para tener los siguientes valores en la tabla:0,1,2,3,1,2,3,4,2,3,4,5,3,4,5,6

class Ejercicio6 {
    public static void main(String[] args) {
        final int TAMAÑO = 4;
        int i, j;
        int[][] tab2d = new int[TAMAÑO][TAMAÑO];
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                tab2d[j][i] = i + j;
            }
        }
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                System.out.print(tab2d[j][i] + " ");
            }
            System.out.println();
        }
    }
}


