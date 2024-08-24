
import java.util.Scanner;
import java.util.Calendar;
 
 

class Test30{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value 1 : ");
        int input1 = scanner.nextInt();
        System.out.print("Enter Value 2 : ");
        int input2 = scanner.nextInt();
        
        getSum(input1,input2);
        
    }

    public static void getSum(int val1,int val2) {
      int total = val1 + val2;
      System.out.println("Total = "+total);
    }
}
