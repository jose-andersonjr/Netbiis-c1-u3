package anderson;

import javax.swing.*;

public class Numero {
    public static void main(String[] args){
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        var resto = numero%2;
        if (resto == 0){
            JOptionPane.showMessageDialog(null, "O número inserido é par! ");
        }else{
            JOptionPane.showMessageDialog(null, "O número inserido é ímpar!");
        }

    }

}
