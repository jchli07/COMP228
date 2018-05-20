import javax.swing.JOptionPane;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(300588427, "James Li", 10000.00);
        //getAccountInfo();

        //Display current balance of user
        String message1 = String.format("Account #: %s%nCurrent Balance of %s: $%.2f%n", acc1.getAccountNumber(), acc1.getName(), acc1.getBalance());
        JOptionPane.showMessageDialog(null,message1);

        //Asks use to deposit money
        double Amt = Double.parseDouble(JOptionPane.showInputDialog(null,"How much would you like to deposit?"));

        //Adds money to deposit
        acc1.deposit(Amt);

        //Displays new balance
        String message2 = String.format("Account #: %s%nCurrent Balance of %s: $%.2f%n", acc1.getAccountNumber(), acc1.getName(), acc1.getBalance());
        JOptionPane.showMessageDialog(null,message2);

        //getAccountInfo();
    }
/*
    public static String getAccountInfo()
    {
        String message1 = String.format("How rich is %s?: $%.2f%n", acc1.getName(), acc1.getBalance());
        JOptionPane.showMessageDialog(null,message1);
        return message1;
    }
    */
}
