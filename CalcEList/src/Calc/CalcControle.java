package Calc;

import javax.swing.JOptionPane;

public class CalcControle {

	CalcDados CDad = new CalcDados();
	
	private int calc, opn1, opn2;
	
	private String tips;

	
	public int getCalc() {
		
		if(tips.equals("+")) {
			
		this.calc = this.opn1 + this.opn2;
		
		CDad.setRecebeops(this.calc);
		CDad.setTipos(this.tips);
		
		CDad.dados();
		
		}
		
		if(tips.equals("-")) {
			
			this.calc = this.opn1 - this.opn2;
			
			CDad.setRecebeops(this.calc);
			CDad.setTipos(this.tips);
		
			CDad.dados();
		}
		
		if(tips.equals("x")) {
			
			this.calc = this.opn1 * this.opn2;
				
			CDad.setRecebeops(this.calc);
			CDad.setTipos(this.tips);
			
			CDad.dados();
			
		}
		
		if(tips.equals("/")) {
			
			this.calc = this.opn1 / this.opn2;
				
			CDad.setRecebeops(this.calc);
			CDad.setTipos(this.tips);
			
			CDad.dados();
			
		}
		
		return calc;
	}

	public void setCalc(int calc) {
		this.calc = calc;
	}

	public int getOpn1() {
		return opn1;
	}

	public void setOpn1(int opn1) {
		this.opn1 = opn1;
	}

	public int getOpn2() {
		return opn2;
	}

	public void setOpn2(int opn2) {
		this.opn2 = opn2;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}
	
	
	
}
