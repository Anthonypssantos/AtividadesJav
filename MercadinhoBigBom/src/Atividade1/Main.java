package Atividade1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pagamentos pag = new Pagamentos();
	
		String casos;
			
		boolean c = true;
		
		do {
			
			casos = JOptionPane.showInputDialog("Metodos de pagamento a baixo\n============\nDinheiro\nCheque\nCartão\nDigite 'sacola' para ver a sua sacola\nDigite 'Sair' para sair\n============\nPara iniciar a compra siga o exemplo a baixo\nExemplo: Dinheiro para pagar em dinheiro e etc...");
			
			switch(casos) {
			
			case "Dinheiro":{
				
				pag.dinheiro();
				
				break;
			}
			
			case "Cheque":{
							
				pag.cheque();
				
				break;
			}
			
			case "Cartão":{
				
				pag.cartao();
				
				break;
			}
			
			case "Sacola":{
				
				
				
				break;
			}
			
			case "Sair":{
				
				c = false;
				
				break;
			}
			
			
			
			}
			
			
		}while(c == true);
	
	
	}

}
