package Atividade8;

import javax.swing.JOptionPane;

public class Arvorefamiliar {
	
	String nome="", mae="", pai="", irmao="", avo="";

	public void setado() {
		nome="Anderson";
		mae="Joaquina";
		pai="Anderson";
		irmao="Flavindopineu";
		avo="Anderson";
		
		verificafamily(nome);
	}
	public void verificafamily(String nome) {
		
		if(nome == pai && pai == avo) {
			
		JOptionPane.showMessageDialog(null, "Arvore geonologica de Anderson\n"+"Pai: "+pai+"\n"+"Avo: "+avo+"\n"+"Mãe:"+mae);	
			
		}
		irmaos(nome);
	}
	public void irmaos(String nome) {
		
		if(nome == pai) {
			
			JOptionPane.showMessageDialog(null, "Seu pai é "+irmao);
			
		}
		
	}

}
