import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um segundo número: "));
        int contas;
        contas = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você deseja?" + "\n 1- adição" + "\n 2 - subtração" + "\n 3 - multiplicação" + "\n 4 - divisão"));
        int resultado;
        double resultadodiv;

        switch(contas){
            case 1:
                resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "O resultado é:" + resultado);
            break;
            case 2:
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "O resultado é:" + resultado);
            break;
            case 3:
                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "O resultado é:" + resultado);
            break;
            case 4:
                resultadodiv = n1 / n2;
                JOptionPane.showMessageDialog(null, "O resultado é:" + resultadodiv);
            break;
        }
    }
}
