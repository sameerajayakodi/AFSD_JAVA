import java.util.Scanner;

class Test5 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double max = 0;
		double min = 0;
		
		System.out.print("Enter First Number : ");
		double firstNumber = sc.nextDouble();
		
		if(firstNumber>max){
			max = firstNumber;
		}
		
		min = firstNumber;
			
			
		System.out.print("Enter Second Number : ");
		double secondNumber = sc.nextDouble();
		
		if(secondNumber>max){
			max = secondNumber;
		}
		
		if(secondNumber<min){
			min = secondNumber;
			}
			
			
		System.out.print("Enter Third Number : ");
		double thirdNumber = sc.nextDouble();
		
		if(thirdNumber>max){
			max = thirdNumber;
		}
		
		if(thirdNumber<min){
			min = thirdNumber;
			}
			
			
			
		System.out.print("Enter Forth Number : ");
		double forthNumber = sc.nextDouble();
		
		if(forthNumber>max){
			max = forthNumber;
		}
		
		if(forthNumber<min){
			min = forthNumber;
			}	
			
			
		System.out.print("Enter Fifth Number : ");
		double fifthNumber = sc.nextDouble();
		
		if(fifthNumber>max){
			max = fifthNumber;
		}
		
		if(fifthNumber<min){
			min = fifthNumber;
			}				
		
		System.out.println("Maximum value is "+max+" in " + firstNumber+" , "+secondNumber+" , "+thirdNumber+" , "+forthNumber+" , "+fifthNumber);
		System.out.print("Minimum value is "+min+" in " + firstNumber+" , "+secondNumber+" , "+thirdNumber+" , "+forthNumber+" , "+fifthNumber);
		
	}
}	
	
	
	
