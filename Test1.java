import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        String firstEmployeeName, secondEmployeeName, thirdEmployeeName;
        double empOneMonthlySalary, empTwoMonthlySalary, empThreeMonthlySalary, incrementPercentage, empOneIncrementedSalary, empTwoIncrementedSalary, empThreeIncrementedSalary;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Employee Name : ");
        firstEmployeeName = sc.next();

        System.out.print("Enter first Employee Basic Salary : ");
        empOneMonthlySalary = sc.nextDouble();

        System.out.print("Enter second Employee Name : ");
        secondEmployeeName = sc.next();

        System.out.print("Enter second Employee Basic Salary : ");
        empTwoMonthlySalary = sc.nextDouble();

        System.out.print("Enter third Employee Name : ");
        thirdEmployeeName = sc.next();

        System.out.print("Enter third Employee Basic Salary : ");
        empThreeMonthlySalary = sc.nextDouble();

        System.out.print("Enter Percentage of Increment : ");
        incrementPercentage = sc.nextDouble();

        
        empOneIncrementedSalary = empOneMonthlySalary + (empOneMonthlySalary * incrementPercentage / 100);
        empTwoIncrementedSalary = empTwoMonthlySalary + (empTwoMonthlySalary * incrementPercentage / 100);
        empThreeIncrementedSalary = empThreeMonthlySalary + (empThreeMonthlySalary * incrementPercentage / 100);

        
        System.out.println(firstEmployeeName + "'s incremented salary: " + empOneIncrementedSalary);
        System.out.println(secondEmployeeName + "'s incremented salary: " + empTwoIncrementedSalary);
        System.out.println(thirdEmployeeName + "'s incremented salary: " + empThreeIncrementedSalary);

       
        
    }
}
