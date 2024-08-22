import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 50;
        int[] improvements = new int[numStudents];
        int studentsImproved = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for Exam 1 for Student " + (i + 1) + ": ");
            int grade1 = scanner.nextInt();
            System.out.print("Enter grade for Exam 2 for Student " + (i + 1) + ": ");
            int grade2 = scanner.nextInt();
            if (grade2 > grade1) {
                studentsImproved++;
            }
        }

        if ((studentsImproved / (double) numStudents) > 0.70) {
            System.out.println("Good Academic Progress");
        } else {
            System.out.println("Needs More Attention");
        }

       
    }
}
