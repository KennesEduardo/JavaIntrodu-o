import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        double homem;
        double mulher;
        String janela;
    
        janela = JOptionPane.showInputDialog(null, "Informe seu sexo: "+ "\n"+ "|M| para sexo MASCULINO" + "\n" + "|F| parasexo FEMININO ", "Peso ideal", JOptionPane.INFORMATION_MESSAGE);
        
        switch (janela){
        
            case "M":
                janela = JOptionPane.showInputDialog(null, "Informe sua altura", "Peso", JOptionPane.INFORMATION_MESSAGE);
                homem = Double.parseDouble(janela);
    
                homem = (72.2 * homem) - 58;
    
                JOptionPane.showMessageDialog(null, "Peso ideal:" + homem, "Peso", JOptionPane.INFORMATION_MESSAGE);
                break;
                    
            case "F": 
                janela = JOptionPane.showInputDialog(null, "Informe sua altura", "Peso", JOptionPane.INFORMATION_MESSAGE);
                mulher = Double.parseDouble(janela);
    
                mulher = (62.1 * mulher) - 44.7;
    
                JOptionPane.showMessageDialog(null, "Peso ideal:" + mulher, "Peso", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
    }
}
