package Atividade15;

import javax.swing.JOptionPane;

public class Main15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1;
		
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Coloca um numero entre 100 e 200"));
		
		if (v1 < 100 || v1 > 200) {
			
			JOptionPane.showMessageDialog(null, "Numero invalido!");
			
		}else {
			

			JOptionPane.showMessageDialog(null, "Entre 100 e 200!");
			
		}
		
		
		
	}

}
