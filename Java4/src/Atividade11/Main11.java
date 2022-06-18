package Atividade11;

import javax.swing.JOptionPane;

public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v, r=0, ac;
		
		v = Integer.parseInt(JOptionPane.showInputDialog("Insire um valor inteiro!"));
		
		if (v >= 1000 && v <= 2000) {
			
			r = v + 500; 
			
		}
		
		if (v > 2000) {
			
			r = v + 400;
			
		}
		
		if (v < 1000) {
			
			JOptionPane.showMessageDialog(null, "Valor atual: "+ v);
			
		}
		
		
	}

}
