import javax.swing.JOptionPane;

public class MediaPonderada {
    public static void main (String args[]) {
        Float nota1, nota2, media;
        String dado;

        dado = JOptionPane.showInputDialog("Digite a primeira nota");
        nota1 = Float.parseFloat(dado);

        dado = JOptionPane.showInputDialog("Digite a segunda nota");
        nota2 = Float.parseFloat(dado);

        media = ((nota1 * 2) + (nota2 * 3)) / (2 + 3);

        JOptionPane.showMessageDialog(null, "A média ponderada do aluno é " + media);
    }
}