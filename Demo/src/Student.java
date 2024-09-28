public class Student {
    private String name;
    private int age;
    private  double mark;

    //data tika single unit ekkata wrap kirala data walta protection ekak labadima // setter method eka validation barriur ekak lesa hasire

    public void setName(String  name){
        this.name = name;
    }

    public void setAge(int age){
        if(age  > 10 && age < 80){
            this.age = age;
        }

    }

    public void setMark(double mark){
        this.mark = mark;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getMark(){
        return mark;
    }
}
