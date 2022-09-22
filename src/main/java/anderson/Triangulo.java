package anderson;

import javax.swing.*;

public class Triangulo {
    public static void main (String[] args){
        var a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do lado A do triângulo: "));
        var b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do lado B do triângulo: "));
        var c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do lado C do triângulo: "));
        if ((a+b>c)&&(a+c>b)&&(b+c>a)){
            JOptionPane.showMessageDialog(null, "Os valores inseridos são válidos!");
            if ((a == b) && (b == c)) {
                JOptionPane.showMessageDialog(null, "O triângulo inserido é equilátero");
            }else if ((a == b) || (b == c) || (c == a)){
                JOptionPane.showMessageDialog(null, "O triângulo inserido é Isósceles");
            }else{
                JOptionPane.showMessageDialog(null, "O triângulo inserido é escaleno");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Os valores inseridos não são válidos para um triângulo!");
            Triangulo.main(null);
        }
    }
}
