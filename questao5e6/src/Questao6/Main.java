package Questao6;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VetorOrdenado vtod = new VetorOrdenado(); 
		
		boolean c = true;
		int casos=0;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para iniciar\n2 para sair"));
			
			switch(casos) {
			
			case 1:{
				
				vtod.contructor();
				
				break;
			}
			
			default:{
				
				c = false;
				
				break;
			}
			
			
			}
			
			
		}while(c == true);
		
	}

}
