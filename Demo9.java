import java.util.Scanner;


class Demo9{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//customerName,mainIncome , businessIncome , otherIncome , totalIncome
		System.out.print("Enter Customer Name : ");
		String customerName = sc.next();
		
		System.out.print("Enter Your Main Income : ");
		double mainIncome = sc.nextDouble();
		
		System.out.print("Enter Your Business Income : ");
		double businessIncome = sc.nextDouble();
		
		System.out.print("Enter Your Other Income : ");
		double otherIncome = sc.nextDouble();
		
		double totalIncome = mainIncome + businessIncome+ otherIncome;
		
		if(totalIncome<50000){
			
			System.out.println(customerName+ " you are Aswasuma eligible**. ");
			}else{
				
				System.out.println(customerName+ " you are NOT Aswasuma eligible!.");
				}
		
		
		
		}
	
	
}
