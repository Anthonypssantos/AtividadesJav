package Atividade4;

import javax.swing.JOptionPane;

public class pc {
	
	int ax, b, y;
	String recebe="";
	
	public void setados() {
		ax=4;
		b=4; 
		y=8;	
	}
	public void acesso(int a, int c) {
		
		JOptionPane.showMessageDialog(null, "Linear: "+ a+" Angular: "+ c);
		
		compara(a,c);
	}
	public void compara(int a, int c) {
		
		if(a == ax && c == b) {
			
			recebe = "iguais";
			
			
		}else {
			
			recebe = null;
			
		}
		
	}
	public String retorna() {
		return recebe;
	}
	
	
}
