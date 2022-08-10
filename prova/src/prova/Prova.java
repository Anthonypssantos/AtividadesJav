package prova;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Prova {
	
	Gaarito gab = new Gaarito();
	
	int acertos=0, b=0, f=0;
	
	Double nota=0.0;
	
	String lista[] = {"4+4 é 8?Sim ou não?","2+2 é 4?Sim ou não?","1+1 é 2?Sim ou não?","5+5 é 10?Sim ou não?","100+100 é 200?Sim ou não?","300+300 é 600?Sim ou não?","1000+1000 é 2000?Sim ou não?","50+50 é 100?Sim ou não?","20+20 é 40?Sim ou não?","15+15 é 30?Sim ou não?","45+45 é 90?Sim ou não?","30+30 é 60?Sim ou não?","70+70 é 140?Sim ou não?","550+550 é 1100?Sim ou não?","650+650 é 1300Sim ou não?"};
	
	String aluno=" ", questao=" ";
	
	ArrayList<Double> notas = new ArrayList<>();
	ArrayList<String> alunoslist = new ArrayList<>();
	
	public int aluno(){	
		f++;
		aluno = JOptionPane.showInputDialog("Coloque o seu nome");
		
		alunoslist.add(aluno);
		
		return f;
	}
	
	public int prov(int i, int n, int alunos) {
		int h=0, conta=0;
		
		questao = JOptionPane.showInputDialog(lista[i]);
		
		if(questao.equals("Sim")) {
			
			if(n < 10){
				
				nota += 0.5;
				
			}else if(n >= 10){
				
				nota += 1.0;
				
			}else {
				
				nota += 0.0;
				
			}
			
			acertos++;
		
		}else {
			
			acertos--;
			
		}
		
		if(n == 4) {
			
		JOptionPane.showMessageDialog(null, "Acertos do aluno"+ acertos);
		notas.add(nota);
		nota = 0.0;			
		h = 0;
		
		}
		
	
		return acertos;
	}
	
	public void acertos(int i) {
		
		JOptionPane.showMessageDialog(null, "acertos no total da turma: "+i);
		
		nota();
	}
	
	public void nota() {
		int a=0;
		
		for(int i = 0; i < notas.size();i++) {
			
			System.out.println("Nota do aluno: "+alunoslist.get(i)+" "+notas.get(i));
			
		}
		
		a = 0;
		
		maior();
		
	}
	
	public void maior() {
		Double envianot=0.0, printa=0.0;
		
		for(int i = 0; i < notas.size(); i++) {
		
			envianot = notas.get(i);
			
		}
		
		gab.setRecebe(envianot);
		
		printa = gab.getRecebe();
		
		JOptionPane.showMessageDialog(null, "Maior nota: "+printa);
		
	}
}
