import java.util.Scanner;

public class One{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] monthlyProfits = new double[12];
        double totalProfit = 0;
        int monthsAbove10000 = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Profit for Month " + (i + 1) + ": ");
            monthlyProfits[i] = scanner.nextDouble();
            totalProfit += monthlyProfits[i];
            if (monthlyProfits[i] > 10000) {
                monthsAbove10000++;
            }
        }

        double averageProfit = totalProfit / 12.0;
        System.out.printf("Total Profit:"+totalProfit);
        System.out.printf("Average Monthly Profit:"+averageProfit);

        if (monthsAbove10000 > 6) {
            System.out.println("Profitable Year");
        } else {
            System.out.println("Need for Growth");
        }

      
    }
}
