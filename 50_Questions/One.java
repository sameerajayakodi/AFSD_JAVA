import java.util.Scanner;
public class One {

    public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
	int students = 20;
        String[] names = new String[students];
        int[] ages = new int[students];

    
        int ageGroup1 = 0;
        int ageGroup2 = 0;
        int ageGroup3 = 0;
        int ageGroup4 = 0;

        for (int i = 0; i < students; i++) {
            System.out.print("Enter the name of Student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            sc.nextLine();  

         
            if (ages[i] >= 18 && ages[i] <= 22) {
                ageGroup1++;
            } else if (ages[i] >= 23 && ages[i] <= 30) {
                ageGroup2++;
            } else if (ages[i] >= 31 && ages[i] <= 40) {
                ageGroup3++;
            } else if (ages[i] > 40) {
                ageGroup4++;
            }
        }

       
 
        System.out.println("18-22 years: " + ageGroup1 + " students");
        System.out.println("23-30 years: " + ageGroup2 + " students");
        System.out.println("31-40 years: " + ageGroup3 + " students");
        System.out.println("Above 40 years: " + ageGroup4 + " students");


    }
}
