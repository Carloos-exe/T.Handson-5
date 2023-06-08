import java.util.ArrayList;
import java.util.List;
public class DataSet {
    private List<Double> xValues;
    private List<Double> yValues;

    public DataSet() {
        xValues = new ArrayList<>();
        yValues = new ArrayList<>();
    }

    public void addDataPoint(double x, double y) {
        xValues.add(x);
        yValues.add(y);
    }

    public List<Double> getXValues() {
        return xValues;
    }

    public List<Double> getYValues() {
        return yValues;
    }
}

