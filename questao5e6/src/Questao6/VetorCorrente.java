package Questao6;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class VetorCorrente {
	
	ArrayList<String> nome = new ArrayList();
	
	public ArrayList<String> getVet2() {
		return nome;
		
	}

	public void setVet2(ArrayList<String> vet2) {		
		
			nome = vet2;
			
			
			merge2();
	}
		
	public void merge2() {	
		
		for(int i = 0; i < 1; i++) {
			String h="";
			
			h = JOptionPane.showInputDialog("Coloque '+' 5 Strings");

			nome.add(h);
			
		}
		
	}
		
}
