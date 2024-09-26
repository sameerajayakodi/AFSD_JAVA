import java.util.Scanner;

class Test38 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Arrays to store student details and marks
        String studentsArray[][] = new String[10][2]; // To store student ID and Name
        double subjectMarksArray[][] = new double[10][3]; // To store marks for PRF, DBMS, ITS
        double totalMarksArray[] = new double[10]; // To store total marks
        double averageMarksArray[] = new double[10]; // To store average marks
        String gradeArray[] = new String[10]; // To store grades
        
        // Input student details and marks
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Student " + (i + 1) + " ID: ");
            studentsArray[i][0] = sc.next();
            
            System.out.println("Enter Student " + (i + 1) + " Name: ");
            studentsArray[i][1] = sc.next();
            
            // Input marks for PRF, DBMS, ITS
            System.out.println("Enter PRF marks for Student " + (i + 1) + ": ");
            subjectMarksArray[i][0] = sc.nextDouble();
            
            System.out.println("Enter DBMS marks for Student " + (i + 1) + ": ");
            subjectMarksArray[i][1] = sc.nextDouble();
            
            System.out.println("Enter ITS marks for Student " + (i + 1) + ": ");
            subjectMarksArray[i][2] = sc.nextDouble();
            
            // Calculate total and average marks
            totalMarksArray[i] = subjectMarksArray[i][0] + subjectMarksArray[i][1] + subjectMarksArray[i][2];
            averageMarksArray[i] = totalMarksArray[i] / 3.0;
            
            // Assign grade based on average marks
            if (averageMarksArray[i] >= 75) {
                gradeArray[i] = "A";
            } else if (averageMarksArray[i] >= 65) {
                gradeArray[i] = "B";
            } else if (averageMarksArray[i] >= 55) {
                gradeArray[i] = "C";
            } else if (averageMarksArray[i] >= 45) {
                gradeArray[i] = "D";
            } else {
                gradeArray[i] = "F";
            }
        }
        
        // Display student details with total, average marks and grade
        System.out.println("Student Details and Grades:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Student ID: " + studentsArray[i][0] + ", Name: " + studentsArray[i][1]);
            System.out.println("Total Marks: " + totalMarksArray[i] + ", Average Marks: " + averageMarksArray[i]);
            System.out.println("Grade: " + gradeArray[i]);
            System.out.println("-------------------------");
        }
        
        sc.close();
    }
}
