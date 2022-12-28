public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int aver() {
        int max = 0;
        int min = sales[0];
        int aver = 0;
        for (int sale : sales) {
            aver += sale;
            if (sale > max) max = sale;
            if (sale < min) min = sale;
        }
        return aver = (aver - min - max) / (sales.length - 2);
    }
}
