import java.util.Scanner;
public class One {

    public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
	
        int attendanceArray[][] = new int[30][22];
        int totalAttendance[] = new int[30];

        for (int i = 0; i < 30; i++) {
            System.out.println("Enter attendance for Student " + (i + 1) + " (1 for present, 0 for absent):");
            for (int j = 0; j < 22; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                attendanceArray[i][j] = sc.nextInt();
            }
            System.out.println();
        }

       
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < days; j++) {
                totalAttendance[i] += attendanceArray[i][j];
            }
        }

        
        int satisfactoryAttendanceCount = 0;
        for (int i = 0; i < 30; i++) {
            double attendancePercentage = (totalAttendance[i] / (double)22) * 100;
            if (attendancePercentage >= 75.0) {
                satisfactoryAttendanceCount++;
            }
        }

       
        double satisfactoryPercentage = (satisfactoryAttendanceCount / (double)30) * 100;
        if (satisfactoryPercentage > 80.0) {
            System.out.println("Satisfactory attendance");
        } else {
            System.out.println("Poor attendance");
        }

    }
}
