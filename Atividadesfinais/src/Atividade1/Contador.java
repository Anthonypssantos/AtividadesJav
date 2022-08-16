package Atividade1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Contador {
	//zerar, retornar e incrementar
	
	ArrayList<Integer> incremento = new ArrayList<>();
	int recebeN=0;
	int v=0;
	
	public int incrementar() {
		
		recebeN = Integer.parseInt(JOptionPane.showInputDialog("Coloque um numero"));
		
		incremento.add(recebeN);
		
		v = incremento.size();
		
		return v;
	}
	
	public String retornar(int a) {
		String envia=" ";
		
		if(a >= 0 && a <= 5) {
			
			envia = "Adicione no minimo 5 numero no incrementar para printar a lista";
			
		}else {
			
			
			for(int i =0; i < incremento.size(); i++) {
				
				System.out.println(incremento.get(i));
				
			}
			
		}
		
		return envia;
	}
	
	
	public void zerar() {
		v = 0;
		
		incremento.clear();
		
		JOptionPane.showMessageDialog(null, "Lista zerada");
			
	}

}
