import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception{

        float km, ms;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe a velocidade em Km/h", "Conversor de KM/h para M/s", JOptionPane.INFORMATION_MESSAGE);
        km = Float.parseFloat(janela);
        
        ms = km / 36;
            
        JOptionPane.showMessageDialog(null, "A velocidade em M/s é: " + ms, "Conversor de KM/h para M/s", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
