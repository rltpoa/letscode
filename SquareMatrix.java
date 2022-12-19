public class SquareMatrix {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        System.out.println(isSquareMatriz(matriz));
    }

    public static boolean isSquareMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        if (linhas == colunas) {
            return true;
        } else {
            return false;
        }
    }
    
}
