package anderson;

import javax.swing.*;

public class AvaliacaoNota {
    public static void main (String[] args) {
        var nota = Double.parseDouble(JOptionPane.showInputDialog("Insira uma nota entre 0 e 100: "));
        if ((nota >= 0) && (nota <= 100)) {
            if (nota >= 90) {
                JOptionPane.showMessageDialog(null, "Sua nota foi excelente");
            } else if (nota >= 70) {
                JOptionPane.showMessageDialog(null, "Sua nota foi boa");
            } else if (nota >= 50) {
                JOptionPane.showMessageDialog(null, "Sua nota foi regular");
            } else {
                JOptionPane.showMessageDialog(null, "Sua nota foi insuficiente!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor insira uma nota entre 0 e 100!");
            AvaliacaoNota.main(null); // Rodar o código novamente
        }
    }
}
