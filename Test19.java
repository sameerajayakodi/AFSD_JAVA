
import java.util.Scanner;

class Test19 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Value : ");
		int inputValue = sc.nextInt();
		
		
		int rev = 0;
		while(inputValue!=0){
			
				
			 int balance = inputValue%10;
			 rev = rev*10 + balance; 
			 inputValue/= 10;
			}
			
			System.out.println("revised value = " +rev);
		}
			
		
	}
	
