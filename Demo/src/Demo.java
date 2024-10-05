import java.util.Objects;
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

       Animal animal  = new Animal("lion",25,"meet");


        Object v1 = new Car();
        Object v2 = new Vehicle();

        System.out.println(v1);

        //abstract class ekakin object ekak hadanna ba
        //abstract clss type reference variable ekakata sub class object ekak assign karanna puluwan
        //compile time ekedi compiler balanne Demo1 demo = new Demo2() meke wam paththe Demo1 eke thiyana method name eka witharai run weddi Demo2 eke method eka run wenawa
        Demo1 demo = new Demo2();
        demo.Play();
        demo.Run();


        //Anonymous inner class , class eka penne na but methods overide wela thiyenne
        //interface ekaka thiyana methods override karanna puluwan class ekak nathiwa anonymous class ekak use karala
        Demo3 demo3 = new Demo3() {
            @Override
            public void saveEmployee() {

            }

            @Override
            public void deleteEmployee() {

            }
        };

        demo3.deleteEmployee();
        demo3.saveEmployee();

        //Functional interface ekak lambda expression use karala eke thiyana method eka me widihata override karanna puluwan
        Demo4 demo4 = () -> {
            //logic here
        };

        //polimorphism --> single interface many forms
        //compile time polimorphism
        Demo5 demo5 = new Demo5();
        demo5.saveEmployee();
        demo5.saveEmployee(4);
        demo5.saveEmployee(4,"abc");

        // method overriing ekak wela thiyana wita run time polimorpjism siduwe (dynamic method distpatch wena welawaka)
        //non reference objecs clean karanwa garbage collecter
        System.gc(); //calling garbage collecter

//        protected void finalize(){
//            //last task
//        }
        //java bean class
        //java pojo class
        //java spring bean
    }
}
