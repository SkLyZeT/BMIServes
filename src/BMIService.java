public class BMIService {

    public int calculate(int weight, double height) {
        double bmi = weight / (height * height);
        return (int) Math.round(bmi);
    }
}