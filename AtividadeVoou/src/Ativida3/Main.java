package Ativida3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voo z = new Voo(); 
		
		ArrayList<String> acentosreservados = new ArrayList<>();
		
		boolean v = true;
		String dados[] = {"Adicione o 'numero' do Vôo","Adicione o 'dia' do Vôo"}, recebeacento;
		ArrayList<Integer> datasenumeros = new ArrayList<>();
		int casos=0, recebe=0, enviadata=0;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar seus dados no vôo\n2 para reservar o acento\n3 para pegar a data do Vôo\n4 para ver o registro de vôo\n5 para sair"));
			
			switch(casos) {
			
			case 1:{		
					
					JOptionPane.showMessageDialog(null, "Adicione a data e numero do Vôo com numeros!");
					recebe = Integer.parseInt(JOptionPane.showInputDialog(dados[0]));
					z.setData(recebe);
					enviadata = recebe;
					
					JOptionPane.showMessageDialog(null, "Adicione a data e numero do Vôo com numeros!");
					recebe = Integer.parseInt(JOptionPane.showInputDialog(dados[1]));
					z.setVo(recebe);
				
				break;
				}
			
	       case 2:{
				int acento=0;
				
				acento = Integer.parseInt(JOptionPane.showInputDialog("Coloque o acento que desejas"));
		
				recebeacento = z.voo(acento);
				
				JOptionPane.showMessageDialog(null, "Seu acento está "+recebeacento);
				
				if(recebeacento.equals("Cheio")) {
					
					JOptionPane.showMessageDialog(null, "Por favor coloque outro acento");
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Acento: "+ acento+" reservado para você");
					acentosreservados.add(recebeacento);
					z.vagas();
				}
				
				break;
				}
			
			case 3:{
				
				JOptionPane.showMessageDialog(null, "Data do Vôo: "+z.getData());
				
				break;
				}
			
			case 4:{
				
				z.clon(enviadata);
				
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
