package List;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controle {
	
	ArrayList<String> nomes = new ArrayList<>();
	ArrayList<Integer> notas= new ArrayList<>();
	ArrayList<String> aprova= new ArrayList<>();
	ArrayList<String> reprovados= new ArrayList<>();
	ArrayList<String> aprovados = new ArrayList<>();
	int receben, soma, printa;
	String compara;
	String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(ArrayList<String> recebe, ArrayList<Integer> not) {
		for (int i = 0; i < 1; i++) {
			
			JOptionPane.showMessageDialog(null,  "Nomes cadastrados: "+"\n"+recebe.toString()+"\n"+not.toString());
			
		}		
	}
	
	//passou ou não?
	public void settotal(int r, ArrayList<Integer> not) {	
		int comp1, comp2;
		
		for(int i = 0; i < not.size();i++) {	
			
			if (not.size() >= 2) {
				
				comp1 = not.get(i);
				comp2 = not.get(i);
				
				if(comp1 > comp2) {
					
					receben = comp1;
					soma = receben / r;
					JOptionPane.showMessageDialog(null, soma);
						
				}else {
					
					receben = comp2;
					soma = receben / r;
					JOptionPane.showMessageDialog(null, soma);
				}
				
			}
			if(not.size() == 1) {
				receben = not.get(i);
				soma = receben / r;
				JOptionPane.showMessageDialog(null, soma);
			}
			
	
		}
	
		
	
	
	}
	
	public void setlist(ArrayList<String> recebe, ArrayList<String> aprova, ArrayList<String> ap, ArrayList<String> rp) {
		for (int i = 0; i < 1; i++) {
    		
		JOptionPane.showMessageDialog(null, recebe.toString()+"\n"+"\n====================================\n\n"+"Aprovados: "+ap.toString()+"\n\n"+"reprovadoss: "+rp.toString());		
			
		}		
	}
}
