import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        double area = 0.0d;
        double raio = 0.0d;
        String janela;
        
        janela = JOptionPane.showInputDialog(null, "Informe o valor do Raio", "Área do círculo", JOptionPane.INFORMATION_MESSAGE);
        raio = Double.parseDouble(janela);

        area = Math.PI * Math.pow(raio, 2);

        JOptionPane.showMessageDialog(null, "Área do Círculo: " + area , "Área do círculo", JOptionPane.INFORMATION_MESSAGE);
    }
}
