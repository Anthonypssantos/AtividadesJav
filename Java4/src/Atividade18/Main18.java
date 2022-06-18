package Atividade18;

import javax.swing.JOptionPane;

public class Main18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idd, r, maior=0, menor=0;
		
		for (int i = 0; i < 75; i++) {
			
			idd = Integer.parseInt(JOptionPane.showInputDialog("infrome idades lembrando que adulto e maior que 18"));
			
			r = idd;
			
			if (r > idd) {
				
				maior = r;
				
			}
			
			if (r < idd) {
				
				menor = r;
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Maior idade: "+ maior +"Menor idade"+ menor);
	
	}

}
