package Atividade5;


import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		cplanoc cpc = new cplanoc();
		
		int casos=0;
		
		String valida="", recebe="";
		
		boolean v = true;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para colocar seu plano cartesiano\n2 para ver o raio do plano cartesiano\n3 para desinflar ou aumentar o plano cartesiano\n4 para sair"));
			
			switch(casos) {
			
			case 1:{
				int x=0, y=0;
				
				x = Integer.parseInt(JOptionPane.showInputDialog("Coloque o raio"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Coloque o ponto"));
				
				cpc.addplanocartesiano(x, y);
				break;
			}
			case 2:{
				int raio;
				
				raio = cpc.retornaraio();
				
				JOptionPane.showMessageDialog(null, "Raio: "+raio);
				
				break;
				}
			case 3:{
				int a=0, b=0;
				
				valida = JOptionPane.showInputDialog("Você deseja inflar ou desinflar?Sim para desinflar Não para inflar");
				a = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor que desejas desinflar ou inflar"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor que desejas desinflar ou inflar"));
				
				recebe = cpc.desinflar(a, b, valida);
				
				JOptionPane.showMessageDialog(null, recebe);
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


