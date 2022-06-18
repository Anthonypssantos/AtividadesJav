package Ativiadde14;

import javax.swing.JOptionPane;

public class Main14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1, v2;
		
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Bota um numero entre 100 e 200"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Bota um segundo numero entre 100 e 200"));
		
		if (v1 > v2) {
			
			JOptionPane.showMessageDialog(null, "Maior numero: "+ v1);
			
		}
			
		if (v2 > v1) {
			
			JOptionPane.showMessageDialog(null, "Maior numero: "+ v2);
			
		}
		
	}

}
