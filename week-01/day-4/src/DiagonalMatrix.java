import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatrix {

//    public static void main(String[] args) {
//
//        int[][] matrix = new int [4][4];
//        fillMatrix(matrix);
//        printMatrix(matrix);
//
//
//    }
//
//    public static void fillMatrix (int[][] matrixToFill){
//
//        for (int i = 0; i < matrixToFill.length; i++){
//            for (int j = 0; j < matrixToFill.length; j++){
//                if (i == j){
//                    matrixToFill[i][j] += 1;
//                }
//            }
//        }
//
//    }
//
//    public static void printMatrix (int[][] matrixToPrint){
//
//        for (int i = 0; i < matrixToPrint.length; i++){
//            for (int j = 0; j < matrixToPrint.length; j++){
//                System.out.println(" " + matrixToPrint[i][j]);
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Matrix Size:");
        int matrixSize = myScanner.nextInt();
        int [][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i ++){
            for (int j = 0; j < matrixSize; j ++){
                if (i == j){
                    matrix[i][j] = 1;
                }
            }

            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}
