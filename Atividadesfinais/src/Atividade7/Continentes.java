package Atividade7;

import javax.swing.JOptionPane;

public class Continentes {

	
	/*
	 add paises
	 retornar dimensao do continente 
	 retornar a densidade do continente
	 retornar o maior pais
	 retornar o menor pais
	 retornar o pais com mais dencidade  
	 
	 String populacao=" ";
		
	 */
	//1
	public void Continent(String name) {
		popul(name);
	}
	//2
	public void popul(String name) {
		
		String populacao="";
		
		if(name == "Europa") {
			
			populacao = "7.000.000";
			JOptionPane.showMessageDialog(null, "Abitantes: "+populacao);		
			dimensao(name);
		}else if(name == "Australia") {
			
			populacao = "2.000.000";
			JOptionPane.showMessageDialog(null, "Abitantes: "+populacao);
			dimensao(name);
		}else if(name =="América") {
			
			populacao = "14.000.000";
			JOptionPane.showMessageDialog(null, "Abitantes: "+populacao);
			dimensao(name);
		}else {
			
			populacao = "Continente inxesistente";
			JOptionPane.showMessageDialog(null, "Abitantes: "+populacao);
			return;
		}
		
	}
	
	public void dimensao(String name) {
		String dim="";
		
		if(name == "Europa") {
			
			dim = "km² 123.321.000";
			JOptionPane.showMessageDialog(null, "Dimensão: "+dim);		
			maiorp(name);
		}else if(name == "Australia") {
			
			dim = "km² 400.200.000";
			JOptionPane.showMessageDialog(null, "Dimensão: "+dim);
			maiorp(name);
		}else if(name == "América") {
			
			dim = "km² 600.100.000";
			JOptionPane.showMessageDialog(null, "Dimensão: "+dim);
			maiorp(name);
		}else {
			
			dim = "Continente inxesistente";
			JOptionPane.showMessageDialog(null, dim);
			
		}
		
	}
	
	public void maiorp(String name) {
		
		if(name == "Europa") {
			
			JOptionPane.showMessageDialog(null, "Congo");
			menorp(name);
		}else if(name == "Australia") {
			
			JOptionPane.showMessageDialog(null, "Manguiço");
			menorp(name);
		}else if(name =="América") {
			
			JOptionPane.showMessageDialog(null, "Canada");
			menorp(name);
		}
		
		
	}
	public void menorp(String name) {	
		
		if(name == "Europa") {
			
			JOptionPane.showMessageDialog(null, "Volante");
			maiordens(name);
		}else if(name == "Australia") {
			
			JOptionPane.showMessageDialog(null, "Coból");
			maiordens(name);
		}else if(name =="América") {
			
			JOptionPane.showMessageDialog(null, "Veloz");
			maiordens(name);
		}

	}
	public void maiordens(String name) {
		
		if(name == "Europa") {
			
			JOptionPane.showMessageDialog(null, "Volante");
		
		}else if(name == "Australia") {
			
			JOptionPane.showMessageDialog(null, "Manguiço");
			
		}else if(name =="América") {
			
			JOptionPane.showMessageDialog(null, "Canada");
			
		}
	
	}

}