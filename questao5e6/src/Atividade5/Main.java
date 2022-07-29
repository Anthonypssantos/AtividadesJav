package Atividade5;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vetor vet = new Vetor();
		
		boolean c = true;
		int casos=0;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para iniciar\n2 para sair"));
			
			switch(casos) {
			
			case 1:{
				
				vet.contructor();
				
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
