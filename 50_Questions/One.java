import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        
        int [] physicsFirstExam = new int[35];
        int [] physicsSecondExam = new int[35];
        int [] chemistryFirstExam = new int[35];
        int [] chemistrySecondExam = new int[35];
        
        int improvementCount = 0;

        System.out.println("Enter grades for Physics (First and Second Exams):");
        for (int i = 0; i < 35; i++) {
            System.out.print("Student " + (i + 1) + " - Physics First Exam: ");
            physicsFirstExam[i] = sc.nextInt();
            System.out.print("Student " + (i + 1) + " - Physics Second Exam: ");
            physicsSecondExam[i] = sc.nextInt();
        }


        System.out.println("Enter grades for Chemistry (First and Second Exams):");
        for (int i = 0; i < 35; i++) {
            System.out.print("Student " + (i + 1) + " - Chemistry First Exam: ");
            chemistryFirstExam[i] = sc.nextInt();
            System.out.print("Student " + (i + 1) + " - Chemistry Second Exam: ");
            chemistrySecondExam[i] = sc.nextInt();
        }


        for (int i = 0; i < 35; i++) {
            if (physicsSecondExam[i] > physicsFirstExam[i] && chemistrySecondExam[i] > chemistryFirstExam[i]) {
                improvementCount++;
            }
        }

        double improvementPercentage = (double) improvementCount / 35 * 100;


        if (improvementPercentage > 65) {
            System.out.println("Consistent Academic Growth");
        } else {
            System.out.println("Inconsistent Academic Progress");
        }

       
    }
}
