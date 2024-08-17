import java.util.Scanner;

class Test24 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double employeesSalary [] = new double [7];
		for(int i=0;i<7;i++){
			System.out.print("Enter employee "+(i+1)+" Salary : ");
			employeesSalary[i] = sc.nextDouble();
		}
		
		for(int i=0; i<7;i++){
			employeesSalary[i] += employeesSalary[i]*0.12;
		}
		
		for(int i=0 ; i<7;i++){
			System.out.println("Employee "+(i+1)+ " new Salary is "+ employeesSalary[i]);
		}
		
		}
 }
