import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {

        int numero1, numero2, numero3, resultado;
        String janela;
    
        janela = JOptionPane.showInputDialog(null,"Informe o Primeiro Número:", "Soma de 3 numeros", JOptionPane.INFORMATION_MESSAGE);
        numero1 = Integer.parseInt(janela);
    
        janela = JOptionPane.showInputDialog(null,"Informe o Segundo Número:", "Soma de 3 numeros", JOptionPane.INFORMATION_MESSAGE);
        numero2 = Integer.parseInt(janela);
        
        janela = JOptionPane.showInputDialog(null,"Informe o terceiroNúmero", "Soma de 3 numeros", JOptionPane.INFORMATION_MESSAGE);
        numero3 = Integer.parseInt(janela);
    
        resultado = numero1 + numero2 + numero3;
    
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado , "Resultado!" , JOptionPane.INFORMATION_MESSAGE);
        
    
        
    }
}
