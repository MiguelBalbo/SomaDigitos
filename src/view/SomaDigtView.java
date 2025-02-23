package view;
import javax.swing.JOptionPane;
import controller.SomaDigtCtrl;

public class SomaDigtView {
	public static void main (String args[]) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		int total = SomaDigtCtrl.Soma(n, 0);
		JOptionPane.showMessageDialog(null, "O resultado da soma é de: " + total);
	}
}
