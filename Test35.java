class Test35{
	public static void main(String args[]){
		Animal anim1 = new Animal();
		anim1.name = "Lion";
		anim1.age = 25;
		anim1.noOfLegs = 4;
		anim1.favFood = "meet";
		
		System.out.println(anim1);
		Animal anim2 = new Animal(10);
		
		Animal anim3 = new Animal("Monkey",12,4,"Banana");
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
	
	public Animal(String n , int a , int l,String f){
		name = n;
		age = a;
		noOfLegs = l;
		favFood = f;
	}
	
	public Animal(int a){
		System.out.println("hi");
	}
}
