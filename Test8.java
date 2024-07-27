import java.util.Scanner;

class Test8 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter Your Income : ");
		double income = sc.nextDouble();
		
		double consumeAmount = (income*0.5);
		double investAmount = (income*0.25);
		double saveAmount = (income*0.25);
		
		System.out.println("Consume Amount = "+consumeAmount);
		System.out.println("Invest Amount = "+investAmount);
		System.out.println("Save Amount = "+saveAmount);
		
		
		if(investAmount>= 75000){
			System.out.println("You are under the tax!");
			}else{
				System.out.println("You are tax free!");
				}
		
		
	}
	
}
