import java.util.Scanner;
public class One {

    public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
	    double marksArray[][] = new double[15][5];
	    double totalMarksArray [] = new double [15];
        for (int i = 0; i < 15; i++) {
			System.out.println("--Enter Student "+(i+1)+" Marks--");
			System.out.println("");
            for(int j=0;j<5;j++){
				System.out.print("Enter Subject"+(j+1)+" Marks : ");
				marksArray[i][j] = sc.nextDouble();
			}
        }
        
        
        double totalMarks = 0;
        for(int i=0;i<15;i++){
			for(int j=0;j<5;j++){
				totalMarks += marksArray[i][j];
			}
			totalMarksArray[i]=totalMarks;
		}
		
		double averageMarksArray[] = new double[15];
		for(int i=0;i<15;i++){
			averageMarksArray[i] = totalMarksArray[i]/5;
		}
		
		for(int i=0;i<15;i++){
			if(averageMarksArray[i] >= 40.0){
				System.out.println("Student "+(i+1)+" You are Passed!");
			}else{
				System.out.println("Student "+(i+1)+" You are Failed!!");
			}
		}

    }
}
