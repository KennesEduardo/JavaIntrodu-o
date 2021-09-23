import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        float soma, soma2;
        float subtracao, subtracao2;
        float multiplicacao, multiplicacao2;
        float dividir, dividir2;
        float resultado;
        String janela;
        String opcao;
        
        janela = JOptionPane.showInputDialog(null, "Escolha a Operação desejada: " + "\n" +  "\n" + "|A| para Somar" + "\n" + "\n" +  "|B| para subtrair"+ "\n" + "\n" +  "|C| para Multiplicação"+ "\n" + "\n" +  "|D| para Dividir", "Calculadora" , JOptionPane.INFORMATION_MESSAGE);
            
        switch (janela){
            case "A" :
                
            opcao = JOptionPane.showInputDialog(null, "Soma escolhida" + "\n"+ "\n" + "Informe o primeiro Número", "Soma", JOptionPane.INFORMATION_MESSAGE);
            soma = Float.parseFloat(opcao);

            opcao = JOptionPane.showInputDialog(null, "Informe o Segundo Número", "Soma", JOptionPane.INFORMATION_MESSAGE);
            soma2 = Float.parseFloat(opcao);

            resultado = (soma + soma2);

            JOptionPane.showMessageDialog(null, "Resulado da soma: " + resultado, "Resultado da soma", JOptionPane.INFORMATION_MESSAGE);
            break;            
                

            case "B" :
                
            opcao = JOptionPane.showInputDialog(null, "Subtração escolhida" + "\n"+ "\n" + "Informe o primeiro Número", "Subtração", JOptionPane.INFORMATION_MESSAGE);
            subtracao = Float.parseFloat(opcao);

            opcao = JOptionPane.showInputDialog(null, "Informe o Segundo Número", "Subtração", JOptionPane.INFORMATION_MESSAGE);
            subtracao2 = Float.parseFloat(opcao);

            resultado = (subtracao - subtracao2);

            JOptionPane.showMessageDialog(null, "Resulado da subtração: " + resultado, "Resultado da subtração", JOptionPane.INFORMATION_MESSAGE);
            break;            

            case "C": 
                
            opcao = JOptionPane.showInputDialog(null, "Multiplicação escolhida" + "\n"+ "\n" + "Informe o primeiro Número", "Multiplicação", JOptionPane.INFORMATION_MESSAGE);
            multiplicacao = Float.parseFloat(opcao);

            opcao = JOptionPane.showInputDialog(null, "Informe o Segundo Número", "Multiplicação", JOptionPane.INFORMATION_MESSAGE);
            multiplicacao2 = Float.parseFloat(opcao);

            resultado = (multiplicacao * multiplicacao2);

            JOptionPane.showMessageDialog(null, "Resulado da Multiplicação: " + resultado, "Resuldado da Multiplicação", JOptionPane.INFORMATION_MESSAGE);
            break;
          
            case "D" :
                
            opcao = JOptionPane.showInputDialog(null, "DIvisão escolhida" + "\n"+ "\n" + "Informe o primeiro Número", "Divisão", JOptionPane.INFORMATION_MESSAGE);
            dividir = Float.parseFloat(opcao);

            opcao = JOptionPane.showInputDialog(null, "Informe o Segundo Número", "Divisão", JOptionPane.INFORMATION_MESSAGE);
            dividir2 = Float.parseFloat(opcao);

            resultado = (dividir / dividir2);

            JOptionPane.showMessageDialog(null, "Resulado da Divisão: " + resultado, "Resultado da Divisão", JOptionPane.INFORMATION_MESSAGE);

            break;
        }        
    }
}
