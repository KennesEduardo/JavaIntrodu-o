import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        double numero, quadrado;
        double raiz;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe o Número: ", "Potenciação ", JOptionPane.INFORMATION_MESSAGE);
        numero = Double.parseDouble(janela);

        if( numero > 0){

            quadrado = numero * numero;
            raiz = Math.sqrt(numero);
            
            JOptionPane.showMessageDialog(null, "Numero ao quadrado: " + quadrado + "\n" + "Raiz quadrada: " + raiz, "Potenciação", JOptionPane.INFORMATION_MESSAGE);

        }else{

            JOptionPane.showMessageDialog(null, "Numero ao quadrado: "  + "!!!ERROR!!: ", "Potenciação", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
