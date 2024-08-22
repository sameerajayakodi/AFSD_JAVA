import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] workHours = new int[25][20];
        int employeesWithComplianceIssue = 0;

        for (int i = 0; i < 25; i++) {
            System.out.println("Enter work hours for Employee " + (i + 1) + " over 20 days:");
            boolean lessThan6Hours = false;
            int totalHours = 0;
            for (int j = 0; j < 20; j++) {
                workHours[i][j] = scanner.nextInt();
                totalHours += workHours[i][j];
                if (workHours[i][j] < 6) {
                    lessThan6Hours = true;
                }
            }
            if (lessThan6Hours) {
                employeesWithComplianceIssue++;
            }
        }

        System.out.println("Total and Average Work Hours for Each Employee:");
        for (int i = 0; i < 25; i++) {
            int totalHours = 0;
            for (int j = 0; j < 20; j++) {
                totalHours += workHours[i][j];
            }
            double averageHours = totalHours / 20.0;
            System.out.printf("Employee" + (i + 1) +"Total Hours = "+totalHours+" Average Hours ="+ averageHours);
        }

        if ((employeesWithComplianceIssue / 25.0) > 0.50) {
            System.out.println("Work Hour Compliance Issue");
        } else {
            System.out.println("Good Compliance");
        }

      
    }
}
