package Atividade7;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Continentes c = new Continentes();
		
		boolean v = true;
		
		String name="";
		
		int casos=0;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para add o nome do pais\n2 para sair")); 
			
			switch(casos) {
			
			case 1:{
				name = JOptionPane.showInputDialog("Escolha entre Europa, Australia, América\nDigite exatamente igual como os nome citados a cima");
				c.Continent(name);
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
