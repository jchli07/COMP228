package exercise3;

public class Overload {
    public static void main(String[] args) {
        System.out.printf("Is smaller than %d%n", amount(7));
        System.out.printf("Somehow multiplied into %f Teletubies%n", amount(8.3));
        System.out.printf("See? The word >%s< appeared with method overloading%n", amount("Fantastic"));
    }

    public static int amount(int value){
        System.out.printf("The number %d%n", value);
        return value * value;

    }
    public static double amount(double value){
        System.out.printf("%f Teletubies%n", value);
        return value * value;
    }
    public static String amount(String value){
        System.out.printf("I am adding this word >%s< to the next sentence%n", value);
        return value;
    }


}
