import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        float dolar, real, resultado;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe a Cotação atual do Dólar: ", "Conversor de Real para Dolar", JOptionPane.INFORMATION_MESSAGE);
        dolar = Float.parseFloat(janela);

        janela = JOptionPane.showInputDialog(null, "Informe a quantia em Real: ", "Conversor de Real para Dolar", JOptionPane.INFORMATION_MESSAGE);
        real= Float.parseFloat(janela);

        resultado = real / dolar ;

        JOptionPane.showMessageDialog(null, "O valor  digitado em dólar é:" + resultado,  "Conversor de Real para Dolar", JOptionPane.INFORMATION_MESSAGE);
    }
}
