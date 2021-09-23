import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {

        int idade, nascimento, ano;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe a sua idade:", "Calculo do ano de nascimento", JOptionPane.INFORMATION_MESSAGE);
        idade = Integer.parseInt(janela);

        janela = JOptionPane.showInputDialog(null, "Informe o ano atual:", "Calculo do ano de nascimento", JOptionPane.INFORMATION_MESSAGE);
        ano = Integer.parseInt(janela);
    
        nascimento = ano - idade;

        JOptionPane.showMessageDialog(null, "Seu ano de nascimento é: " + nascimento , "Ano do nascimento ", JOptionPane.INFORMATION_MESSAGE);
    }
}
