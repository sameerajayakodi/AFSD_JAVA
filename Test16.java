import java.util.Scanner;

class Test16 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many peoples in the city : ");
		int peopleCount = sc.nextInt();
		int mostUse = 0;
		
		int dialogCount = 0;
		int mobitelCount = 0;
		int airtelCount = 0;
		for(int i =0;i< peopleCount ; i++){
			
			System.out.print("Enter your name : ");
			String userName = sc.next();
			
			System.out.print(userName+" How many sim Cards You have : ");
			int simCount = sc.nextInt();
			
			for(int j =0; j<simCount;j++){
				System.out.print("Enter sim card "+ (j+1) + " name : ");
				String simName = sc.next();
				
				if(simName.equalsIgnoreCase("dialog")){
					dialogCount++;
					
					}else if(simName.equalsIgnoreCase("mobitel")){
						mobitelCount++;
						
						}else if(simName.equalsIgnoreCase("airtel")){
							airtelCount++;
							
							}else{
								System.out.println("You Enterd Invalid Sim Name!");
								}
				
				}
			
			}
			
			System.out.println("Dialog Count : "+dialogCount);
			System.out.println("Mobitel Count : "+mobitelCount);
			System.out.println("Airtel Count : "+airtelCount);
			
			if(dialogCount>mobitelCount && dialogCount>airtelCount){
				System.out.println("Most People using Dialog ");
				}else if(mobitelCount>dialogCount && mobitelCount>airtelCount){
					System.out.println("Most People Using Mobitel");
					}else if(airtelCount>mobitelCount && airtelCount>dialogCount){
						System.out.println("Most People Using Airtel");
						}
			
		}
}		
