import java.util.Scanner;
public class One {

    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

       
        int[][] steps = new int[25][30];
        
        
  
        for (int i = 0; i < 25; i++) {
            System.out.println("Enter steps for participant " + (i + 1) + ":");
            for (int j = 0; j < 30; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                steps[i][j] = sc.nextInt();
            }
        }
        
        int participantsMetGoal = 0;
        
     
        for (int i = 0; i <25; i++) {
            int totalSteps = 0;
            int daysMetGoal = 0;
            
            for (int j = 0; j < 30; j++) {
                totalSteps += steps[i][j];
                if (steps[i][j] >= 1000) {
                    daysMetGoal++;
                }
            }
            
            double averageSteps = (double) totalSteps / 30;
            System.out.println("Participant " + (i + 1) + ":");
            System.out.println("  Total Steps: " + totalSteps);
            System.out.println("  Average Steps per Day: " + averageSteps);
            
            if (daysMetGoal >= 20) {
                participantsMetGoal++;
            }
        }
        
       
        double percentageMetGoal = (double) participantsMetGoal / 25 * 100;
        if (percentageMetGoal > 70) {
            System.out.println("Great Effort!");
        } else {
            System.out.println("Keep Pushing.");
        }
        

    }
}
