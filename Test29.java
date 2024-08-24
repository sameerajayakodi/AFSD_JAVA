import java.util.Scanner;
import java.util.Calendar;
 
 

class Test29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        greeting();
    }

    public static void greeting() {
        Calendar c = Calendar.getInstance(); 
        int hour = c.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);
        if(hour < 12) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Night");
        }
    }
}
