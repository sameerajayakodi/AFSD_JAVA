class Test35{
	public static void main(String args[]){
		Animal anim1 = new Animal();
		anim1.name = "Lion";
		anim1.age = 25;
		anim1.noOfLegs = 4;
		anim1.favFood = "meet";
		
		
		Animal anim2 = new Animal();
		System.out.println(anim2.favFood);
		
		Animal anim3 = new Animal("Monkey",12,4,"Banana");
		System.out.println(anim3.name);
	} 
}


class Animal{
	//attributes / instence variables
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
	
	//instance Block / using insert default values for instace variables
	{
		name = "Sameera Jayakodi";
		age = 25;
		noOfLegs = 2;
		favFood = "Fruits";
		
	}
	
	public Animal(String name , int age , int noOfLegs,String favFood){
		//this --> current object copy(anim3)
		this.name = name;
		this.age = age;
		this.noOfLegs = noOfLegs;
		this.favFood = favFood;
	}
	
	public Animal(int a){
		System.out.println("hi");
	}
}
