public class BmiService {
    public float calculate(float factGrowth, float factWeight) {
        float result = factWeight / (factGrowth * factGrowth);
        return result;
    }
}