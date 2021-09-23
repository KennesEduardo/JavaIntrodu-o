import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int idade;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe a idade: ", "Classificação de Nadador", JOptionPane.INFORMATION_MESSAGE);
        idade = Integer.parseInt(janela);        
 
        if(idade < 5) {
            
            JOptionPane.showMessageDialog(null, "Nadador sem categoria", "Menor de 5 anos", JOptionPane.INFORMATION_MESSAGE);

        }else if((idade >= 5) && (idade <= 7)){
            
            JOptionPane.showMessageDialog(null, "Nadador Infantil A", "Idade entre 5-7 anos", JOptionPane.INFORMATION_MESSAGE);

        }else if((idade >= 8) && (idade <= 10)){
            
            JOptionPane.showMessageDialog(null, "Nadador Infantil B", "Idade entre 8-10 anos ", JOptionPane.INFORMATION_MESSAGE);

        }else if((idade >= 11) && (idade <= 13)){

            JOptionPane.showMessageDialog(null, "Nadador Juvenil A", "Idade entre 11-13 anos", JOptionPane.INFORMATION_MESSAGE);
        }else if((idade >= 14) && (idade <= 17)){
            
            JOptionPane.showMessageDialog(null, "Nadador Juvenil B", "Idade entre 14-17 anos", JOptionPane.INFORMATION_MESSAGE);
        }else{

            JOptionPane.showMessageDialog(null, "Nadador Sênior", "Maior de 18 anos", JOptionPane.INFORMATION_MESSAGE);
        }  

    }
}
