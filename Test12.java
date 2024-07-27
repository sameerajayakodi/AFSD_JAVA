import java.util.Scanner;

class Test12 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
  String dbEmail = "admin";
  String dbPassword = "admin";
  
  
  
  System.out.print("Enter Your Email : ");
  String email = sc.next();
  
  System.out.print("Enter Your Password : ");
  String password = sc.next();
  
  if(email.equals(dbEmail) && password.equals(dbPassword)){
	  System.out.println("Login success!");
	  
	  System.out.print("Enter Your Monthly salary : ");
	  double salary = sc.nextDouble();
	  
	  System.out.print("Is you have a car (true/false) : ");
	  boolean haveCar = sc.nextBoolean();
	  
	  if(salary>=100000 && haveCar){
		  System.out.println("You are under the tax");
		  }else if(haveCar){
			  System.out.print("Enter Your Car Value : ");
			  double carValue = sc.nextDouble();
			  
			  if(salary>= 60000 || carValue>=2000000){
				  System.out.println("You are under the waripanam");
				  }
			  }else{
				  System.out.println("You are tax free guy!");
				  }
			  
 
	  }else{
		  System.out.println("Login faild!");
		  }
		
	}
}	
