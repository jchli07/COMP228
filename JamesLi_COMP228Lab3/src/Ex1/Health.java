package Ex1;

public class Health extends Insurance {

    public Health(double monthlyCost, String insuranceType){
        super(monthlyCost, insuranceType);
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
