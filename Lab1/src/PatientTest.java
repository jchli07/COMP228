import javax.swing.JOptionPane;
public class PatientTest {

    public static void main(String[] args)
    {


        Patient myPatient = new Patient();

        //Get first name
        String first = JOptionPane.showInputDialog("Enter your first name");
        myPatient.setfName(first);
        //Get last name
        String last = JOptionPane.showInputDialog("Enter your last name");
        myPatient.setlName(last);
        //Get Address
        String add = JOptionPane.showInputDialog("Enter your address");
        myPatient.setAddress(add);
        //Get City
        String cty = JOptionPane.showInputDialog("Enter your city");
        myPatient.setCity(cty);
        //Get Province
        String pro = JOptionPane.showInputDialog("Enter your Province");
        myPatient.setProvince(pro);
        //Get Postal Code
        String pc = JOptionPane.showInputDialog("Enter your Postal Code");
        myPatient.setpCode(pc);

        //Display Info
        String message = String.format("Your patient info is:%n%s%n %n%s%n %n%s%n %n%s%n %n%s%n %n%s%n", myPatient.getfName(), myPatient.getlName(), myPatient.getAddress(), myPatient.getCity(), myPatient.getProvince(),myPatient.getpCode());
        JOptionPane.showMessageDialog(null, message);
        //getPatientInfo();
    }
/*
    public String getPatientInfo(String fname, String lname, String add, String cty, String pro, String pc)
    {
        System.out.printf("Your patient info is:%n%s%n %n%s%n %n%s%n %n%s%n %n%s%n %n%s%n",)
    }
    */
}
