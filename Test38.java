import java.util.Scanner;

class Test38 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
       
        String studentsArray[][] = new String[10][2]; 
        double subjectMarksArray[][] = new double[10][3];
        double totalMarksArray[] = new double[10]; 
        double averageMarksArray[] = new double[10];
        String gradeArray[] = new String[10];
        
      
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Student " + (i + 1) + " ID: ");
            studentsArray[i][0] = sc.next();
            
            System.out.print("Enter Student " + (i + 1) + " Name: ");
            studentsArray[i][1] = sc.next();
            
            
            System.out.println("Enter PRF marks for Student " + (i + 1) + ": ");
            subjectMarksArray[i][0] = sc.nextDouble();
            
            System.out.println("Enter DBMS marks for Student " + (i + 1) + ": ");
            subjectMarksArray[i][1] = sc.nextDouble();
            
            System.out.println("Enter ITS marks for Student " + (i + 1) + ": ");
            subjectMarksArray[i][2] = sc.nextDouble();
            
            
            totalMarksArray[i] = subjectMarksArray[i][0] + subjectMarksArray[i][1] + subjectMarksArray[i][2];
            averageMarksArray[i] = totalMarksArray[i] / 3.0;
            
            
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
        
        
        System.out.println("Student Details and Grades:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Student ID: " + studentsArray[i][0] + ", Name: " + studentsArray[i][1]);
            System.out.println("Total Marks: " + totalMarksArray[i] + ", Average Marks: " + averageMarksArray[i]);
            System.out.println("Grade: " + gradeArray[i]);
            System.out.println("-------------------------");
        }
        
       
    }
}
