package Atividade9;

import javax.swing.JOptionPane;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double grana, r;
		
		grana = Double.parseDouble(JOptionPane.showInputDialog("Insire um valor em reais"));
		
		r = (grana * 0.70);
		
		JOptionPane.showMessageDialog(null, "Seu redimento após um mês: "+ r + "a. m.");
	}

}
