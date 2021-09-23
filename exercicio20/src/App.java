import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int opcao;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe o número do seu mês:", "Mês", JOptionPane.INFORMATION_MESSAGE);
        opcao = Integer.parseInt(janela);

        switch(opcao){
                
            case 1:

                JOptionPane.showMessageDialog(null, "Mês Janeiro escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:

                JOptionPane.showMessageDialog(null, "Mês Fevereiro escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 3:

                JOptionPane.showMessageDialog(null, "Mês Março escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 4:

                JOptionPane.showMessageDialog(null, "Mês Abril escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 5:

                JOptionPane.showMessageDialog(null, "Mês Maio escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 6:

                JOptionPane.showMessageDialog(null, "Mês Junho escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 7:

                JOptionPane.showMessageDialog(null, "Mês Julho escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 8:

                JOptionPane.showMessageDialog(null, "Mês Agosto escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 9:

                JOptionPane.showMessageDialog(null, "Mês Setembro escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 10:
                JOptionPane.showMessageDialog(null, "Mês Outubro escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 11:

                JOptionPane.showMessageDialog(null, "Mês Novembro escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 12:

                JOptionPane.showMessageDialog(null, "Mês Dezembro escolhido!!", "Mês", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção invalida", "!!!ERROR!!", JOptionPane.INFORMATION_MESSAGE);
                break;
            }    
    }
}
