import java.util.Scanner;
class Test38{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String studentsArray[][] = new String[10][2];
		double subjectMarksArray[][] = new double [10][3];
		
		for(int i=0;i<10;i++){
			for(int j=0;i<2;j++){
				System.out.println("Enter Student (i+1) Id : ");
				studentsArray[i][j] = sc.next();
				System.out.println("Enter Student (i+1) Name : ");
				studentsArray[i][j+1] = sc.next();
			}
			
		}
		
		
	}
}
