import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] attendance = new int[40][26];
        int[] daysPresent = new int[40];
        int perfectAttendanceCount = 0;
        int employeesAbove20Days = 0;

        
        System.out.println("Enter attendance for 40 employees over 26 days (1 for present, 0 for absent):");
        for (int i = 0; i < 40; i++) {
            System.out.println("Enter attendance for Employee " + (i + 1) + ": ");
            for (int j = 0; j < 26; j++) {
                attendance[i][j] = scanner.nextInt();
                if (attendance[i][j] == 1) {
                    daysPresent[i]++;
                }
            }
        }

        
        for (int i = 0; i < 40; i++) {
            if (daysPresent[i] == 26) {
                perfectAttendanceCount++;
            }
            if (daysPresent[i] > 20) {
                employeesAbove20Days++;
            }
        }

        
        System.out.println("Total Days Present for each Employee:");
        for (int i = 0; i < 40; i++) {
            System.out.println("Employee " + (i + 1) + ": " + daysPresent[i] + " days");
        }

        
        System.out.println("Number of employees with perfect attendance (26 days): " + perfectAttendanceCount);

        
        if ((employeesAbove20Days / 40.0) >= 0.8) {
            System.out.println("Satisfactory Attendance");
        } else {
            System.out.println("Attendance Needs Improvement");
        }

        scanner.close();
    }
}
