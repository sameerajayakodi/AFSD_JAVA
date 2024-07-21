import java.util.Scanner;


class Demo7{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter Your Amount : ");
		double amount = sc.nextDouble();
		
		double newAmount = (amount + amount*0.03);
		
		System.out.prinln("Your Total Amount is : "+newAmount);
		
		}
