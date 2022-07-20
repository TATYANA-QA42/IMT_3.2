public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float growth = 1.70F;
        float weight = 51;
        float bmi = service.calculate(growth, weight);
        System.out.println(String.format("%.2f", bmi));
        // System.out.println(bmi);
    }
}
