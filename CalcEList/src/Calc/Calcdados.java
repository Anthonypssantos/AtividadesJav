package Calc;

import javax.swing.JOptionPane;

public class CalcDados {

	private int recebeops;
	private String tipos;	
	
	public void dados() {
			
		JOptionPane.showMessageDialog(null, "Você optou por "+this.tipos+" resultado: "+ this.recebeops);
			
	}
	
	
	public int getRecebeops() {
		return recebeops;
	}
	
	//set int
	public void setRecebeops(int recebeops) {
		this.recebeops = recebeops;
	
	
	}
	
	public String getTipos() {
		return tipos;
	}
	
	//set String
	public void setTipos(String tipos) {
		this.tipos = tipos;
	
	
	}
	
}
