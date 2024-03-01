public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        int bmi = (int) service.calculate(98, 1.87);
        System.out.println(bmi);
    }
}