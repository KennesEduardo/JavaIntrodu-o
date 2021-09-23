import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        double hipotenusa, valorA, valorB, resultado;
        String janela;

        janela =  JOptionPane.showInputDialog(null, "Informe o valor de A: ", "Calculo da área do triangulo", JOptionPane.INFORMATION_MESSAGE);
        valorA = Double.parseDouble(janela);

        janela =  JOptionPane.showInputDialog(null, "Informe o valor de B: ", "Calculo da área do triangulo", JOptionPane.INFORMATION_MESSAGE);
        valorB = Double.parseDouble(janela);

        hipotenusa = Math.pow(valorA, 2) + Math.pow(valorB, 2);
        resultado = Math.sqrt(hipotenusa);


        JOptionPane.showMessageDialog(null, "Área do Triangulo: " + resultado, "Calculo da área do triangulo", JOptionPane.INFORMATION_MESSAGE);
    }
}
