class Test35{
	public static void main(String args[]){
		Animal anim1 = new Animal();
		anim1.name = "Lion";
		anim1.age = 25;
		anim1.noOfLegs = 4;
		anim1.favFood = "meet";
		
		System.out.println(anim1);
		Animal anim2 = new Animal(10);
	} 
}


class Animal{
	String name;
	int age;
	int noOfLegs;
	String favFood;
	
	//constructor
	//invoked at object creation****
	//no return type
	//same to class name
	//Default constructor ..Automatic include at compilation time
	//can oveloding constructor(using deferent parameter count or parameter type)
	public Animal(){
		//this is default constructor
		//data load on object calling 
		System.out.println("hello");
	}
	
	public Animal(String name){
		
	}
	
	public Animal(int a){
		System.out.println("hi");
	}
}
