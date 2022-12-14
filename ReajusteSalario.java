import javax.swing.JOptionPane; //Importação do metodo JOptionPane

public class ReajusteSalario{

    public static void main (String args[]) {
        Double novo_valor; //Variavel para receber o novo valor do salario

        String nome = JOptionPane.showInputDialog("Informe seu nome: ");

        String dado = JOptionPane.showInputDialog("Informe seu salario: --Sem o ponto Ex: 0000--");
        Double valor = Double.parseDouble(dado);

        if (valor <= 2000){
            novo_valor = valor * 0.5;
            JOptionPane.showMessageDialog(null, "O seu novo salario é: " + novo_valor);
        } else if (valor > 2000 && valor <= 5000){
            novo_valor = valor * 0.2;
            JOptionPane.showMessageDialog(null, "O seu novo salario é: " + novo_valor);
        } else if (valor > 5000){
            novo_valor = valor * 0.1;
            JOptionPane.showMessageDialog(null, "O seu novo salario é: " + novo_valor);
        } else {
            JOptionPane.showMessageDialog(null, "O seu salario é: " + valor);
        }
    }
}