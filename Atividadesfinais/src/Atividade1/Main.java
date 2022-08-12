package Atividade1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contador c = new Contador();
		
		String recebeR=" ";
		
		int casos=0, recebe=0;
		
		boolean v = true;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar\n2 retornar\n3 para zerar\n4 para sair"));
			
			
			switch(casos) {
			
			case 1:{
				
				recebe = c.incrementar();
				
				JOptionPane.showMessageDialog(null, recebe);
				
				break;
			}
			
			case 2:{
				
				recebeR = c.retornar(recebe);
				
				JOptionPane.showMessageDialog(null, recebeR);
				
				break;
			}
			case 3:{
				recebe = 0;
				
				c.zerar();
				
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
