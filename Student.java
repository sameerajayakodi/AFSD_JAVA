class Student{
	
	static void func1(){
		
		String city = "Delhi";  
		if(city == "Meerut"){
			
			System.out.println("city is meerut");  
			}else if (city == "Noida"){
				System.out.println("city is noida");  
				
				}else if(city == "Agra") {
					System.out.println("city is agra");  
					
					}else{
						System.out.println(city);  
						
						}
		
		}
	
	public static void main(String[] args){
	
	int x =5;
	int y = 1;
	int z = x + y;
	
	if(z>2){
		System.out.println("X + y Greater than 5");
		}else{
			System.out.println("X + y Less than 5");
			
			}
			
			func1();
	}

	}
