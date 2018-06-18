package Ex1;

public class Health extends Insurance {

    public Health(String insuranceType, double monthlyCost){
        super(insuranceType, monthlyCost);
    }

    //To get cost
    @Override
    public double setInsuranceCost() {
        return getMonthlyCost();
    }

    //Message
    @Override
    public String displayInfo(){
        return String.format("%s%n %s%n %s%n% $%.2f",
                "Insurance Type:", super.getInsuranceType(), "Insurance Cost:", getMonthlyCost());

    }
}
