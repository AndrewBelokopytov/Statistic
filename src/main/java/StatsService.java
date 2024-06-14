

public class StatsService {
    // общие продажи
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale; // cумма всех продаж
        }
        return sum;
    }

    // среднее число продаж
    public long averageSales(long[] sales) {
        long sum = sumSales(sales); // вызывает метод общих продаж
        return sumSales(sales) / sales.length;
    }

    // пиковый месяц продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // в рассматриваемом i-м месяце продаж меньше
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    // месяц минимальных продаж
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // месяцы с продажами ниже среднего
    public int salesBelowAverage(long[] sales) {
        int count = 0;
        long avg = averageSales(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    // месяцы с продажами выше среднего
    public int salesAboveAverage(long[] sales) {
        int count = 0;
        long avg = averageSales(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

}