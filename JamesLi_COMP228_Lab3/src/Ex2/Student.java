package Ex2;

public abstract class Student {
    private final String name;
    private final boolean fTime;

    public Student(String name, boolean fTime) {

        this.name = name;
        this.fTime = fTime;
    }

    //Getter and setters
    public String getName(){
        return name;
    }

    public boolean isfTime() {
        return fTime;
    }

    //Abstract method
    public abstract double tuition();
}
