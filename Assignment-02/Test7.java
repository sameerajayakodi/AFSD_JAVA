import java.util.Scanner;

class Test7 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter your name: ");
        String name = sc.next();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Your gender(male or female) : ");
        String gender = sc.next();
        
        System.out.print("Are You Married (y / n) : ");
        String relationship = sc.next(); 
        
        if (age >= 0 && age <= 12) {
            System.out.println("\nHi " + name + "! As a child, focus on learning and having fun. Enjoy your time, make friends, and listen to your parents and teachers. Explore new hobbies and never stop being curious!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("\nHi " + name + "! Teenage years can be challenging with school, friendships, and discovering your interests. Focus on your education, but also take time to explore your passions. Don't be afraid to ask for help if you feel overwhelmed.");
        } else if (age >= 20 && age <= 29) {
            System.out.println("\nHi " + name + "! Your twenties are a time for building your career and personal life. It's important to set goals and work towards them, but also to enjoy the journey. Make meaningful connections and take care of your health.");
        } else if (age >= 30 && age <= 39) {
            System.out.println("\nHi " + name + "! Your thirties can be a time of significant responsibility, whether it's career advancement, family, or personal growth. Balance your professional and personal life, and take time to invest in your well-being and relationships.");
        } else if (age >= 40 && age <= 49) {
            System.out.println("\nHi " + name + "! Your forties are often about solidifying your achievements and finding stability. Reflect on your accomplishments, but also be open to new opportunities. Take care of your health and enjoy the fruits of your labor.");
        } else if (age >= 50 && age <= 59) {
            System.out.println("\nHi " + name + "! Your fifties can be a time for reflection and planning for the future. It's important to stay active and engaged in activities you love. Consider how you can give back to your community and enjoy quality time with loved ones.");
        } else if (age >= 60) {
            System.out.println("\nHi " + name + "! Your sixties and beyond can be a wonderful period of enjoying retirement and spending time with family and friends. Focus on maintaining your health and finding joy in everyday activities. Cherish the moments and share your wisdom with younger generations.");
        } else {
            System.out.println("\nHi " + name + "! Age is just a number, and everyone's journey is unique. Focus on what makes you happy and fulfilled, regardless of your age.");
        }
        
        
		
		}
		
}


  
