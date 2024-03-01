public class BMIService {

    public double calculate(int weight, double height) {
        return (weight / (double) (height * height));
    }
}