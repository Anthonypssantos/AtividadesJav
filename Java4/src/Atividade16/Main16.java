package Atividade16;

import javax.swing.JOptionPane;

public class Main16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] n = new double[3];
		double[] r = new double[1];
		double[] r2 = new double[1];
		
		for (int i=0; i < 3; i++) {
			
			n[i] = Double.parseDouble(JOptionPane.showInputDialog("Coloca nota com '.' "));
			
		}
		
		r[0] = n[0] + n[1] + n[2];
		
		r2[0] = (r[0] / 3);
		
		if (r2[0] <= 5.0 || r2[0] <= 5.1 || r2[0] <= 6.9) {
			
			JOptionPane.showMessageDialog(null, "Reprovado");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Aprovado");
			
		}

	}
}