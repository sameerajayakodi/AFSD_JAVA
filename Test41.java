public class Test41 {
    public static void main(String[] args) {
        
        
        int totalSteps = 0;
        while (totalSteps < 2000) {
            totalSteps += 100;
            
            
            if (totalSteps % 500 == 0) {
                System.out.println("User has walked " + totalSteps + " steps.");
            }
        }
    }
}
