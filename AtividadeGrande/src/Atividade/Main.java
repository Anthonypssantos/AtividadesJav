package Atividade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ChamadaFatura cf = new ChamadaFatura();
		
		int casos=0;
		
		String envia="";
		int quantidade=0;
		
		boolean v = true;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar os produtos para compra\n2 para ver o valor\n"));
			
			switch(casos) {
			
			case 1:{
			
				envia = JOptionPane.showInputDialog("Descrição do produtos\n=========\nHardwares\nFerramentas\nParafusos");
				
				if() {
					
					
					
				}else if() {
				
					envia = JOptionPane.showInputDialog("Numero do produto");
					
					
				}else if() {
					
					envia = JOptionPane.showInputDialog("Numero do produto");
					
				}else {
					
					JOptionPane.showInputDialog("Oops! Algo digitado errado, por-favor inserir o nome de novo");
					
				}
				
				
				
			
				
				break;
			}
			case 2:{
				
				
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
