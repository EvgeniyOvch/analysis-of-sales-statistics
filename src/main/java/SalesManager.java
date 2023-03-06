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
    public long aver() {
        long max = 0;
        long min = sales[0];
        long aver = 0;
        for (long sale : sales) {
            aver += sale;
            if (sale > max) max = sale;
            if (sale < min) min = sale;
        }
        return aver = (aver - min - max) / (sales.length - 2);
    }
    public long min() {
        long min = max();
        for (long i: sales){
            min = Math.min(min,i);
        }
        return min;
    }
}
