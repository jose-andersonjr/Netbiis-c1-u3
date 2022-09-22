package anderson;

import javax.swing.*;

public class RaizExata {
    public static void main (String[] args){
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        var raiz = Math.sqrt(numero);
        var raiz_exata = Math.round(raiz);
        if (raiz == raiz_exata){
            JOptionPane.showMessageDialog(null, "A raiz exata do número é " + raiz);
        }else{
            JOptionPane.showMessageDialog(null, "O número inserido não possui raiz exata");
        }
    }
}
