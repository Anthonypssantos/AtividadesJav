package prova;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Gaarito {
	
	private Double recebe;
	
	Double envia=0.0, compara=0.0;
	
	ArrayList<Double> notas = new ArrayList<>();
	
	public Double getRecebe() {
		
		for(int i = 0; i < notas.size(); i++) {
			compara = notas.get(i);
			
			if(compara == notas.get(i)) {
				
				envia = compara;
				
			}else {
				
				compara = 0.0;
				
			}
			
		}
		
		return envia;
	}

	public void setRecebe(Double recebe) {
		this.recebe = recebe;
		
		notas.add(recebe);
	}
	
}
