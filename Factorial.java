
class Factorial{
	static int factorial(int n){
		if(n==0){
		return 1;
		}else{
		return (n*factorial(n-1));
	}
	}
	
	
	public static void main(String [] args){
		int value = 5;
		int result = factorial(value);
		
		System.out.println("Factorial value of the " + value + " is "+ result);
	
	}
	
	
	}

