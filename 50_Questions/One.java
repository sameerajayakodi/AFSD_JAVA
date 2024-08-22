import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] studentNames = new String[20];
        int[] studentAges = new int[20];
        
        
        int group18To22 = 0;
        int group23To30 = 0;
        int group31To40 = 0;
        int groupAbove40 = 0;

        
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.println("Enter the age of " + studentNames[i] + ": ");
            studentAges[i] = scanner.nextInt();
            scanner.nextLine(); 

            
            if (studentAges[i] >= 18 && studentAges[i] <= 22) {
                group18To22++;
            } else if (studentAges[i] >= 23 && studentAges[i] <= 30) {
                group23To30++;
            } else if (studentAges[i] >= 31 && studentAges[i] <= 40) {
                group31To40++;
            } else if (studentAges[i] > 40) {
                groupAbove40++;
            }
        }

        
        System.out.println("Count of Students in Age Groups:");
        System.out.println("18-22 years: " + group18To22);
        System.out.println("23-30 years: " + group23To30);
        System.out.println("31-40 years: " + group31To40);
        System.out.println("Above 40 years: " + groupAbove40);

        
    }
}
