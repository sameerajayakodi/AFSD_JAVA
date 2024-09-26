public class Test42 {
    public static void main(String[] args) {
       
        
        for (int steps = 100; steps <= 1000; steps += 100) {
            System.out.println("User has walked " + steps + " steps.");
            
            
            if (steps % 300 == 0) {
                System.out.println("Notification sent!");
            }
        }
    }
}

