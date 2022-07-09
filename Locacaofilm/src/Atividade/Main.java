package Atividade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] alocado = new String[5];
		Operacao op = new Operacao();
		boolean c1 = true;
		int casos, p=0, Desconts=0;
		String[] nome = new String[3];
		String[] infantis = new String[3];
		String[] lancamento = new String[3];
		
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para filmes lançamento\n2 para filmes com promoção\n3 filmes infantis\n4 para sair"));
			
			switch(casos) {
			
			case 1:{
				
				op.lancamento(nome, p);
				
				break;
			}
			case 2:{
				
				op.promos(Desconts, nome);
				
				break;
			}
			case 3:{
				
				op.infantil(nome, p);
				
				break;
			}
			
			default:{
				c1 = false;
				break;
			}
			
		}
			
		}while(c1 == true);
		
	}

}
