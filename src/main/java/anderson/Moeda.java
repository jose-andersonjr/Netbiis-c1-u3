package anderson;

import javax.swing.*;

public class Moeda {
    public static void main(String[] args){
        double valor, valor_convetido;
        int tipo_moeda;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor a ser convertido "));
        tipo_moeda = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o tipo de moeda [1-Libra][2-Dólar][3-Euro] "));

        switch (tipo_moeda){
            case 1:
            {
                valor_convetido = valor/5;
                JOptionPane.showMessageDialog(null, "O valor convertido em Libras é: "+ valor_convetido);
                break;
            }
            case 2:
            {
                valor_convetido = valor/4;
                JOptionPane.showMessageDialog(null, "O valor convertido em Dólar é: "+ valor_convetido);
                break;
            }
            case 3:
            {
                valor_convetido = valor/4.4;
                JOptionPane.showMessageDialog(null, "O valor convertido em Euro é: "+ valor_convetido);
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "Opção incorreta digitada");
        }

    }
}




