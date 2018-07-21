package Ex3;

public abstract class Mortgage implements MortgageConstants{
    private final String mortgageNumber;
    private final String ctmName;
    private double mortgageAmt;
    private double interestRate;
    private int Term;

    public Mortgage(String mortgageNumber, String ctmName, double mortgageAmt, double interestRate, int Term)
    {
        if (mortgageAmt < 0.0 || mortgageAmt > 300000)
        {
            throw new IllegalArgumentException("Mortgage amount cannot be less than 0.0 or larger than 300,000");
        }
        if (interestRate < 0)
        {
            throw new IllegalArgumentException("Interest rate cannot be less than 0");
        }

        this.mortgageNumber = mortgageNumber;
        this.ctmName = ctmName;
        this.mortgageAmt = mortgageAmt;
        this.interestRate = interestRate;
        this.Term = Term;
    }

    public String getMortgageInfo()
    {
        return String.format("%s%s%n %s%s%n %s%s%n %s%s%n %s%s%n %s$%.2d%n",
                "Bank: ", bankName,
                "Mortgage Number: ", getMortgageNumber(),
                "Customer Name: ", getCtmName(),
                "Mortgage Amount: ", getMortgageAmt(),
                "Interest rate: ", getInterestRate(),
                "Term: ", getTerm());
    }

    //Getters and Setters
    public String getMortgageNumber() {
        return mortgageNumber;
    }

    public String getCtmName() {
        return ctmName;
    }

    public double getMortgageAmt() {
        return mortgageAmt;
    }

    public void setMortgageAmt(double mortgageAmt)
    {
        if (mortgageAmt < 0.0)
        {
            throw new IllegalArgumentException("Mortgage amount cannot be less than 0.0");
        }

        this.mortgageAmt = mortgageAmt;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate)
    {
        if (interestRate < 0)
        {
            throw new IllegalArgumentException("Interest rate cannot be less than 0");
        }
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return Term;
    }

    public void setTerm(int term) {
        Term = term;
    }
}
