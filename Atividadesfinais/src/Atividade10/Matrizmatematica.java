package Atividade10;

public class Matrizmatematica {
	/*
	 
	 transformar linhas em colunas e colunas em linhas, retornar a que foi modificada, fazer a matriz nula
	 printar a matriz que contem 1 e os demais, matriz diagonal todos iguais a 0, singular iguais na diagonal
	 informar a matriz simetrica, anti-simetrica, enviar um dado a matriz e modificalo tipo mensagem com subtração e multiplicação
	 copiar a matriz
	 
	 */
	
	int martriz[][] = {{1,1},{0,0}};
	
	public void transposta() {
		
		for(int l = 0; l < 2; l++) {
			
			martriz[l][0] = 0;
			
			for(int c = 0; c < 2; c++) {
				
				martriz[0][c] = 1;
				
			}
			
		}
			
	}
	//
	
	
	
	
}
