package anderson;

import javax.swing.*;

public class CaixaEletronico {
    public static void main(String[] args){
        double notas100, notas50, notas20, notas10, proximo_maior, proximo_menor;
        int resto;
        var saque = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor que você deseja sacar: "));
        if ((saque % 10 == 0) && (saque > 0)){
            notas100 = Math.floor(saque/100);
            resto = saque % 100;
            notas50 = Math.floor(resto/50);
            resto = resto % 50;
            notas20 = Math.floor(resto/20);
            resto = resto % 10;
            notas10 = Math.floor(resto/10);
            resto = resto % 10;

            if (notas100 > 0){
                JOptionPane.showMessageDialog(null, "O número de notas de 100 é: " + notas100);
            }
            if (notas50 > 0){
                JOptionPane.showMessageDialog(null, "O número de notas de 50 é: " + notas50);
            }
            if (notas20 > 0){
                JOptionPane.showMessageDialog(null, "O número de notas de 20 é: " + notas20);
            }
            if (notas10 > 0){
                JOptionPane.showMessageDialog(null, "O número de notas de 10 é: " + notas10);
            }

        }else{
            proximo_menor = saque - (saque%10);
            proximo_maior = proximo_menor + 10;
            JOptionPane.showMessageDialog(null, "Não é possível sacar esse valor, por favor insira um valor multiplo de 10 como " + proximo_menor + " ou " + proximo_maior);
            CaixaEletronico.main(null);
        }
    }
}
