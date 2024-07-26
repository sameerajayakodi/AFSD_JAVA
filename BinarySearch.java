import java.util.Scanner;



class BinarySearch {
	
public static void binarySearch(int arr[] , int key ){
	int first  = 0;
	int last = arr.length-1;
	int mid = (first+last)/2;
	
	while(first<=last){
		if(arr[mid] == key){}
		System.out.println(key+" is founded by index : "+mid);
		}else if(key < arr[mid]){
			last = mid - 1;
			}else{
				first = mid +1;
				}
	
	
	
	}
	
	
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,3,4,5,6,7,8,9,10};
		int key = 7;
		
		
		binarySearch(arr , key);
	}
		
		
}
