import java.util.Scanner;

class Demo6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee 1  Name : ");
		String emp1Name = sc.next();
		System.out.print("Enter Salary : ");
		double emp1Salary = sc.nextDouble();
		System.out.println("");
		
		System.out.print("Enter Employee 2  Name : ");
		String emp2Name = sc.next();
		System.out.print("Enter Salary : ");
		double emp2Salary = sc.nextDouble();
		System.out.println("");
		
		System.out.print("Enter Employee 3  Name : ");
		String emp3Name = sc.next();
		System.out.print("Enter Salary : ");
		double emp3Salary = sc.nextDouble();
		System.out.println("");
		
		System.out.print("Enter Employee 4  Name : ");
		String emp4Name = sc.next();
		System.out.print("Enter Salary : ");
		double emp4Salary = sc.nextDouble();
		System.out.println("");
		
		
		double averageSalary = (emp1Salary+emp2Salary+emp3Salary+emp4Salary)/4;
		System.out.println("Average Salary is : "+averageSalary);
		
		}
	
	}
