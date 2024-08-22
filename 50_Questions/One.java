import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ratings = new int[150];
        int[] ratingCounts = new int[5];
        double totalRating = 0;

        for (int i = 0; i < 150; i++) {
            System.out.print("Customer " + (i + 1) + " rating (1-5): ");
            ratings[i] = scanner.nextInt();
            totalRating += ratings[i];
            if (ratings[i] >= 1 && ratings[i] <= 5) {
                ratingCounts[ratings[i] - 1]++;
            }
        }

        double averageRating = totalRating / 150.0;
        System.out.println("Rating Counts:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " stars: " + ratingCounts[i]);
        }
        System.out.printf("Average Rating:"+averageRating);

        if (averageRating >= 4) {
            System.out.println("Highly Rated Product");
        } else {
            System.out.println("Product Needs Improvement");
        }

        
    }
}
