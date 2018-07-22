package Ex1;

public class Driver {
    public static void main(String[] args) {
        MainMenu menuFrame = new MainMenu();
        menuFrame.setDefaultCloseOperation(menuFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(250, 150);
        menuFrame.setLocationRelativeTo(null);
        menuFrame.setVisible(true);
    }
}
