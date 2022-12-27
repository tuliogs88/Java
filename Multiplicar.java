import javax.swing.JOptionPane;

public class Multiplicar {
    public static void main(String args[]) {
        
        String valor;
        int n1, n2, n3, resultado;
        
        valor = JOptionPane.showInputDialog("Digite o primeiro número: ");
        n1 = Integer.parseInt(valor);
        valor = JOptionPane.showInputDialog("Digite o segundo número: ");
        n2 = Integer.parseInt(valor);
        valor = JOptionPane.showInputDialog("Digite o terceiro número: ");
        n3 = Integer.parseInt(valor);
        
        resultado = n1 * n2 * n3;
        
        JOptionPane.showMessageDialog(null,"O resultado da multiplicação é " + resultado);
    }
}