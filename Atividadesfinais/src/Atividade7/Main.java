package Atividade7;

<<<<<<< HEAD
import javax.swing.JOptionPane;

=======
>>>>>>> 1028382ee4ed0dd5800557e58b6ed05fbaba7836
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		
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
=======

	}

}
>>>>>>> 1028382ee4ed0dd5800557e58b6ed05fbaba7836
