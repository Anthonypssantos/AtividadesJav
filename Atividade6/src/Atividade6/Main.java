package Atividade6;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pais p = new pais();
		
		boolean v = true;
		
		int casos=0;
		
		String recebe="";
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 adicionar um pais\n2 mostrar o pais escolhido\n3 verificar\n4 para mostrar a densidade populacional\n5 sair"));
			
			switch(casos) {
			
			case 1:{
				recebe = p.iso();
				break;
			}
			case 2:{
				JOptionPane.showMessageDialog(null, "Pais escolhido: "+recebe);
				break;
			}
			case 3:{
				p.verifica(recebe);
				break;
			}
			case 4:{
				recebe = p.denspopul();
				JOptionPane.showMessageDialog(null, "Densidade populacional: "+recebe);
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
