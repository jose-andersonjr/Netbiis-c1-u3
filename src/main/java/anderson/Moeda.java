package anderson;

import javax.swing.*;

public class Moeda {
    public static void main(String[] args){
        double valor, valor_convertido;
        int tipo_moeda;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor a ser convertido "));
        tipo_moeda = Integer.parseInt(JOptionPane.showInputDialog("Tipo de moeda [1-Libra][2-Dólar][3-Euro]"));

/*        switch (tipo_moeda){
            case 1:
            {
                valor_convertido = valor/5;
                JOptionPane.showMessageDialog(null, "O valor convertido em Libras é: "+ valor_convertido);
                break;
            }
            case 2:
            {
                valor_convertido = valor/4;
                JOptionPane.showMessageDialog(null, "O valor convertido em Dólar é: "+ valor_convertido);
                break;
            }
            case 3:
            {
                valor_convertido = valor/4.4;
                JOptionPane.showMessageDialog(null, "O valor convertido em Euro é: "+ valor_convertido);
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "Opção incorreta digitada");
        }*/
        JOptionPane.showMessageDialog(null, "O valor após a conversão é " + switch(tipo_moeda)
        {
            case 1 -> valor_convertido = valor/6.92;
            case 2 -> valor_convertido = valor/5.2;
            case 3 -> valor_convertido = valor/5.1;
            default -> "Opção incorreta! Tente um número válido!";
        });

    }
}




