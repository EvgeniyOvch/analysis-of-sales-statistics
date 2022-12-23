public class Main {
    public static void main(String[] args) {
        int[] sales = {50, 70, 256, 400};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}