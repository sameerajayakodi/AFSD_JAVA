import java.util.Scanner;
import java.util.Calendar;
 
 

class Test29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] data = new int [5];
        data[0] = 1;
        data[1] = 2;
        
        System.out.println(data[3]);
        
        
}


public static int binarySearch(int []array,int key , int left ,int right){
	
	while(left<=right){
	int mid = left + (right-left)/2;
	if(array[mid]==key){
		return mid;
	}	
	if (array[mid]<key){
		left = mid+1;
	}else{
		right = mid-1;
	}
	}
	return -1;
}

//sorting -> bucket sort
public static int[] bucketSort(int []array){
	int max = getMax(array);
	int[] sortedArray = new int[mx+1];
	for(int cur : array){
		for(int i=0;i<=max;i++){
			int currentVal = array[i];
			sortedArray[currentVal] = currentVal;
		}
	}
}
return sortedArray;


public static int[] bubbleSort(int []array){
	for(int i=array.length-1;i>0;i--){
		for (int j=0;j<i);j++{
			if(array[j-1]<array[j]){
				int temp = array[j-1];
				array[j-1]= array[j]
				array[j]=temp;
			}
		}
	}
}

public int factorial(int n){
	if(n==0){
		return 1
	}
	return (n*factorial(n-1));
}

public int fibonnacci(int n){
	if(n=0){
		return 0;
	}
	if(n=1){
		return 1;
	}else{
		return fibonnacci(n-1)+fibonnacci(n-2);
	}
	
}
}
