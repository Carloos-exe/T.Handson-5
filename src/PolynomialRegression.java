import java.util.List;
public class PolynomialRegression {
    private double[] coefficients;


    //Ajustar modelo de regresion polinomial
    public void poli(DataSet dataSet, int degree) {
        List<Double> xValues = dataSet.getXValues();
        List<Double> yValues = dataSet.getYValues();

        double[][] X = DiscreteMaths.generateMatrix(xValues, degree);
        double[] Y = yValues.stream().mapToDouble(Double::doubleValue).toArray();
        //Convierte la lista de valores de y en un array unidimensional de tipo double
        double[][] XT = Matrices.transposeMatrix(X);
        //Calcula la matriz transpuesta de los valores x y lo guarda en XT
        double[][] XTX = Matrices.multiplyMatrices(XT, X);
        //Multiplica la transpuesta por la matriz original

        double[] XTY = Matrices.multiplyMatrixWithVector(XT, Y);
        //Multiplica la matriz por y, un vector

        coefficients = Matrices.solveLinearEquation(XTX, XTY);
    }

    public double predict(double x) {
        double y = 0.0;
        for (int i = 0; i < coefficients.length; i++) {
            y += coefficients[i] * Math.pow(x, i);
        }
        return y;
    }
}


