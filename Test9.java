import java.util.Scanner;

class Test9 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Integer number : ");
		int input = sc.nextInt();
		
		if(input%2 == 0){
			System.out.print(input +" is Even Number!");
			
			}else{
				System.out.print(input+ " is Odd Number!");
				}
		
		
		}
}
