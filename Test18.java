import java.util.Scanner;

class Test18 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		
		while(true){
			System.out.print("Enter Value : ");
			int inputValue = sc.nextInt();
			 
			 if(inputValue < 0){
				 break;
				 }else{
					 total +=inputValue;
					 }
			}
			
			System.out.println("Total = "+ total);
	}
}
