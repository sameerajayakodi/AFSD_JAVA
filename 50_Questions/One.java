import java.util.Scanner;
public class One {

    public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
	  double salesArray[] = new double[10];
        double totalSales = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enterfor salesperson " + (i + 1) + ": ");
            salesArray[i] = sc.nextDouble();
            totalSales += salesArray[i];
        }

        
        double averageSales = totalSales / 10;
        System.out.println("Average sales: " + averageSales);

        
        int belowAverageCount = 0;
        for (int i = 0; i < 10; i++) {
            if (salesArray[i] < averageSales) {
                belowAverageCount++;
            }
        }

        
        System.out.println("Number of salespersons with below average sales: " + belowAverageCount);

       
        if (belowAverageCount > 5) {
            System.out.println("Sales team needs improvement.");
        }

    }
}
