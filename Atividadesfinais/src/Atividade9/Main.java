package Atividade9;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arraygordo arr = new arraygordo();
		
		boolean v = true;
		
		int casos=0;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para add os elementos no conjunto\n2 para comparar\n3 para sair"));
			
			switch(casos) {
			
			case 1:{
				arr.pegaString();
				break;
			}
			
			case 2:{
				arr.compara();
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
