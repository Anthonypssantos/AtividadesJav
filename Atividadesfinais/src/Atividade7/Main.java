package Atividade7;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Continentes c = new Continentes();
		
		boolean v = true;
		
		String namecontin="";
		
		int casos=0;
		
		do {
			
		casos = Integer.parseInt(JOptionPane.showInputDialog("1 para escolher o continente"));	
			
			switch(casos) {
			
			case 1:{
				
				namecontin = JOptionPane.showInputDialog("Coloque qual continente você prefere\n=========\nEuropa\nAustralia\nAmérica");
				c.Continent(namecontin);
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