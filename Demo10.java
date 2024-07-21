import java.util.Scanner;
import java.util.Random;


class Demo10{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String userName = sc.next();
		
		System.out.print("Enter Your Age : ");
		int userAge = sc.nextInt();
		
		if(userAge>18){
			//program
			Random random = new Random();
			int answer = random.nextInt(6);
			
			System.out.print(userName + " You have "+ answer + " babies in 2030!!");
			
			}else{
				System.out.print(userName + " Your are not eligible to this program!");
			}
		
	}
		
		
		
		
		
		
		
		
		
		}
