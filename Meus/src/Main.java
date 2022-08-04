import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l = new List();
		boolean c = true;
		String casos=" ", tipo=" ";
		
		do {
			
		casos = JOptionPane.showInputDialog("Insira 'entrar' para adicionar os produtos na lista\nInsira 'sair' para sair do programa");
			
			switch(casos) {
			
			case "entrar":{
				
				tipo = JOptionPane.showInputDialog("Coloque o tipo de lista que desejas entrar\n==============================\nTipos de listas\n\nA: Mercado\nB: Exercicios fisicos\nC: Escola\n\nCaso você queira voltar para o menu principal\ninsira 'Voltar'\nPara sair do programa insira 'Sair do programa'\n\n===LEMBRETE===\nDigite o nome da lista.\nEXEMPLO: Mercado ou etc...");
				
				if(tipo.equals("Voltar")) {
					
					return;
					
				}else if(tipo.equals("Sair do programa")) {
					
					c = false;
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Você escolheu a lista tipo: "+ tipo);
					l.Lis(tipo);
					
				}
				
				break;
				}
			
			
			default:{
					
					JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
					c = false;
					
				break;
				}
			
			}
			
		}while(c == true);
		
		
	}

}
