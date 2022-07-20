package Calc;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcInterface Cinf = new CalcInterface();
		CalcControle CCnt = new CalcControle();
		CalcDados CDad = new CalcDados();
		
		int h, r;
		String casos ;
		
		boolean c = true;
		
		do {
			
			casos = JOptionPane.showInputDialog("Digite 1 para iniciar a calculadora\nDigite 's' para sair");
			
			switch(casos) {
			
			case "1":{
						
					Cinf.ColocNu();
		
				break;
			}
			
			default:{
				
				c = false;
				
				break;
			
			}
			
		}
			
		}while(c == true);
		
	}

}
