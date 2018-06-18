package Ex3;

public class BusinessMortgage extends Mortgage {
    private double businessRate = 0.01;

    //Constructor
    public BusinessMortgage(String mortgageNumber, String ctmName, double mortgageAmt, double interestRate, double businessRate, int Term)
    {
        super(mortgageNumber, ctmName, mortgageAmt, interestRate + businessRate,Term );
        this.businessRate = businessRate;
    }

    public String toString()
    {
        return String.format();
    }
}
