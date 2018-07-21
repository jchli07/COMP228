package Ex2;

public class PartTime extends Student {
    private double hours;

    public double getHours() {
        return hours;
    }

    //Check for improper input of hours
    public static void checkHours(double hours)
    {
        //Assume Max hours is 50, cannot have 0 hours
        if (hours <= 0 || hours > 50)
        {
            throw new IllegalArgumentException("Hours per week must be greater than 0 and less than 50");
        }
    }

    //Constructor
    public PartTime(String name, double hours){
        super(name, false);
        checkHours(hours);
        this.hours = hours;
    }

    //Calculate tuition
    @Override
    public double tuition(){
        return 50 * hours;
    }

    //Message
    @Override
    public String toString() {
        return String.format("%s%s%n%s%.2f%n%s$%.2f%n", "Part-time Student: ", super.getName(), "Hours per week: ", getHours(), "Tuition", tuition());
    }


}
