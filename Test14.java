import java.util.Scanner;

class Test14 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your month : ");
		String month = sc.next();
		
		if(month.equalsIgnoreCase("january")){
			System.out.println(month + " = Duruthu");
			    
			    }else if(month.equalsIgnoreCase("february")){
				System.out.println(month + " = Nawam");
				}else if(month.equalsIgnoreCase("march")){
				System.out.println(month + " = Madin");
				}else if(month.equalsIgnoreCase("april")){
				System.out.println(month + " = Bak");
				}else if(month.equalsIgnoreCase("may")){
				System.out.println(month + " = Wesak");
				}else if(month.equalsIgnoreCase("june")){
				System.out.println(month + " = Poson");
				}else{
				System.out.println(month + " is Invalid!");	
					}
	}
}	
