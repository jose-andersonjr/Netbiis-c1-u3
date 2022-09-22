package anderson;

import javax.swing.*;

public class PesoIdeal {
    public static void main(String[] args){
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a sua altura: "));
        String sexo = JOptionPane.showInputDialog("Qual o seu sexo? M ou F: ");
        if (sexo.equalsIgnoreCase("M")){
            var pesoIdeal = (72.7*altura)-58;
            JOptionPane.showMessageDialog(null, "O peso ideal relativo a altura para o sexo masculino é " + pesoIdeal + "kg");
        }else{
            var pesoIdeal = (62.1*altura)-44.7;
            JOptionPane.showMessageDialog(null, "O peso ideal relativo a altura para o sexo feminino é " + pesoIdeal + "kg");
        }
    }
}
