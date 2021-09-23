import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        double valor, porcentagem, resultado;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe o valor do produto", "Taxas por estado", JOptionPane.INFORMATION_MESSAGE);
        valor = Double.parseDouble(janela);

        janela = JOptionPane.showInputDialog(null, "Informe o estado desejado: " + "\n" +  "|MG| para Minas Gerais" + "\n" +  "|SP| para São Paulo"+  "\n" +  "|RJ| para Rio de Janeiro"+ "\n" +  "|MS| para Mato Grosso do Sul", "Taxas por Estado" , JOptionPane.INFORMATION_MESSAGE);

        switch(janela){
            case "MG":
                porcentagem = valor * 0.07;
                resultado = valor + porcentagem;

                JOptionPane.showMessageDialog(null, "Valor do produto com acrescimo: " + resultado, "Taxa no estado de MG", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case "SP":

                porcentagem = valor * 0.12;
                resultado = valor + porcentagem;

                JOptionPane.showMessageDialog(null, "SP escolhido:" + "\n" + "Valor do produto:" + resultado, "Taxas por Estado", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case "RJ":

                porcentagem = valor * 0.15;
                resultado = valor + porcentagem;

                JOptionPane.showMessageDialog(null, "RJ escolhido:" + "\n" + "Valor do produto:" + resultado, "Taxas por Estado", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "MS":

                porcentagem = valor * 0.08;
                resultado = valor + porcentagem;

                JOptionPane.showMessageDialog(null, "MS escolhido:" + "\n" + "Valor do produto:" + resultado, "Taxas por Estado", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:

                JOptionPane.showMessageDialog(null, "Nenhum Estado foi Escolhido!!", "!!!!ERROR!!!!", JOptionPane.INFORMATION_MESSAGE);
                break;
        }       
    }
}
