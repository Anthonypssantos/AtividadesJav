package Atividade3;

import javax.swing.JOptionPane;

public class Operacao {
	
	public String numero(String n, String n2, String r2) {
		String numero = "";
		
		char[] r = new char[n2.length()];
		

		for (int i=0 ; i < n2.length() ; i++) {
			
			r[i] = n2.charAt(n2.length()-1-i);
			
		}	
		
		for (int i=0; i< 1 ;i++) {
			
			System.out.println(r);	
			System.out.println(n);	
							
		}	
		
		if (n == r) {
			
			JOptionPane.showMessageDialog(null, "Ah permutação entre os numeros");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Não ah permutações");
			
		}
		
		

		return numero;
	}
}
