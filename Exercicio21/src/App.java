import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {

        int opcao;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe o número :", "Dias da semana", JOptionPane.INFORMATION_MESSAGE);
        opcao = Integer.parseInt(janela);

        switch(opcao){
                
            case 1:

                JOptionPane.showMessageDialog(null, "Domingo escolhido!!", "Dias da semana", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 2:

                JOptionPane.showMessageDialog(null, "Segunda-feira escolhido!!", "Dias da semana", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 3:

                JOptionPane.showMessageDialog(null, "Terça-feira escolhido!!", "Dias da semana", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 4:

                JOptionPane.showMessageDialog(null, "Quarta-feira escolhido!!", "Dias da semana", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 5:

                JOptionPane.showMessageDialog(null, "Quinta-feira escolhido!!", "Dias da semana", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 6:

                JOptionPane.showMessageDialog(null, "Sexta-feira escolhido!!", "Dias da semana", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 7:

                JOptionPane.showMessageDialog(null, "Sabado escolhido!!", "Dias da semana", JOptionPane.INFORMATION_MESSAGE);
            break;    
            
            default:
            JOptionPane.showMessageDialog(null, "Dia da semana invalido", "!!!ERROR!!", JOptionPane.INFORMATION_MESSAGE);
            break;
        }
    }
}
