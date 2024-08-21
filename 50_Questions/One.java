import java.util.Scanner;
public class One {

    public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
	 
        int highDemandCount = 0;

        for (int i = 0; i < 50; i++) {
            int totalUnitsSold = 0;

            for (int j = 0; j < 30; j++) {
                totalUnitsSold += sc.nextInt();
            }

            double averageDailySales = (double) totalUnitsSold / 30;
            if (averageDailySales > 10) {
                highDemandCount++;
            }
        }

        double percentageHighDemand = (double) highDemandCount / 50 * 100;
        if (percentageHighDemand > 60) {
            System.out.println("High Demand Products");
        } else {
            System.out.println("Low Demand Products");
        }


    }
}
