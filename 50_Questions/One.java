import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] waterUsage = new double[15][30];
        double[] totalUsage = new double[15];
        int apartmentsAbove = 0;

        for (int i = 0; i < 15; i++) {
            double total = 0;
            System.out.println("Enter daily water usage (in liters) for Apartment " + (i + 1) + ":");
            for (int j = 0; j < 30; j++) {
                waterUsage[i][j] = scanner.nextDouble();
                total += waterUsage[i][j];
            }
            totalUsage[i] = total;
            if (total > 10000) {
                apartmentsAbove++;
            }
        }

        System.out.println("Total Water Usage for Each Apartment:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Apartment " + (i + 1) + ": Total Usage = " + totalUsage[i] + " liters");
        }

        if ((apartmentsAbove / 15.0) >= 0.50) {
            System.out.println("High Water Usage");
        } else {
            System.out.println("Water Usage Within Limits");
        }

      
    }
}
