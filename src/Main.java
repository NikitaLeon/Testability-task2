public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 1.87;
        int kg = 98;
        int index = service.calculate(m, kg);
        System.out.println(index);
    }
}