public class SquareMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        System.out.println(isSquareMatrix(matrix));
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        int lines = matrix.length;
        int columns = matrix[0].length;
        if (lines == columns) {
            return true;
        } else {
            return false;
        }
    }
    
}
