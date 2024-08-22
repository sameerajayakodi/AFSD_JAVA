import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] steps = new int[25][30];
        int[] totalSteps = new int[25];
        int[] daysMetGoal = new int[25];
        int participantsMetGoal = 0;

       
        System.out.println("Enter daily steps for 25 participants over 30 days:");
        for (int i = 0; i < 25; i++) {
            System.out.println("Enter steps for Participant " + (i + 1) + ":");
            for (int j = 0; j < 30; j++) {
                steps[i][j] = scanner.nextInt();
                totalSteps[i] += steps[i][j];
                if (steps[i][j] >= 10000) {
                    daysMetGoal[i]++;
                }
            }
        }

       
        System.out.println("Total and Average Steps for each Participant:");
        for (int i = 0; i < 25; i++) {
            double averageSteps = totalSteps[i] / 30.0;
            System.out.println("Participant " + (i + 1) + ": Total Steps = " + totalSteps[i] + 
                               ", Average Steps = " + averageSteps);
            if (daysMetGoal[i] >= 20) {
                participantsMetGoal++;
            }
        }

        
        if ((participantsMetGoal / 25.0) > 0.7) {
            System.out.println("Great Effort!");
        } else {
            System.out.println("Keep Pushing.");
        }

      
    }
}
