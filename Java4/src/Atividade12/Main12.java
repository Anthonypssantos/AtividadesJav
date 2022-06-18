package Atividade12;

import javax.swing.JOptionPane;

public class Main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cf, c, p=0.50, r;
		
		c = Double.parseDouble(JOptionPane.showInputDialog("Insire o valor do carro com '.'"));

		cf = Double.parseDouble(JOptionPane.showInputDialog("Insire o valor de fabrica com '.'"));
		
		r = (c + cf  * 0.70);
		
		JOptionPane.showMessageDialog(null, "Carro: "+ r);
		
	}

}
