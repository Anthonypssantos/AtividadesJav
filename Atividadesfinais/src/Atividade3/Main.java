package Atividade3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumeroComplexo nc = new NumeroComplexo();
		
		boolean v = true;
		
		int casos=0, recebe=0, a=0, b=0;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para somar\n2 para subtrair\n3 para dividir\n4 para multiplicar\n5 para sair"));
			
			switch(casos) {
				
			case 1:{
				//soma
				a = Integer.parseInt(JOptionPane.showInputDialog("Adicione 1 numero"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Adicione 1 segundo numero"));
				
				recebe = nc.somar(a, b);
				
				JOptionPane.showMessageDialog(null, "Soma: "+recebe);
				break;
			}
			case 2:{
				//subtrair
				a = Integer.parseInt(JOptionPane.showInputDialog("Adicione 1 numero"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Adicione 1 segundo numero"));
				
				recebe = nc.subtrair(a, b);
				
				JOptionPane.showMessageDialog(null, "Subtração: "+recebe);
				break;
			}
			case 3:{
				//dividir
				a = Integer.parseInt(JOptionPane.showInputDialog("Adicione 1 numero"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Adicione 1 segundo numero"));
				
				recebe = nc.dividir(a, b);
				
				JOptionPane.showMessageDialog(null, "Divisão: "+recebe);
				break;
				}
			
			case 4:{
				//multiplicar
				a = Integer.parseInt(JOptionPane.showInputDialog("Adicione 1 numero"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Adicione 1 segundo numero"));
				
				recebe = nc.multiplicar(a, b);
				
				JOptionPane.showMessageDialog(null, "Multiplicação: "+recebe);
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
