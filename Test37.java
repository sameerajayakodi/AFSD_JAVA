import java.util.Random;
class Test37{
	public static void main(String args[]){
		Random rand = new Random();
		int random;
		for(int i=0;i<100;i++){
			
			random = rand.nextInt(100);
			System.out.println(random);
		}
	}
}
