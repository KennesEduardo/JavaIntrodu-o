import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {

        int numero, cont1, cont2;
        String pergunta;
        
        pergunta = JOptionPane.showInputDialog(null, "Informe um número: ", "Exercíco 1", JOptionPane.INFORMATION_MESSAGE);
        numero = Integer.parseInt(pergunta);
        
        cont1 = numero + 1;
        cont2 = numero - 1;

        JOptionPane.showMessageDialog(null, "Número Sucessor:" + cont1 + "\n" + "Numero Digitado:" + numero + "\n"+ "Número Antecessor:" + cont2 , "Exercício 1", JOptionPane.INFORMATION_MESSAGE);
    }
}
