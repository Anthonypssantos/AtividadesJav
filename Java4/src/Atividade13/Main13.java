package Atividade13;

import javax.swing.JOptionPane;

public class Main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Insire um numero maior que 0 KKKKKKKK"));
		
		if (n >= 0 && n <= 10) {
			
			JOptionPane.showMessageDialog(null, "Numero maior que 10"+ n);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Toma: "+ n + " Bonk");
			
		}
		
	}

}
