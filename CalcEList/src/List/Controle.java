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
	int soma, rsoma;
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
	public void settotal(int h, ArrayList<Integer> not) {
			
		for (int i = 0; i < h; i++) {
            		
			soma += not.get(i);	
			rsoma = soma / h;
		}
		
		if(rsoma < 100) {
			
			JOptionPane.showMessageDialog(null, "Nota total da turma: "+ soma + " turma abaixo da media");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Nota total da turma: "+ soma+ " turma acima da media");
			
		}

	}
	
	public void setlist(ArrayList<String> recebe, ArrayList<String> aprova, ArrayList<String> ap, ArrayList<String> rp) {
		
		
		
		for (int i = 0; i < 1; i++) {
    		
	
		JOptionPane.showMessageDialog(null, recebe.toString()+"\n"+"\n====================================\n\n"+"Aprovados: "+ap.toString()+"\n\n"+"reprovadoss: "+rp.toString());		
			
		}		
	}
}
