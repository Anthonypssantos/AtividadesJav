package Atividade10;

import javax.swing.JOptionPane;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v, r, i;
		
		v = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro"));
		
		r = v / 5;
		
		for (i=0 ; i<5 ; i++) {
			
			System.out.println("prestações em "+ r);
			
		}
		
	}

}
