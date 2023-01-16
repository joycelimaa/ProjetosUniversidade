package atividade01;

/*
 * Interface para implementa��o da classe "Busca".
 * Os m�todos booleanos devem retornar 'false' se 'num' n�o estiver no vetor 'numeros'. 
 */
public interface Busca_IF {
	
	int[] geraVetorNumericoOrdenado(int tamanho);
	
	boolean buscaLinear_iterativa(int[] numeros, int num);

	boolean buscaLinear_recursiva(int[] numeros, int num);

	boolean buscaBinaria_iterativa(int[] numeros, int num);

	boolean buscaBinaria_recursiva(int[] numeros, int num);

}