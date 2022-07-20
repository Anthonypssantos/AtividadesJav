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
				
				CCnt.setTips(tipo);
				
				opn1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero ou '0' para sair"));
				
				if (opn1 == 0) {
					
					c = false;
					
					break;
				}else {
					
					CCnt.setOpn1(opn1);
					
				}
				
				opn2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero ou '0' para sair"));
				
				if(opn2 == 0) {
					
					c = false;
					
					break;
				}else {
				
					CCnt.setOpn2(opn2);
					CCnt.getCalc();	
				}		
					
				break;
			}
			
			case "-":{
				
				tipo = casos;
				
				CCnt.setTips(tipo);
				
				
				opn1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero ou '0' para sair"));
				
				if (opn1 == 0) {
					
					c =false;
					break;
				}else {
					
					CCnt.setOpn1(opn1);
					
				}
				
				opn2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero ou '0' para sair"));
				
				if(opn2 == 0) {
					
					c = false;
					break;
				}else {
				
					CCnt.setOpn2(opn2);
					CCnt.getCalc();	
						
				}		
				
				break;
			}
			
			case "x":{
				
				tipo = casos;
				
				CCnt.setTips(tipo);
				
				
				opn1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero ou '0' para sair"));
				
				if (opn1 == 0) {
					
					c =false;
					break;
				}else {
					
					CCnt.setOpn1(opn1);
					
				}
				
				opn2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero ou '0' para sair"));
				
				if(opn2 == 0) {
					
					c = false;
					break;
				}else {
				
					CCnt.setOpn2(opn2);
					CCnt.getCalc();	
						
				}		
				
				break;
			}
			
			case "/":{
				
				tipo = casos;
				CCnt.setTips(tipo);
				
				
				opn1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero ou '0' para sair"));
				
				if (opn1 == 0) {
					
					c =false;
					break;
				}else {
					
					CCnt.setOpn1(opn1);
					
				}
				
				opn2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero ou '0' para sair"));
				
				if(opn2 == 0) {
					
					c = false;
					break;
				}else {
				
					CCnt.setOpn2(opn2);
					CCnt.getCalc();	
						
				}		
				break;
			}
			
			
			
			}
			
		}while(c == true);
		
	}
	
}
