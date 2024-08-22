import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dailyOccupancy = new int[30];
        int totalOccupiedBedDays = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            dailyOccupancy[i] = scanner.nextInt();
            totalOccupiedBedDays += dailyOccupancy[i];
        }

        double averageOccupancyRate = (totalOccupiedBedDays / 30.0) / 100.0 * 100;
        System.out.printf("Total Occupied Bed-Days:"+totalOccupiedBedDays);
        System.out.printf("Average Daily Occupancy Rate:"+ averageOccupancyRate);

        if (averageOccupancyRate >= 80) {
            System.out.println("High Occupancy Rate");
        } else {
            System.out.println("Low Occupancy Rate");
        }

       
    }
}
