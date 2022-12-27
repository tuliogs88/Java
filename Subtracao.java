import javax.swing.JOptionPane;

public class Subtracao{

    public static void main(String args[]){
        int valor1, valor2, resultado;
        String dado;

        dado = JOptionPane.showInputDialog("Digite o primeiro valor");
        valor1 = Integer.parseInt(dado);

        dado = JOptionPane.showInputDialog("Digite o segundo valor");
        valor2 = Integer.parseInt(dado);

        resultado = valor1 - valor2;
        JOptionPane.showMessageDialog(null, "O Resultado da Subtração eh: + resultado ");
    }    
}
