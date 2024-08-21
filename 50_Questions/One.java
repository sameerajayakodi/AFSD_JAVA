import java.util.Scanner;
public class One {

    public static void main(String[] args) {
        double[][] temperatures = new double[5][30];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter daily temperatures for city " + (i + 1) + ":");
            for (int j = 0; j < 30; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temperatures[i][j] = scanner.nextDouble();
            }
        }
        
        int aboveTemp = 0;
        double totalTemperature = 0;
        double totalDays = 5* 30;
        
        for (int i = 0; i < 5; i++) {
            double cityTotalTemperature = 0;
            
            for (int j = 0; j <30; j++) {
                cityTotalTemperature += temperatures[i][j];
            }
            
            double cityAverageTemperature = cityTotalTemperature / 30;
            totalTemperature += cityTotalTemperature;
            System.out.println("City " + (i + 1) + ":");
            System.out.println("  Average Temperature: " + cityAverageTemperature);
            
            if (cityAverageTemperature > 30) {
                aboveTemp++;
            }
        }
        
        double overallAverageTemperature = totalTemperature / totalDays;
        System.out.println("Overall Average Temperature: " + overallAverageTemperature);
        
        if (aboveTemp >= 3) {
            System.out.println("Heat Wave Alert!");
        } else {
            System.out.println("Normal Weather.");
        }

    }
}
