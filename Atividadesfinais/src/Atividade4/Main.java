package Atividade4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		representaax r = new representaax();
		
		boolean v = true;
		
		int casos=0;
		String nome=" ";
		
		do {	
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para ver a dimensão de um pais setado"));
			
			switch(casos){
				
			case 1:{
				
			nome = JOptionPane.showInputDialog("Escolha 1 dos paises\nBrasil\nChina\nBragantins\nFaleza\nFaleza\nBaiania\nCloro\nValuzes\nLampada\nThortinha");
			
			r.construtor(nome);
				
			break;
			}
				
			}
			
		}while(v == true);
		
	}

}
