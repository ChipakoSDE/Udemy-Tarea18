import java.util.Scanner;

public class ConstruirX {
    public static void main(String[] args) {
        String[][] matriz;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz a crear: ");
        int t = s.nextInt();
        if (t == 0) {
            System.err.println("ERROR");
            System.exit(1);
        }

        matriz = new String[t][t];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || j == matriz.length-1-i) {
                    matriz[i][j] = "X";
                    // matriz[i][matriz.length-1-i] = "X";
                    // matriz[matriz.length-1-i][j] = "X";
                } else {
                    matriz[i][j] = "_";
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz [i][j]);
            }
            System.out.println();
        }
    }
}
