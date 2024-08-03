import java.util.Scanner;

class Test17 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int familyCount = 0;
		for(int i=0;i<18;i++){
			System.out.print("Enter Income For Family "+ (i+1) + " : ");
			double income = sc.nextDouble();
			
			if(income<35000.0){
				familyCount++;
				}
			}
			System.out.println("Family Count is : "+ familyCount);
			
		
		}
		
}		
