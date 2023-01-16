package atividade02;

import java.util.ArrayList;

public class BrincandoComOrdenacao {
    

	public static void main(String[] args) {
    	
		Ordenacao ordenacao = new Ordenacao();
		Ordenacao_IF o = new Ordenacao();

		ArrayList<int[]> vectoList = new ArrayList<int[]>();


		int tamanho = 5000;
		final int vetor[] = new int[tamanho];
		int[] vetor1 = ordenacao.vetorCrescente(vetor);
		
		//---------------------------------	CRESCENTE----------------------------------------------------------
		//SELECTION--------------------------------------------------------------------------------------------
		
		System.out.printf("-----------------VETOR CRESCENTE----------------");
	    System.out.println();
	    System.out.println();
	     
	   	
		long tempo = 0;
		for(int i = 0; i < 50; i++){
			vectoList.add(vetor1);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.selectionSort(vector);
		}
		System.out.println("Selection Sort: " + tempo/50);

		tempo = 0;

		//INSERTION--------------------------------------------------------------------------------------------
		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.insertionSort(vector);
		}
		System.out.println("Insertion Sort: " + tempo/50);

		tempo = 0;
		
		//MERGE--------------------------------------------------------------------------------------------
		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.mergeSort(vector);
		}
		System.out.println("Merge Sort: " + tempo/50);

		tempo = 0;
		
		//QUICK--------------------------------------------------------------------------------------------
		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.quickSort(vector);
		}
		System.out.println("Quick Sort: " + tempo/50);

		tempo = 0;	
		
		
		//QUICKSHUFFLE--------------------------------------------------------------------------------------
		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.quickSort_shuffle(vector);
		}
		System.out.println("Quick Shuffle: " + tempo/50);

		tempo = 0;
		
		//COUNTING-------------------------------------------------------------------------------------------
		
		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.countingSort(vector);
		}
		System.out.println("Counting Sort: " + tempo/50);


		
		//---------------------------------	DECRESCENTE------------------------------------------------------

		tempo = 0;
		vectoList.removeAll(vectoList);
		ordenacao.vetorDecrescente(vetor1);
		
		 System.out.println();
		 System.out.printf("-----------------VETOR DECRESCENTE----------------");
	     System.out.println();
	     System.out.println();

		//SELECTION------------------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor2 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor2);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.selectionSort(vector);
		}
		System.out.println("Selection Sort: " + tempo/50);

		tempo = 0;
		vectoList.removeAll(vectoList);
		ordenacao.vetorDecrescente(vetor1);
		
		//INSERTION----------------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor2 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor2);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.insertionSort(vector);
		}
		System.out.println("Insertion Sort: " + tempo/50);

		tempo = 0;
		vectoList.removeAll(vectoList);
		ordenacao.vetorDecrescente(vetor1);

		//MERGE-------------------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor2 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor2);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.mergeSort(vector);
		}
		System.out.println("Merge Sort: " + tempo/50);

		tempo = 0;
		vectoList.removeAll(vectoList);
		ordenacao.vetorDecrescente(vetor1);

		//QUICKSORT----------------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor2 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor2);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.quickSort(vector);
		}
		System.out.println("Quicksort Sort: " + tempo/50);

		tempo = 0;
		vectoList.removeAll(vectoList);
		ordenacao.vetorDecrescente(vetor1);
		
		//QUICKSORTSHUFFLE---------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor2 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor2);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.quickSort_shuffle(vector);
		}
		System.out.println("Quick Shuffle: " + tempo/50);

		tempo = 0;
		vectoList.removeAll(vectoList);
		ordenacao.vetorDecrescente(vetor1);

		//COUNTING---------------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor2 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor2);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.countingSort(vector);
		}
		System.out.println("Counting Sort: " + tempo/50);


		//---------------------------------	ALEATORIO----------------------------------------------------
		
		tempo = 0;
		vectoList.removeAll(vectoList);
		ordenacao.vetorAleatorio(vetor1);
		
		 System.out.println();
		 System.out.printf("-----------------VETOR ALEATÓRIO----------------");
	     System.out.println();
	     System.out.println();

		//SELECTION---------------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor3 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor3);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.selectionSort(vector);
		}
		System.out.println("Selection Sort: " + tempo/50);

		tempo = 0;
		vectoList.removeAll(vectoList);

		//INSERTION---------------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor3 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor3);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.insertionSort(vector);
		}
		System.out.println("Insertion Sort: " + tempo/50);

		tempo = 0;
		vectoList.removeAll(vectoList);


		//MERGE--------------------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor3 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor3);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.mergeSort(vector);
		}
		System.out.println("Merge Sort: " + tempo/50);

		tempo = 0;
		vectoList.removeAll(vectoList);

		//QUICKSORT------------------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor3 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor3);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.quickSort(vector);
		}
		System.out.println("Quick Sort: " + tempo/50);

		tempo = 0;
		vectoList.removeAll(vectoList);

		//QUICKSORTSHUFFLE-------------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor3 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor3);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.quickSort_shuffle(vector);
		}
		System.out.println("Quick Shuffle: " + tempo/50);

		tempo = 0;
		vectoList.removeAll(vectoList);

		//COUNTING--------------------------------------------------------------------------------------------
		for(int i = 0; i < 50; i++){
			int[] vetor3 = vetor1.clone();
			//ordenacao.mostrarVetor(vetor3);
			vectoList.add(vetor3);
		}

		for (int[] vector : vectoList) {
			//System.out.println();
			//ordenacao.mostrarVetor(vector);
		    tempo += o.countingSort(vector);
		}
		System.out.println("Counting Sort: " + tempo/50);
	
	}
}