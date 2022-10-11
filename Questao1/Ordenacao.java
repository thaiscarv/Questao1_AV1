package Questao1;

public class Ordenacao {

	public static void main(String[] args) {
		int vetor[] = {3,8,7,9,10,11,80,2,1,50};
		
		int aux;
		
		for(int i=0; i<10; i++){
			for(int j=0; j<9; j++){
				if(vetor[j]> vetor[j+1]){
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}

		System.out.println("Ordenação crescente:");
		for(Integer t:vetor) 
            System.out.printf("%d \t",t);
		}
}