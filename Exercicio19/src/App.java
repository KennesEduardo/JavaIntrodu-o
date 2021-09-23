import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int x;
        int y;
        int z;
        int opc;
        double resultado;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe X: ", "Medias ", JOptionPane.INFORMATION_MESSAGE);
        x = Integer.parseInt(janela);

        janela = JOptionPane.showInputDialog(null, "Informe Y: ", "Medias ", JOptionPane.INFORMATION_MESSAGE);
        y = Integer.parseInt(janela);

        janela = JOptionPane.showInputDialog(null, "Informe Z: ", "Medias ", JOptionPane.INFORMATION_MESSAGE);
        z = Integer.parseInt(janela);

        janela = JOptionPane.showInputDialog(null, "Informe a opção desejada: " + "\n" + "|1| Para selecionar Média Geométrica" + "\n" + "|2| Para selecionar Média Ponderada" + "\n" + "|3| para Selecionar Média Aritmética", "Medias ", JOptionPane.INFORMATION_MESSAGE);
        opc = Integer.parseInt(janela);

        switch(opc){
            case 1:

                resultado = x*y*z;
                JOptionPane.showMessageDialog(null, "Média Geométrica: " + resultado, "Media Geometrica", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 2:

                resultado = (x + (2 * y)+(3*z)) / 6;
                JOptionPane.showMessageDialog(null, "Média Ponderada: " + resultado, "Media Ponderada", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 3:

                resultado = (x+y+z)/3;
                JOptionPane.showMessageDialog(null, "Média Aritmética: " + resultado, "Media Aritmética", JOptionPane.INFORMATION_MESSAGE);
            break;

        

        } 

    }
}
