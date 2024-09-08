import java.util.Scanner;

class Test34 {

    public static void main(String[] args) {
		
		
		
		// static variables = class variables
		//stored values in class variable but can access using object and can insert value through object
		//can access class name
		Student s1 = new Student();
		s1.age = 45;
		Student s2 = new Student();
		System.out.println(s2.age);
		
		//System.out.println(Student.age);
		
		//object --> instance of a class
		//class --> blueprint of a object
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[20];

        for (int i = 0; i < 20; i++) {
            vehicles[i] = new Vehicle(); 

            System.out.println("Enter details for vehicle " + (i + 1) + ":");

            System.out.print("Enter vehicle type: ");
            vehicles[i].type = sc.next(); 

            System.out.print("Enter engine capacity: ");
            vehicles[i].engineCapacity = sc.nextDouble(); 

            System.out.print("Enter vehicle color: ");
            vehicles[i].color = sc.next();

            System.out.print("Enter tyre count: ");
            vehicles[i].tyreCount = sc.nextInt();

            System.out.print("Enter transmission mode: ");
            vehicles[i].transmissionMode = sc.next(); 


			System.out.println("-------------------------------------------");
        }

        
    }
}

class Vehicle {
    String type;
    double engineCapacity;
    String color;
    int tyreCount;
    String transmissionMode;
    
   
}

class Student{
	 static int age;
	 
	 public static void run(){
		 
	 }
}
