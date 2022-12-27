import javax.swing.JOptionPane;

public class Nota{

    public static void main(String args[]){
        float nota1, nota2, nota3, resultado;
        String dado;

        JOptionPane.showMessageDialog(null, "As notas devem ser preenchidas assim: Exemplo 9.0");

        dado = JOptionPane.showInputDialog("Digite a primeira nota");
        nota1 = Float.parseFloat(dado);

        dado = JOptionPane.showInputDialog("Digite a segunda nota");
        nota2 = Float.parseFloat(dado);

        dado = JOptionPane.showInputDialog("Digite a terceira nota");
        nota3 = Float.parseFloat(dado);

        resultado = (nota1 + nota2 + nota3) / 3;

        if (resultado >= 6){
            JOptionPane.showMessageDialog(null,"A média do aluno é: " + resultado + " Está Aprovado!");
        } else {
            JOptionPane.showMessageDialog(null,"A média do aluno é: " + resultado + " Está Reprovado!");
        }
    }
}