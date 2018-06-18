package Ex3;

public class PersonalMortgage extends Mortgage{
    private double personalRate = 0.02;

    //Constructor
    public PersonalMortgage(String mortgageNumber, String ctmName, double mortgageAmt, double interestRate, double personalRate, int Term)
    {
        super(mortgageNumber, ctmName, mortgageAmt, interestRate + personalRate,Term );
        this.personalRate = personalRate;
    }
}
