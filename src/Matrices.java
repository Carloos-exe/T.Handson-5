public class Matrices {

    //Invertir columnas y filas, convertir en matriz transpuesta.
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] transposedMatrix = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    //Multiplicaro matrices
    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        //Obtener el numero de filas de la matriz

        double[][] result = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                double sum = 0.0;
                for (int k = 0; k < colsA; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }


    //Multiplicar por un vector la matriz
    public static double[] multiplyMatrixWithVector(double[][] A, double[] B) {
        int rowsA = A.length;
        int colsA = A[0].length;

        double[] result = new double[rowsA];

        for (int i = 0; i < rowsA; i++) {
            double sum = 0.0;
            for (int j = 0; j < colsA; j++) {
                sum += A[i][j] * B[j];
            }
            result[i] = sum;
        }

        return result;
    }

    //Resolver ecuaciones lineales AX = B.
    public static double[] solveLinearEquation(double[][] A, double[] B) {
        int n = B.length;
        //A es una matriz y B es un vector

        double[] coefficients = new double[n];

        for (int i = n - 1; i >= 0; i--) {
            //Recorrido inverso
            double sum = B[i];
            for (int j = i + 1; j < n; j++) {
                sum -= A[i][j] * coefficients[j];
            }
            coefficients[i] = sum / A[i][i];
        }

        return coefficients;
    }
}
