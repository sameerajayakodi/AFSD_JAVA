import java.util.Scanner;



class BinarySearch {
	//Binary Search algorithm
public static void binarySearch(int arr[] , int key ){
	int first  = 0;
	int last = arr.length-1;
	int mid = (first+last)/2;
	
	while(first<=last){
		if(arr[mid] == key){
		System.out.println(key+" is founded by index : "+mid);
		break;
		}else if(key < arr[mid]){
			last = mid - 1;
			}else{
				first = mid +1;
				}
			mid = (first+last)/2;	
	}
	
	if(first>last){
		System.out.println("Key is not found!");
		
		}	
}

//Linear Search Algorithm

public static void linearSearch(int arr[],int key){
	boolean founded = true;
	while(founded){
		for(int i=0;i<arr.length;i++){
			if(key == arr[i]){
			System.out.println(key+" is founded in "+i+" th index");
			founded = true;
			}else{
				System.out.println(key+" is not founded");
				}
			
			}
		
				
		}
	
	}		
	
	
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,3,4,5,6,7,8,9,10};
		int key = 2;
		
		
		//binarySearch(arr , key);
		linearSearch(arr,key);
	}
		
		
}
