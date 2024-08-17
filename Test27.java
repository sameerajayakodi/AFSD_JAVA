
import java.util.Scanner;

class Test27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
			if(i==3){
				continue;
			}
			System.out.println(i);
		}
		
		
		int[][] vehicleMilages = new int [8][2];
		vehicleMilages[0][1] = 540000;
		
		for(int i= 0;i<8 ;i++){
			for(int j = 0;j<2;j++){
				vehicleMilages[i][j]= 75000;
			}
		}
		
		System.out.println(vehicleMilages[0][0]);
	}
}	
