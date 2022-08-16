package Ativida3;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Voo {
	
	private int data;
	private int vo;
	
	String numero;
	
	ArrayList<Integer> armdatavoo = new ArrayList<>();
	ArrayList<Integer> vazio = new ArrayList<>();
	ArrayList<String> vaziocheio = new ArrayList<>();
	ArrayList<Integer> dados = new ArrayList<>();
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	
		dados.add(data);
	}
	public int getVo() {
		return vo;
	}
	public void setVo(int vo) {
		this.vo = vo;
				
	}
	
	public String voo(int acento) {
		//adicionar data e numero do voo
		int a;
		
		Random aleatorio = new Random();
		
		for(int i=0;i < 100;i++) {
			
			a = aleatorio.nextInt(100);
			
			if(a <= 50) {
			vaziocheio.add("Cheio");	
			numero = "Cheio";	
			vazio.add(a);	
			}else {
				vaziocheio.add("Vazio");	
				numero = "Vazio";
				
			}
			
		}
		return numero;
	}
		//retorna proximo acento livre
	
	public void vagas() {
		//retorna
		
		JOptionPane.showMessageDialog(null, "Acentos vazios");
		for(int i = 0; i < vazio.size(); i++) {
			
			System.out.println(vazio.get(i));
			
		}
		
	}
	
	public void clon(int r) {
		//clona data e numero do voo
		int l=0, recebs=0;
		
		JOptionPane.showMessageDialog(null, "Numero do Vôo registrado: "+ r);
		armdatavoo.add(r);
	
	}
}
