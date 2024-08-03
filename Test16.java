import java.util.Scanner;

class Test16 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalMarks = 0.0;
		
		for(int i=0;i<5;i++){
			System.out.print("Enter marks for student "+ (i+1) + " : ");
			double val = sc.nextDouble();
			
			totalMarks += val;
			
			
			}
		
		}
}		
