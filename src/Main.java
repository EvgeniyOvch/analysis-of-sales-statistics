public class Main {
    public static void main(String[] args) {
        long[] sales = {50, 70, 256, 400};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальная продажа:" + salesManager.max() +
                ",средний показатель:" + salesManager.aver());
    }
}