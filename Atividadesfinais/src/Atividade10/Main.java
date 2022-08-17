package Atividade10;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Matrizmatematica matrmat = new Matrizmatematica();
		
		int casos=0;
		
		boolean v = true;
	
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para iniciar\n2 para sair"));
			
			switch(casos) {
			
			case 1:{
				
				
				break;
			}
			
			default:{
				v = false;
				break;
				}
			
			}
			
		}while(v == true);
		
	}

}