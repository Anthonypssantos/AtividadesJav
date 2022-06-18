package Atividade19;

import javax.swing.JOptionPane;

public class Main19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] M = new String[28];
		String[] F = new String[28];
		
		int n=0, a=0;
		
		for (int i=0; i< 28; i++) {
			
			
			a++;
			M[i] = JOptionPane.showInputDialog("Coloque nomes masculinos");
		
		}
		
		for (int h=0; h < 28; h++) {
			
			n++;
			F[h] = JOptionPane.showInputDialog("Coloque nomes femininos");
			
		}
		
		JOptionPane.showMessageDialog(null, "Existem "+ a +" Homens"+"\nExistem "+n+" Mulheres");
				
	}

}
