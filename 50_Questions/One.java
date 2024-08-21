import java.util.Scanner;
public class One {

    public static void main(String[] args) {
        
        int numDays = 30;
        double temperatureThreshold = 30.0;
        int citiesThreshold = 3;
        
        double[][] temperatures = new double[5][30];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter daily temperatures for city " + (i + 1) + ":");
            for (int j = 0; j < 30; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temperatures[i][j] = scanner.nextDouble();
            }
        }
        
        int citiesAboveThreshold = 0;
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
            
            if (cityAverageTemperature > temperatureThreshold) {
                citiesAboveThreshold++;
            }
        }
        
        double overallAverageTemperature = totalTemperature / totalDays;
        System.out.println("Overall Average Temperature: " + overallAverageTemperature);
        
        if (citiesAboveThreshold >= citiesThreshold) {
            System.out.println("Heat Wave Alert!");
        } else {
            System.out.println("Normal Weather.");
        }

    }
}
