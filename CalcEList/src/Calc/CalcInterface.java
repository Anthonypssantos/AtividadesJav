package Calc;

import javax.swing.JOptionPane;

public class CalcInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chamada
		CalcControle calcc = new CalcControle();
		Calcdados calcd = new Calcdados();
		CalcInterface calcI = new CalcInterface();
		
		double
		
		//estrutura de repetição
		int c = 9, casos = 0;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("[1] para fazer os calculos\n[9] para sair"));
			
			switch(casos) {
			
			
			case 1:{
				
				
				
				break;
			}
			
			default:{
				
				c = 0;
				
				break;
			}
			
			
			}
		}while(c >= 9);
		
		
	}

}
