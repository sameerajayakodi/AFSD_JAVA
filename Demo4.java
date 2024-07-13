import java.util.Scanner;

class Demo4{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Name :");
		String studentName = scan.next();
		
		
		System.out.print("Enter Your Chemistry Mark  :");
		double chemistry = scan.nextDouble();
		
		System.out.print("Enter Your Physics Mark  :");
		double physics = scan.nextDouble();
		
		System.out.print("Enter Your Maths Mark  :");
		double maths = scan.nextDouble();
		
		
		double average = (chemistry + physics + maths)/3;
		
		System.out.println(studentName + " Your Average Mark is : "+average);
		}
	
	}
