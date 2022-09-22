package anderson;

import javax.swing.*;

public class CaixaEletronico {
    public static void main(String[] args){
        double notas100, notas50, notas10;
        int resto;
        var saque = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor que você deseja sacar: "));
        if (saque % 10 == 0){
            notas100 = Math.floor(saque/100);
            resto = saque % 100;
            notas50 = Math.floor(resto/50);
            resto = resto % 50;
            notas10 = Math.floor(resto/10);
            resto = resto % 10;

            if (notas100 > 0){
                JOptionPane.showMessageDialog(null, "O número de notas de 100 é: " + notas100);
            }
            if (notas50 > 0){
                JOptionPane.showMessageDialog(null, "O número de notas de 50 é: " + notas50);
            }
            if (notas10 > 0){
                JOptionPane.showMessageDialog(null, "O número de notas de 10 é: " + notas10);
            }

        }else{
            JOptionPane.showMessageDialog(null, "Não é possível sacar esse valor, por favor insira um valor multiplo de 10!");
            CaixaEletronico.main(null);
        }
    }
}
