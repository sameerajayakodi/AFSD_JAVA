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
		
		double emp1NewSalary = emp1Salary + emp1Salary*0.04;
		System.out.println("Employee 1 New Salary : "+emp1NewSalary);
		
		double emp2NewSalary = emp2Salary + emp2Salary*0.04;
		System.out.println("Employee 2 New Salary : "+emp2NewSalary);
		
		double emp3NewSalary = emp3Salary + emp3Salary*0.04;
		System.out.println("Employee 3 New Salary : "+emp3NewSalary);
		
		double emp4NewSalary = emp4Salary + emp4Salary*0.04;
		System.out.println("Employee 4 New Salary : "+emp4NewSalary);
		
		
		
		
		}
	
	}
