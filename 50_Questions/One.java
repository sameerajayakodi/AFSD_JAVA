import java.util.Scanner;
public class One {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        int numStudents = scanner.nextInt();
        int numAssignments = scanner.nextInt();

        int[][] submissionData = new int[numStudents][numAssignments];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1));
            for (int j = 0; j < numAssignments; j++) {
                System.out.print("Assignment " + (j + 1) + " (1 for submitted, 0 for not submitted): ");
                submissionData[i][j] = scanner.nextInt();
            }
        }

        int[] totalCompleted = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numAssignments; j++) {
                totalCompleted[i] += submissionData[i][j];
            }
        }

        double totalCompletedAssignments = 0;
        for (int i = 0; i < numStudents; i++) {
            totalCompletedAssignments += totalCompleted[i];
        }
        double averageCompletionRate = (totalCompletedAssignments / (numStudents * numAssignments)) * 100;

        int numStudentsWith4OrMoreCompleted = 0;
        for (int i = 0; i < numStudents; i++) {
            if (totalCompleted[i] >= 4) {
                numStudentsWith4OrMoreCompleted++;
            }
        }
        double engagementPercentage = (numStudentsWith4OrMoreCompleted / numStudents) * 100;
        String engagementLevel = (engagementPercentage >= 80) ? "Good Engagement" : "Low Engagement";

        System.out.println("\nStudent ID\tTotal Completed");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t\t" + totalCompleted[i]);
        }
        System.out.println("\nAverage Completion Rate: " + averageCompletionRate + "%");
        System.out.println("Engagement Level: " + engagementLevel);
    }
}
