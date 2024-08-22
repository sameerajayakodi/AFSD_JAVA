import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] exerciseTime = new int[20][30];
        int participantsMeetingGoal = 0;

        for (int i = 0; i < 20; i++) {
            int totalMinutes = 0;
            System.out.println("Enter daily exercise time (in minutes) for Participant " + (i + 1));
            for (int j = 0; j < 30; j++) {
                exerciseTime[i][j] = scanner.nextInt();
                totalMinutes += exerciseTime[i][j];
            }
            double averageMinutes = totalMinutes / 30.0;
            if (averageMinutes >= 30) {
                participantsMeetingGoal++;
            }
        }

        if ((participantsMeetingGoal / 20.0) > 0.70) {
            System.out.println("Successful Fitness Challenge");
        } else {
            System.out.println("Challenge Not Fully Achieved");
        }

        
    }
}
