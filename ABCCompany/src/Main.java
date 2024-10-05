import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Member [] members = new Member[7];
       double salary;
       String address;
       String email;
       for (int i = 0; i < 2; i++) {
           System.out.println("Enter Manager "+ (i+1) + " name : ");
           String managerName = sc.next();
           System.out.println("Enter Manager "+ (i+1) + " campes : ");
           String campus = sc.next();
           System.out.println("Enter Manager "+ (i+1) + " gpa : ");
           double gpa = sc.nextDouble();
           System.out.println("Enter Manager "+ (i+1) + " email : ");
           email = sc.next();
           System.out.println("Enter Manager "+ (i+1) + " salary : ");
           salary = sc.nextDouble();
           Manager manager = new Manager(managerName,campus,salary,gpa,email);
           members[i] = manager;

       }


       for (int i = 2; i < 5; i++) {
            System.out.println("Enter Marketing "+ (i+1) + " name : ");
            String marketingName = sc.next();
           System.out.println("Enter Marketing "+ (i+1) + " expirience : ");
            int yearsOfExp = sc.nextInt();
           System.out.println("Enter Marketing "+ (i+1) + " address : ");
            address = sc.next();
           System.out.println("Enter Marketing "+ (i+1) + " gender : ");
            String gender = sc.next();
           System.out.println("Enter Marketing "+ (i+1) + " salary : ");
            salary = sc.nextDouble();
            Member marketing= new MarketingMember(marketingName,yearsOfExp,address,gender,salary);
            members[i] = marketing;

       }


       for (int i = 5; i < 7; i++) {
           System.out.println("Enter  Sales "+ (i+1)+ " name : ");
           String salesName = sc.next();
           System.out.println("Enter  Sales "+ (i+1)+ " address : ");
           address = sc.next();
           System.out.println("Enter  Sales "+ (i+1)+ " email : ");
           email = sc.next();
           System.out.println("Enter  Sales "+ (i+1)+ " phone : ");
           String phone = sc.next();
           System.out.println("Enter  Sales "+ (i+1)+ " salary : ");
           salary = sc.nextDouble();

           Member sales = new SalesMember(salesName,address,email,phone,salary);
           members[i] = sales;
       }



        double maxSalary = 0;
      


    }
}