package by.epamtc.arrayOfArray.mulMatrix;

public class MatrixOperations {

    public static boolean isSquareMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                return false;
            }
        }
        return true;
    }

    public static int[] matrixMulVector(int[][] matrix, int[] vector) {
        if (canMul(matrix, vector)) {
            int[] result = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < vector.length; j++) {
                    result[i] = result[i] + matrix[i][j] * vector[j];
                }
            }
            return result;
        }
        return null;
    }

    public static int[][] matrixMulMatrix(int[][] matrix1, int[][] matrix2) {
        if (canMul(matrix1, matrix2)) {
            int[][] result = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix2.length; k++) {
                        result[i][j] = result[i][j] + matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return result;
        }
        return null;
    }

    private static boolean isMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i].length != matrix[i + 1].length) {
                return false;
            }
        }
        return true;
    }


    private static boolean canMul(int[][] matrix1, int[][] matrix2) {
        if (isMatrix(matrix1) && isMatrix(matrix2)) {
            if (matrix1[1].length == matrix2.length) {
                return true;
            }
        }
        return false;
    }

    private static boolean canMul(int[][] matrix1, int[] vector) {
        if (isMatrix(matrix1)) {
            if (matrix1[1].length == vector.length) {
                return true;
            }
        }
        return false;
    }


}

