
import java.util.Scanner;

class Test3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter a Number : ");
		double number = sc.nextDouble();
		
		if(number!=0){
			if(number>0){
				//positive
				System.out.println(number+" is Positive Number");
				}else{
					//negative
					System.out.println(number+" is Negative Number");
					}
			
			}else{
				//0
				System.out.print("Value "+number);
				
				}
		
		}
    
    
    
    
    }
