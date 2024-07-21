import java.util.Scanner;


class Demo7{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter Your Amount : ");
		double amount = sc.nextDouble();
		
		double newAmount = (amount + amount*0.03);
		
		System.out.println("Your Total Amount is : " + newAmount);
		
		//pre maid class / software eg Scanner
		
		
		byte val = -126;
		
		int v2 = 20;
		
		//short v3 = v2;
		
		short v3 = (short)v2;
		
		short v4 = (byte)v2;
		
		//byte -> short -> char -> int -> long -> float -> double   ---> convertion    <----- casting
		
		char val1 = 'a';
		
		byte val2 = (byte)val1;
		System.out.println(val2);
		
		}
}
