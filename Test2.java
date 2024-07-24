import java.util.Scanner;

class Test2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter Student Science marks : ");
		double scieneMarks = sc.nextDouble();	
		
		System.out.print("Enter Student Maths marks : ");
		double mathsMarks = sc.nextDouble();
		
		System.out.print("Enter Student English marks : ");
		double englishMarks = sc.nextDouble();
		
		
		double totalMarks = scieneMarks + mathsMarks + englishMarks;
		double averageMarks = totalMarks/3;
		
		
		if(averageMarks>=75){
		System.out.print("Enter Student Name : ");
		String studentName = sc.next();
		
		System.out.print("Enter Student Age : ");
		int studentAge = sc.nextInt();
		
		System.out.print("Enter Student Address : ");
		String studentLoacation = sc.next();
		
		System.out.print(studentName + " We will send you a letter to the " +studentName+" " +studentLoacation);
			
			} 
		}
}
