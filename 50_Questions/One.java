import java.util.Scanner;
public class One {

    public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
	
       int students = 20;
        int marks[] = new int[students];
        int gradeACount	 = 0, gradeBCount = 0, gradeCCount = 0, gradeDCount = 0, gradeFCount = 0;

      
        for (int i = 0; i < students; i++) {
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();


            if (marks[i] >= 90) {
                gradeACount++;
            } else if (marks[i] >= 80) {
                gradeBCount++;
            } else if (marks[i] >= 70) {
                gradeCCount++;
            } else if (marks[i] >= 60) {
                gradeDCount++;
            } else {
                gradeFCount++;
            }
        }

       
        System.out.println("Grade A: " + gradeACount);
        System.out.println("Grade B: " + gradeBCount);
        System.out.println("Grade C: " + gradeCCount);
        System.out.println("Grade D: " + gradeDCount);
        System.out.println("Grade F: " + gradeFCount);


    }
}
