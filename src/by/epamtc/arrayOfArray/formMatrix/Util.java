package by.epamtc.arrayOfArray.formMatrix;

import by.epamtc.arrayOfArray.PrinterMatrix;
import by.epamtc.arrayOfArray.mulMatrix.MatrixOperations;

public class Util {


    public static int[][] formMatrix1(int[][] matrix) {
        if (MatrixOperations.isSquareMatrix(matrix)) {
            int[][] newMatrix = new int[matrix.length][matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < matrix.length; j++) {
                        newMatrix[i][j] = matrix[i][j];
                    }
                } else {
                    for (int j = matrix.length - 1; j >= 0; j--) {
                        newMatrix[i][matrix.length - 1 - j] = matrix[i][j];
                    }
                }
            }
            return newMatrix;
        } else {
            return null;
        }
    }

    public static int[][] formMatrix2(int[][] matrix) {
        if (MatrixOperations.isSquareMatrix(matrix)) {
            int[][] newMatrix = new int[matrix.length][matrix.length];
            int multiplier = 2;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    newMatrix[i][j] = matrix[i][j];

                }
                if (i < matrix.length / 2) {
                    newMatrix[i][i] = matrix[i][i] * multiplier++;
                } else {
                    newMatrix[i][i] = matrix[i][i] * --multiplier;
                }
            }
            return newMatrix;
        } else {
            return null;
        }
    }

    public static int[][] formMatrix3(int[][] matrix) {
        if (MatrixOperations.isSquareMatrix(matrix)) {
            int[][] newMatrix = new int[matrix.length][matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                if (i < matrix.length / 2) {
                    for (int j = 0; j < matrix.length - i; j++) {
                        newMatrix[i][j + i] = matrix[i][j + i];
                    }
                } else {

                    newMatrix[i][matrix.length - 1 - i] = matrix[i][matrix.length - 1 - i];
                    for (int j = matrix.length - i; j < i; j++) {
                        newMatrix[i][matrix.length - 1 - j] = matrix[i][matrix.length - i - j];
                    }

                    //
                }
            }
            return newMatrix;
        }
        return null;
    }

    public static double[][] formMatrix4(double[] array) {
        double[][] matrix = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                matrix[i][j] = Math.pow(array[j], i + 1);
            }
        }
        return matrix;

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}};
        int[][] newMatrix = Util.formMatrix1(matrix);
        int[][] newMatrix2 = Util.formMatrix2(matrix);
        int[][] newMatrix3 = Util.formMatrix3(matrix);
        PrinterMatrix.arrayPrint(newMatrix);
        PrinterMatrix.arrayPrint(newMatrix2);
         PrinterMatrix.arrayPrint(newMatrix3);


        double[][] matrix4 = Util.formMatrix4(new double[]{1, 2, 3, 4, 5});
        PrinterMatrix.arrayPrint(matrix4);


    }
}
