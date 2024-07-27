import java.util.Scanner;

class Test10 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String luckyGirl = "abcd";
		
		System.out.print("Enter Your name : ");
		String name1 = sc.next();
		
		
		if(name1.equals(luckyGirl)){
			System.out.println("You are Lucky**");
			}else{
				System.out.println("You are unlucky!");
				}
	}
}
