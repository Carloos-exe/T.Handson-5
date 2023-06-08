public class Main {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        dataSet.addDataPoint(108, 95);
        dataSet.addDataPoint(115, 96);
        dataSet.addDataPoint(106, 95);
        dataSet.addDataPoint(97, 97);
        dataSet.addDataPoint(95, 93);
        dataSet.addDataPoint(97, 94);
        dataSet.addDataPoint(91, 95);
        dataSet.addDataPoint(83, 93);
        dataSet.addDataPoint(83, 92);
        dataSet.addDataPoint(78, 86);
        dataSet.addDataPoint(54, 73);
        dataSet.addDataPoint(67, 80);
        dataSet.addDataPoint(56, 65);
        dataSet.addDataPoint(53, 69);
        dataSet.addDataPoint(61, 77);
        dataSet.addDataPoint(115, 96);
        dataSet.addDataPoint(81, 87);
        dataSet.addDataPoint(78, 89);
        dataSet.addDataPoint(30, 60);
        dataSet.addDataPoint(45, 63);
        dataSet.addDataPoint(99, 95);
        dataSet.addDataPoint(32, 61);
        dataSet.addDataPoint(25, 55);
        dataSet.addDataPoint(28, 56);
        dataSet.addDataPoint(90, 94);
        dataSet.addDataPoint(89, 93);

        PolynomialRegression regression = new PolynomialRegression();
        regression.poli(dataSet, 3);



        //

        double[] batchSizes = {16,78,90,63,56};
        for (double batch : batchSizes) {
            double prediction = regression.predict(batch);
            System.out.println("Batch Size: " + batch + ", Machine Efficiency: " + prediction);
        }
    }
}
