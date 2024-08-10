import java.util.Scanner;

class Test22 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double familiesTotalIncome [] = new double [20];
		double maxIncome = 0.0;
		int poorCount = 0;
		double averageIncome = 0;
		double allTotalIncome = 0;
		
		for(int i=0;i<3;i++){
			System.out.println("Enter family "+(i+1)+ " details");
			System.out.print("Enter Your Job Income : ");
			double jobIncome = sc.nextDouble();
			
			System.out.print("Enter Your Business Income : ");
			double businessIncome = sc.nextDouble();
			
			System.out.print("Enter Your Land Income : ");
			double landIncome = sc.nextDouble();
			
			double totalIncome = jobIncome + businessIncome + landIncome;
			
			familiesTotalIncome[i] = totalIncome;
			allTotalIncome += totalIncome;
		}
		
		
		for(int i=0;i<20;i++){
			allTotalIncome += familiesTotalIncome[i]; 
			if(maxIncome< familiesTotalIncome[i]){
				maxIncome = familiesTotalIncome[i];
			}
			
			if(familiesTotalIncome[i] < 20000){
				poorCount++;
			}
			
			
		}
		
		averageIncome =allTotalIncome / 20;
		
		System.out.println("Max Income  = "+maxIncome);
		System.out.println("Poor Family Count  = "+poorCount);
		System.out.println("Average Income of the family  = "+averageIncome);
	}
}	
