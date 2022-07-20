package Calc;

import javax.swing.JOptionPane;

public class CalcInterface {
	
	CalcControle CCnt = new CalcControle();
	
	public void ColocNu() {
		
		int opn1, opn2;
		
		String tipo, casos;
		
		boolean c = true;
		
		
		do {
			
			casos = JOptionPane.showInputDialog("Digite '+' para somar\nDigite '-' para subtrair\nDigite 'x' para Multiplicar\nDigite '/' para Dividir\n Digite 's' para sair\n"); 
			
			if(casos.equals("s")) {
				
				c = false;
				
			}
			
			switch(casos) {
			
			case "+":{
				
				tipo = casos;
				
				opn1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero ou 's' para sair"));
				opn2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero ou 's' para sair"));
				
				if(tipo.equals("s")) {
					
					c = false;
					
				}
					
					CCnt.setOpn1(opn1);
					CCnt.setOpn2(opn2);
					CCnt.setTips(tipo);
					
					CCnt.getCalc();
					
				break;
			}
			
			case "-":{
				
				tipo = casos;
				
				opn1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero ou 's' para sair"));
				opn2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero ou 's' para sair"));
				
				if(tipo.equals("s")) {
					
					c = false;
					
				}
					
					CCnt.setOpn1(opn1);
					CCnt.setOpn2(opn2);
					CCnt.setTips(tipo);
					
					CCnt.getCalc();
				
				break;
			}
			
			case "x":{
				
				tipo = casos;
				
				opn1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero ou 's' para sair"));
				opn2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero ou 's' para sair"));
				
				if(tipo.equals("s")) {
					
					c = false;
					
				}
					
					CCnt.setOpn1(opn1);
					CCnt.setOpn2(opn2);
					CCnt.setTips(tipo);
					
					CCnt.getCalc();
				
				break;
			}
			
			case "/":{
				
				tipo = casos;
				
				opn1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero ou 's' para sair"));
				opn2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero ou 's' para sair"));
				
				
				if(tipo.equals("s")) {
					
					c = false;
					
				}else {
					
					CCnt.setOpn1(opn1);
					CCnt.setOpn2(opn2);
					CCnt.setTips(tipo);
					
					CCnt.getCalc();
					
				}		
				break;
			}
			
			
			
			}
			
		}while(c == true);
		
	}
	
}
