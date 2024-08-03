import java.util.Scanner;

class Test17 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dbUsername = "admin";
		String dbPassword = "admin";
		boolean isLogged = false;
		for(int i =0;i<5;i++){
			
		System.out.print("Enter Your username : ");
		String username = sc.next();
		
		System.out.print("Enter Your Password : ");
		String password = sc.next();
		
		if(username.equals(dbUsername) && password.equals(dbPassword)){
			System.out.print("Login Success!");
			isLogged = true;
			break;
			}else{
				System.out.println("Login Failed! ");
				
				}
		}
		    if(!isLogged){
				System.out.print("Account Locked!");
				}
			
			
		
	}	
}		
