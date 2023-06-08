import  java.util.List;

/*toma una lista de valores xValues y un grado degree, y genera una matriz
 de Vandermonde donde cada fila contiene las potencias sucesivas
 de los valores de entrada.
*
Al generar la matriz de Vandermonde con un grado de 3,
obtendremos una matriz con 4 columnas (3 + 1)
 que contendrá las potencias desde 0 hasta 3.
* */
public class DiscreteMaths {
    public static double[][] generateMatrix(List<Double> xValues, int degree) {
        int n = xValues.size();
        double[][] vandermondeMatrix = new double[n][degree + 1];

        for (int i = 0; i < n; i++) {
            double x = xValues.get(i);
            for (int j = 0; j <= degree; j++) {
                vandermondeMatrix[i][j] = Math.pow(x, j);
            }
        }

        return vandermondeMatrix;
    }
}
