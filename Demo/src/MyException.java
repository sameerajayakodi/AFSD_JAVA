import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

//customize excepton ekaka sadima
//defauls custrutor ekak ona
//super class eke constructor ekata pass krnna oni mekedi gnna parameters tika
public class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }

    //problems
    public static class Demo6 {
        public static void main(String[] args) {
            int[] ages = new int[6];

            try {
                ages[8] = 18;
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Please use array boundaries");
            }


            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number 1 : ");
            int num1 = 0;
            try {
                 num1 = scanner.nextInt();
            }catch (InputMismatchException ex){
                System.out.println("Please enter a number");
            }
            System.out.println("Number 1 : " + num1);


            System.out.println("Please enter number 1 : ");
            int input1 = scanner.nextInt();
            System.out.println("please enter number 2 : ");
            int input2 = scanner.nextInt();



            try {
                int result = input1 / input2;
            }catch (ArithmeticException ex){
                System.out.println("Please enter valid number");
            }

            File file = new File("abc.txt");
            try {
                FileReader fileReader = new FileReader(file);
            }catch (FileNotFoundException ex){
                System.out.println("File not found");
            }

            try {
                //error eka thiyana eka danne methanata ..meke error ekak thibboth catch block eka athulata paninawa
                //catch ekata Exception data ona ekak allanna puluwan habai eheme karanne ne..exception ekakata wada enawanam multiple catch block use
                //karanna puluwan naththan | eka dala liyanna puluwan
                //throws eken karanne methosd eka use karana thanata exception eka pass karana eka
                getSum();
            }catch (ArithmeticException | FileNotFoundException ex){
                System.out.println("Arithmetic exception or file not found");
            }finally {
                //exception ekk awath nathth meka run wenawa
                System.out.println("Finally");
            }

            int val = 50;
            if(val> 10){
                //throw eken apiata exception ekaka apita ona welawedi error ekak pennana(athikarawanna) puluwan
                throw new ArithmeticException();
            }



        }

        public  static  void getSum() throws  ArithmeticException , FileNotFoundException{
            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);
        }


        public static void updateCustomer(int id , String name) throws MyException{
            if (id > 100){
                throw new MyException("this is my exception");
            }
        }
    }
}
