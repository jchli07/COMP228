package Ex1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InsuranceDriver {
    public static void main(String[] args) {
        List<Insurance> insurances = new ArrayList<Insurance>();
        String[] option = {"Life", "Health", "Finish"};
        int op = 0;
        String input;
        double fee;

        while (op != 2)
        {
            op = JOptionPane.showOptionDialog(null, "Please choose one of the following options",
                    "Add Insurance", JOptionPane.DEFAULT_OPTION, 3, null, option, option[2]);
            switch (op)
            {
                //Life insurance
                case 0:
                    input = JOptionPane.showInputDialog("Enter type of Insurance");
                    fee = Double.parseDouble(JOptionPane.showInputDialog("Please enter monthly fee"));
                    insurances.add(new Life(input, fee));
                    JOptionPane.showMessageDialog(null, "Successfully Added!");
                    break;

                //Health Insurance
                case 1:
                    input = JOptionPane.showInputDialog("Enter type of Insurance");
                    fee = Double.parseDouble(JOptionPane.showInputDialog("Please enter monthly fee"));
                    insurances.add(new Life(input, fee));
                    JOptionPane.showMessageDialog(null, "Successfully Added!");
                    break;

                    default:
                        break;
            }
        }
        //Insurance Display
        String message = "";
        for (Insurance insurance: insurances)
        {
            message += String.format("%s%n", insurance);
        }
        JOptionPane.showMessageDialog(null, message);

        //Will work on Polymorphism
    }
}
