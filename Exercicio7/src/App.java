import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        double premio = 780000;
        double ganhador1, ganhador2, ganhador3;

        ganhador1 = (premio * 0.46);
        ganhador2 = (premio * 0.32);
        ganhador3 = (premio * 0.22);
                
        JOptionPane.showMessageDialog(null, "O primeiro ganhador receberá R$: " + ganhador1 + "\n" + "O segundo receberá: R$: " + ganhador2 + "\n" + " O terceiro receberá R$: " + ganhador3 + "\n",  "Mostrar três ganhadores", JOptionPane.INFORMATION_MESSAGE);
    }
}
