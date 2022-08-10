package prova;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prova p = new Prova();
		
		Random aleatorio = new Random();
		
		int casos = 0, acertos=0, recebeenvia=0, n=0, f=0;
		
		boolean v = true;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar o aluno\n2 para começar a prova\n3 para ver o gabarito\n4 para sair"));
			
			switch(casos) {
			
			case 1:{
				
				f = p.aluno();
				
				break;
				}
			
			case 2:{	
					
			for(int i = 0; i < 15; i++) {
				
			recebeenvia	= aleatorio.nextInt(15);
				
			}
				n++;		
			acertos = p.prov(recebeenvia, n, f);
				
				break;
				}
			
			case 3:{
				
				p.acertos(acertos);
				
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
