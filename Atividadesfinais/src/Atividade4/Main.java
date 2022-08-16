package Atividade4;

import javax.swing.JOptionPane;

import Atividade5.cplanoc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int casos=0;
		
		boolean v = true;
		
		pc p = new pc();
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para add\n2 para ver se é igual ou diferente\n3 para sair"));
			
			switch(casos) {
			
			case 1:{
				int a=0, c=0;
				
				a = Integer.parseInt(JOptionPane.showInputDialog("adicione o numero linear"));
				c = Integer.parseInt(JOptionPane.showInputDialog("adicione o numero angular"));
				
				p.acesso(a, c);
				break;
				}
			case 2:{
				String r;
				
				r = p.retorna();
				
				JOptionPane.showMessageDialog(null, r);
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
