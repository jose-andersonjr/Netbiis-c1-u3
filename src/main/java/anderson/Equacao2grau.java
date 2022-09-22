package anderson;

import javax.swing.*;

public class Equacao2grau {
    public static void main (String[] args){
        int a, b, c;
        double delta, x1, x2;
        a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de c: "));
        delta = b*b - 4*a*c;

        if (delta > 0){
            x1 = -b - (Math.sqrt(delta))/2*a;
            x2 = -b + (Math.sqrt(delta))/2*a;
            JOptionPane.showMessageDialog(null, "O valor de x1 = " + x1 + " e o valor de x2 = " + x2);
        } else if (delta == 0) { // Para delta igual a zero, existe apenas um valor de x (uma única raíza real)
            var x = -b/2*a;
            JOptionPane.showMessageDialog(null, "A equação possui apenas uma raíz real, sendo ela x = " + x);
        }else {
            JOptionPane.showMessageDialog(null, "O delta é menor que 0, portanto, não existem raízes reais");
        }

    }

}
