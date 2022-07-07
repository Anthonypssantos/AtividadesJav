package AtividadeUniv;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacao op = new Operacao();
		String nome, nuniv;
		boolean c1 = true;
		int casos=0, Univ=0;
		
		nome = JOptionPane.showInputDialog("Coloque seu nome");
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para universidade de Einsten\n2 para universidade Isaac\n3 para ver os dados de Einsten \n4 para ver os dados de Isaac\n5 para sair"));
			
			switch(casos) {
			
			case 1:{
				
				Univ = 1;
				nuniv = "Princeton";
				op.Univ(nome, Univ, nuniv);
				break;
				}
			
			case 2:{
				
				Univ = 2;
				nuniv = "Cambrige";
				op.Univ(nome, Univ, nuniv);
				break;
				}
			
			case 3:{
				
				op.dadosE();
				
				break;
			}
			
			case 4:{
				
				
				
			}
				
			default:{
				c1=false;
				break;
				}
			
			}
			
		}while(c1 == true);
		
	}

}
