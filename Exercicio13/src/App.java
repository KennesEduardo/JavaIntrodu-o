import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        double salario, emprestimo, media, resultado;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe o valor do salario: ", "Empréstimo", JOptionPane.INFORMATION_MESSAGE);
        salario = Double.parseDouble(janela);
        
        janela = JOptionPane.showInputDialog(null, "Informe o valor da parcela do Emprestimo: ", "Empréstimo", JOptionPane.INFORMATION_MESSAGE);
        emprestimo = Double.parseDouble(janela);
        
        media = salario * 0.20;
                
        if (emprestimo > media){

            JOptionPane.showMessageDialog(null, "Empréstimo não concedido", "Empréstimo", JOptionPane.INFORMATION_MESSAGE);

        }else{

            JOptionPane.showMessageDialog(null, "Empréstimo concedido", "Empréstimo", JOptionPane.INFORMATION_MESSAGE);

       }
    }
}
