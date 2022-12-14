import javax.swing.JOptionPane;

int num_1 num_2;
String dado;

dado = JOptionPane.showInputDialog("Digite um número");
num_1 = Integer.parseInt(dado);

dado = JOptionPane.showInputDialog("Digite um número");
num_2 = Integer.parseInt(dado);

if (num_1 == num_2){
    JOptionPane.showMessageDialog("Os números "+ num_1 + "e" + num_2 + "são iguais");
} else {
    if (num_1 > num_2) {
        JOptionPane.showMessageDialog("Os números na ordem "+ num_1 + "e" + num_2);
    } else {
        JOptionPane.showMessageDialog("Os números na ordem "+ num_2 + "e" + num_1);
    }
}