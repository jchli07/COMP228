package Ex2;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class StudentDriver {
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<Student>();
        String[] option = { "Full-time student", "Part-time student", "Finish" };
        int op = 0;
        String input;

        //Showing options for user
        while (op != 2)
        {
            op = JOptionPane.showOptionDialog(null, "Please choose one of the following options",
                    "Add student", JOptionPane.DEFAULT_OPTION, 3, null, option, option[2]);
            switch (op)
            {
                //Full-Time
                case 0:
                    input = JOptionPane.showInputDialog("Enter student's name");
                    students.add(new FullTime(input));
                    JOptionPane.showMessageDialog(null, "Successfully Added!");
                    break;

                //Part-Time
                case 1:
                    //boolean value needed to catch hours exception message
                    boolean valid = false;
                    while (!valid)
                    {
                        input = JOptionPane.showInputDialog("Enter student's name");
                        double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter amount of hours"));
                        try
                        {
                            students.add(new PartTime(input, hours));
                            valid = true;
                        }
                        catch (IllegalArgumentException e)
                        {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                        JOptionPane.showMessageDialog(null, "Part-time student added!");
                        break;
                //When user clicks Finish
                default:
                    break;
            }
        }

        //Display Students created
        String message = "";
        for (Student student: students)
        {
            message += String.format("%s%n", student);
        }
        JOptionPane.showMessageDialog(null, message);
    }

}
