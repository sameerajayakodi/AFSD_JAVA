
import java.util.Scanner;

class Test11 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  String dbEmail = "admin@gmail.com";
  String dbPassword = "admin123";
  
  
  
  System.out.print("Enter Your Email : ");
  String email = sc.next();
  
  System.out.print("Enter Your Password : ");
  String password = sc.next();
  
  if(email.equals(dbEmail) && password.equals(dbPassword)){
	  System.out.println("Login success!");
 
	  }else{
		  System.out.println("Login faild!");
		  }
  
  		
	}
	
}
