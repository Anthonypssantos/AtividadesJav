package Atividade5;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cplanoc cpc = new cplanoc();
		boolean v = true;
		int casos=0, a=0, b=0;
		String recebe="", envia="";
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para add o ponto e o raio\n2 para retornar o raio\n3 para inflar ou desinflar\n4 para sair"));
			
			switch(casos) {
			
			case 1:{
				a = Integer.parseInt(JOptionPane.showInputDialog("Add o raio"));
				b =	Integer.parseInt(JOptionPane.showInputDialog("Add o ponto"));
				cpc.addplanocartesiano(a, b);
				break;
				}
			case 2:{
				a = cpc.retornaraio();
				JOptionPane.showMessageDialog(null, "Raio: "+a);
				break;
				}
			case 3:{
				a = Integer.parseInt(JOptionPane.showInputDialog("add um numero para inflar ou desinflar do raio"));
				b = Integer.parseInt(JOptionPane.showInputDialog("add um numero para inflar ou desinflar do ponto"));
				envia = JOptionPane.showInputDialog("Sim para desinflar\nNão para inflar");
				recebe = cpc.desinflar(a, b, envia);
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
