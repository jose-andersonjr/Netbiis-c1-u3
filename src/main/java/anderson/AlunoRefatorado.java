package anderson;

import javax.swing.*;

public class AlunoRefatorado {
    public static void main(String[] args){
        final double numero_avaliacoes = 4;
        double nota1, nota2, nota3, nota4;
        var frequencia = Integer.parseInt(JOptionPane.showInputDialog("Insira a porcentagem de frequencia do aluno: "));
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 3: "));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 4: "));
        double media = (nota1 + nota2 + nota3 + nota4)/numero_avaliacoes;
        JOptionPane.showMessageDialog(null, "A média final das notas é: " + media);

        if ((media >= 5) && (frequencia >= 75)){
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado!");
        }else if ((media < 5) && (frequencia < 75)){
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado por nota insuficiente e por faltas!!!");
        } else if (media < 5){
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado por não alcançar a média!!!");
        } else {
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado por falta!!!");
        }
    }
}
