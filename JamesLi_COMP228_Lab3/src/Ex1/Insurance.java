package Ex1;

public abstract class Insurance {
    private double monthlyCost;
    private final String insuranceType;

    public Insurance(String insuranceType, double monthlyCost){
        //Throw exception if Cost is less than 0
        if (monthlyCost < 0.0)
        {
            throw new IllegalArgumentException("Monthly Cost cannot be less than 0");
        }
        this.monthlyCost = monthlyCost;
        this.insuranceType = insuranceType;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(double monthlyCost)
    {
        if (monthlyCost < 0.0)
        {
            throw new IllegalArgumentException("Monthly Cost cannot be less than 0");
        }
        this.monthlyCost = monthlyCost;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    //Abstract methods
    public abstract String displayInfo();
    public abstract double setInsuranceCost();
}
