class LinearSearch{
	
	static int linearSearch(int key , int items[]){
		
		for(int i=0;i<items.length;i++){
			if(key == items[i]){
				return i;
				}
			
			}
		return -1;
		}
	
	
	 public static void main(String[] args){
		 int []items = {4,85,3,2,69,5,2,4,5,8,62,41,20,3,9,6,96,85,74,85,32,20};
		 int key = 62;
		 
		int result =  linearSearch(key , items);
	  System.out.println(result);
	  
	  }
	}  
 
