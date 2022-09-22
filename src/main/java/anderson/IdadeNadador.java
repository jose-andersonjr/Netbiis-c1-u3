package anderson;

import javax.swing.*;

public class IdadeNadador {
    public static void main (String[] args) {
        var idade = Integer.parseInt(JOptionPane.showInputDialog("A idade do nadador: "));
        if (idade > 0) {
            if (idade >= 18) {
                JOptionPane.showMessageDialog(null, "O nadador pertence a categoria Adulto");
            } else if (idade >= 14) {
                JOptionPane.showMessageDialog(null, "O nadador pertence a categoria Juvenil B");
            } else if (idade >= 12) {
                JOptionPane.showMessageDialog(null, "O nadador pertence a categoria Juvenil A");
            } else if (idade >= 9) {
                JOptionPane.showMessageDialog(null, "O nadador pertence a categoria Infantil C");
            } else if (idade >= 6){
                JOptionPane.showMessageDialog(null, "O nadador pertence a categoria Infantil B");
            }else{
                JOptionPane.showMessageDialog(null, "O nadador pertence a categoria Infantil A");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor insira uma idade maior que 0!");
            AvaliacaoNota.main(null); // Rodar o código novamente
        }
    }
}
