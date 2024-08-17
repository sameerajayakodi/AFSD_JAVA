import java.util.Scanner;

class Test25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uniqueIds[] = new int[12];
        String brands[] = new String[12];
        String models[] = new String[12];
        int rams[] = new int[12];

        System.out.println("--Welcome To the Laptop Shop--");

        while (true) { 
            System.out.println("Select Your Option:");
            System.out.print("Store Laptops (enter number 1) / ");
            System.out.print("View Laptops (enter number 2) / ");
            System.out.print("Exit (enter number 0): ");
            int input = sc.nextInt();

            if (input == 1) {
                for (int i = 0; i < 2; i++) {
                    System.out.print("Enter Laptop " + (i + 1) + " Id: ");
                    uniqueIds[i] = sc.nextInt();
                    System.out.print("Enter Laptop " + (i + 1) + " Brand: ");
                    brands[i] = sc.next();
                    System.out.print("Enter Laptop " + (i + 1) + " Model: ");
                    models[i] = sc.next();

                    while (true) {
                        System.out.print("Enter Laptop " + (i + 1) + " Ram: ");
                        int ram = sc.nextInt();
                        if (ram < 24) {
                            rams[i] = ram;
                            break; 
                        } else {
                            System.out.println("Laptop Ram value is Exceeded, please enter again.");
                        }
                    }
                }
                System.out.println("Stored Successfully!");
                 System.out.println("------------------------------------------------------------------");

            } else if (input == 2) {
                System.out.println("Viewing All Laptops:");
                for (int i = 0; i < 12; i++) {
                    
                        System.out.println(uniqueIds[i] + " | " + brands[i] + " | " + models[i] + " | " + rams[i]);
                }

            } else if (input == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break; 

            } else {
                System.out.println("Invalid option, please try again.");
            }
        }

        sc.close();
    }
}
