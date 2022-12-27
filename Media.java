import javax.swing.JOptionPane;

public class Media {
    public static void main(String args[]) {
        float nota1, nota2, media;
        String dado;

        dado = JOptionPane.showInputDialog("Digite a primeira nota");
        nota1 = Float.parseFloat(dado);

        dado = JOptionPane.showInputDialog("Digite a segunda nota");
        nota2 = Float.parseFloat(dado);

        media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);
    }
}