
import java.util.Scanner;

class Test20 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Value : ");
		int inputValue = sc.nextInt();
			
			
			while(inputValue!=0){
				System.out.print(inputValue%10);
				inputValue = inputValue/10;
				}
	}
}	
