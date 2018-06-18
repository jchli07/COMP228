package Ex2;

public class FullTime extends Student {

    //Max tuition is 50*50 = 2500
    @Override
    public double tuition(){
        return 2500;
    }

    //Constructor
    public FullTime(String name) {
        super(name, true);
    }

    //Message
    @Override
    public String toString() {
        return String.format("%s%s%n%s$%.2f%n", "Full-Time Student: ", super.getName(), "Tuition: ", tuition());
    }

}
