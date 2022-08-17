package Atividade2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*Add, acesso, movimentar, comparar, representação, calcular a distancia, um clone*/
			
		Ponto2D p2d = new Ponto2D();
		
		boolean v = true;
		int casos=0;
		String recebe=" ";
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar os pontos\n 2 para ver o acesso\n3 para ver a movimentar\n4 para comparar\n5 para clonar\n6 para sair"));
			
			switch(casos) {
			
			case 1:{
				
				p2d.add();
				
				break;
			}
			case 2:{
				
				p2d.acesso();
				
			break;
			}
			case 3:{
				
				recebe = p2d.movimentos();
				
				break;
			}
			case 4:{
				
				p2d.comparaerepresentacao();
				
				break;
			}
			case 5:{
				
				p2d.clonar();
				
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