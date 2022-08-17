package Atividade6;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class pais {
	/*
	 Codigo iso tipo string
	 colocar o codigo iso
	 mostrar
	 verificar se o codigo iso e igual
	 Mostrar se é litrofe ou não
	 retornar a densidade popul do paizes vizinhos
	  
	*/
	
	String iso="";
	
	//6
	public String iso() {
		
		iso = JOptionPane.showInputDialog("escolha as isos a baixo e coloque elas\n1245-1: BRA\n1666-5: COD\n0000-0: MDJ\n9999-9: LBMN\n7777-7: RAFMN\n4444-6: LLL");
		
		return iso;
	}
    
    public void verifica(String hm) {
    	
    	if(hm.equals("1245-1")) {
    		
    		JOptionPane.showMessageDialog(null, "Você escolheu o país Brasil");
    		mostrarlitr(hm);
    	}else if(hm.equals("1666-5")) {
    		
    		JOptionPane.showMessageDialog(null, "Você escolheu o país Codo");
    		mostrarlitr(hm);
    	}else if(hm.equals("0000-0")) {
    		
    		JOptionPane.showMessageDialog(null, "Você escolheu o país Mariano DJ");
    		mostrarlitr(hm);
    	}else if(hm.equals("9999-9")) {
    		
    		JOptionPane.showMessageDialog(null, "Você escolheu o país Laba mana");
    		mostrarlitr(hm);
    	}else if(hm.equals("7777-7")) {
    		
    		JOptionPane.showMessageDialog(null, "Você escolheu o país Rafa moreira mano");
    		mostrarlitr(hm);
    	}else if(hm.equals("4444-6")) {
    		
    		JOptionPane.showMessageDialog(null, "Você escolheu o país Lambari Lambari Lambari");
    		mostrarlitr(hm);
    	}else {
    		
    		JOptionPane.showMessageDialog(null, "Acredite! Pais não encontrado");
    		
    	}
    	
    }
    public void mostrarlitr(String hm) {
    	
    	if(hm.equals("1245-1")) {
    		
    		JOptionPane.showMessageDialog(null, "Brasil\nLitrofes: Alcaida, Arabia, Camumila e pão de batata");
    		
    	}else if(hm.equals("1666-5")) {
    		
    		JOptionPane.showMessageDialog(null, "Codo\nLitrofes: Ombro, Cabeça, Joelho e pé");
    		
    	}else if(hm.equals("0000-0")) {
    		
    		JOptionPane.showMessageDialog(null, "Mariano DJ\nLitrofes: Voa, come, plana, Destiny e vive");
    		
    	}else if(hm.equals("9999-9")) {
    		
    		JOptionPane.showMessageDialog(null, "Laba mana\nLitrofes: bala, fogo, terra, ar e agua");
    		
    	}else if(hm.equals("7777-7")) {
    		
    		JOptionPane.showMessageDialog(null, "Rafa moreira mano\nLitrofes: Congo, malasia, Missil, Carro e cavalo");
    		
    	}else if(hm.equals("4444-6")) {
    		
    		JOptionPane.showMessageDialog(null, "Lambari Lambari Lambari\nLitrofes: Peixe, Tubarão, polvo, Aguia e arraia");
    		
    	}else {
    		
    		JOptionPane.showMessageDialog(null, "Acredite! Pais não encontrado");
    		
    	}	
    	
    }
    public String denspopul() {
    	String dens="";
    	
    	if(iso.equals("1245-1")) {
    		
    		JOptionPane.showMessageDialog(null, "Densidade populacional do Brasil: 124352-4152351-512352345-1335151351251513");
    		
    	}else if(iso.equals("1666-5")) {
    		
    		JOptionPane.showMessageDialog(null, "Densidade populacional do Codo: 3856135678135-35891637856138-89175823651237856");
    		
    	}else if(iso.equals("0000-0")) {
    		
    		JOptionPane.showMessageDialog(null, "Densidade populacional do Mariano DJ: 1785187236581-53856137865-52935891651");
    		
    	}else if(iso.equals("9999-9")) {
    		
    		JOptionPane.showMessageDialog(null, "Densidade populacional do Laba mana: 151875619589378-97267568367-98164615674571");
    		
    	}else if(iso.equals("7777-7")) {
    		
    		JOptionPane.showMessageDialog(null, "Densidade populacional do Rafa moreira mano: 19084915678135-532527895-89137578136675");
    		
    	}else if(iso.equals("4444-6")) {
    		
    		JOptionPane.showMessageDialog(null, "Densidade populacional do Lambari Lambari Lambari: 1893758159135-39237536278561-59027591678513");
    		
    	}else {
    		
    		JOptionPane.showMessageDialog(null, "Acredite! Pais não encontrado");
    		
    	}	
    	
    	return dens;
    }
}
