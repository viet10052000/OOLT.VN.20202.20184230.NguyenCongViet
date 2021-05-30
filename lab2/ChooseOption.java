import javax.swing.JOptionPane;

public class ChooseOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
        "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null,
        "You're chosen:" + (option == JOptionPane.YES_OPTION?"yes":"no"));
        System.exit(0);
    }
    
}
