package Atividade5;

import javax.swing.JOptionPane;

public class cplanoc {
	
	int raio=0, ponto=0;
	
	public void addplanocartesiano(int a, int b) {
		
		raio = a;
		ponto = b;
		
	}
	public int retornaraio() {
		return raio;
	}
	public String desinflar(int a, int b, String valida) {
		String envia="";
		
		if(valida.equals("Sim")) {
			
			raio -= a;
			ponto -= b;
			envia="Desinflado";
		}else {
			
			raio += a;
			ponto += b;
			envia="Inflado";
		}
		
		return envia;
	}
	

}
