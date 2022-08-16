package Atividade4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pc p = new pc();
		
		boolean v = true;
		int casos=0, a=0, b=0;
		
		String recebe="";
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para setar automaticamente\n2 para adicionar add o Linear e o angular\n3 para verificar o retorno\n4 para sair"));
			
			switch(casos) {
			
			case 1:{
				p.setados();
				break;
			}
			case 2:{
				a = Integer.parseInt(JOptionPane.showInputDialog("Add o ponto Linear"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Add o ponto Linear"));
				
				p.acesso(a, b);
				break;
			}
			case 3:{
				recebe = p.retorna();
				JOptionPane.showMessageDialog(null, recebe);
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
