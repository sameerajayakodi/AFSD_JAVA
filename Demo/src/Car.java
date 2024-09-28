import javax.swing.plaf.synth.SynthLookAndFeel;

public class Car  extends  Vehicle{
    private String make;
    private String model;
    private int year;


    public Car(){
        super();
        System.out.println("From car");
    }

    @Override
    public String toString(){
       return "address eka na yako";
    }
}
