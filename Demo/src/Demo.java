import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello  World");
        Scanner sc = new Scanner(System.in);

       Student s1 = new Student();
       s1.setName("Sameera");
       s1.setAge(23);
       s1.setMark(80);

       System.out.println( " Name  : "+  s1.getName() + "| Age :  " + s1.getAge() + "| Mark :  " + s1.getMark());
    }
}
