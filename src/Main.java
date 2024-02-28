public class Main {

    public static void main(String[] args) {
        BMIService bmiService = new BMIService();
        double weight = 98; // в килограммах
        double height = 1.87; // в метрах
        int bmi = (int) BMIService.calculate(weight, height);
        System.out.println("Индекс массы тела: " + bmi);
    }
}