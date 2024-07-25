
import java.util.Scanner;

class Test4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month : ");
		String month = sc.next();
		
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		boolean specialYear = false;
		
		if(year%4==0){
			specialYear =  true;
			}
			
			if(month.equals("february")){
				
				
				if(specialYear){
					System.out.println(month + " has 29 Days.");
					}else{
						System.out.println(month + " has 28 Days.");
						}
				
				}else{
					
				if(month.equals("january") ||month.equals("march") ||month.equals("may") ||month.equals("july") || month.equals("september") || month.equals("october") || month.equals("december")){
				System.out.println(month + " has 31 Days.");
				}else{
					
					if(month.equals("april") ||month.equals("june") ||month.equals("august") ||month.equals("november")){
					System.out.println(month + " has 30 Days.");
					}else{
						System.out.println(month + " is Invalid!");
						}
						
					}
				}
					
					
		       
			
		
		
		}

}
