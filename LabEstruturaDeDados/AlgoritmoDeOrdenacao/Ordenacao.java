package atividade02;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Ordenacao implements Ordenacao_IF{
	
	long antes, depois, tempo;
	
	public int[] vetorCrescente(int[] vetor){
    	
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i;
        }
        return vetor;
    }
	
	public int[] vetorDecrescente(int[] vetor){
	    	
		int cont = 0;
        for(int i = vetor.length-1; i >= 0; i--){
            vetor[cont] = i;
            cont++;
        }
        return vetor;
    }
	
	public int[] vetorAleatorio(int[] vetor){
    	
		Random rnd = ThreadLocalRandom.current();
	    for (int i = vetor.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      int a = vetor[index];
	      vetor[index] = vetor[i];
	      vetor[i] = a;
	    }
	    return vetor;
    }
	
	public int[] mostrarVetor(int[] vetor) {

		for(int i = 0; i<vetor.length; i++) {
			
			if(i==0) {
				System.out.print("[ ");
			}
			if (i>0) {
				System.out.print(" , ");
			}			
			
			System.out.print(vetor[i]);
			
			if(i==vetor.length-1) {
				System.out.print(" ]");
			}
		}
		return vetor;
	}
	
	@Override
	public boolean checaVetorOrdenado(int[] numeros) {
		
		boolean estado = false;
		
		for (int i=0; i<numeros.length-1; i++) {
			
			
			if(numeros[0] == numeros.length-1) {
				if(numeros[i]>numeros[i+1]) {
					System.out.println("decrescente");
					return estado = true;
				}
			}
			else if(numeros[numeros.length-1] == numeros.length-1 ) {
				if(numeros[i]<numeros[i+1]) {
					System.out.println("crescente");
					return estado = true;}
			}
			else {
				System.out.println("aleatorio");
				return estado = false;
			}	
		}
		return estado;
	}
	
	
	//SELECTION-----------------------------------------------
	
	public int[] selectionSort2(int[] numeros) {
		
		antes = System.nanoTime();
		//int n=numeros.length-1;
		for(int i = 0; i<numeros.length-1; i++) {
			int min = i;
			for(int j = i+1; j<numeros.length; j++) {
				if (numeros[j] < numeros[min]) {
					min = j;
					//System.out.println("selection");
				}
			}
			int temp = numeros[min];
			numeros[min] = numeros[i];
			numeros[i] = temp;
			
			}
			System.out.println("\nselection");
			depois = System.nanoTime();
			System.out.printf("\nTempo Selection:  %.4f/ms\n", ((depois - antes)/1000000.0));
			return numeros;
		}
	
	@Override
	public long selectionSort(int[] numeros) {
		
		antes = System.nanoTime();
		
		for(int i = 0; i<numeros.length-1; i++) {
			int min = i;
			for(int j = i+1; j<numeros.length; j++) {
				if (numeros[j] < numeros[min]) {
					min = j;
				}
			}
			int temp = numeros[min];
			numeros[min] = numeros[i];
			numeros[i] = temp;
			}
			
			depois = System.nanoTime();
			tempo =   (long) ((depois - antes));
			return tempo;
	}

	
	//INSERTION-----------------------------------------------
	
	public int[] insertionSort2(int[] numeros) {
		
		antes = System.nanoTime();
		int n = numeros.length;
		for (int j = 1; j<n; j++) {
			int key = numeros[j];
			int i = j - 1;
			while(i>=0 && numeros[i]>key) {
				numeros[i+1] = numeros[i];
				i = i-1;
			}
			numeros[i+1] = key;
		}
		depois = System.nanoTime();
		System.out.printf("\nTempo Insertion:  %.4f/ms\n", ((depois - antes)/1000000.0));
		return numeros;
	}

	@Override
	public long insertionSort(int[] numeros) {
		
		antes = System.nanoTime();
		int n = numeros.length;
		for (int j = 1; j<n; j++) {
			int key = numeros[j];
			int i = j - 1;
			while(i>=0 && numeros[i]>key) {
				numeros[i+1] = numeros[i];
				i = i-1;
			}
			numeros[i+1] = key;
		}
		depois = System.nanoTime();
		tempo =   (long) ((depois - antes));
		
		return tempo;
		
	}

	
	//MERGE---------------------------------------------------
	
	@Override
	public long mergeSort(int[] numeros) {
		
		antes = System.nanoTime();
		MERGE(numeros, numeros.length);
		depois = System.nanoTime();
		tempo =   (long) ((depois - antes));
		return tempo;
		
	}
	
	public void MERGE(int[] a, int n){
		
		if(n < 2){
			return;
		}

		int mid = n/2;
		int[] l = new int[mid];
		int[] r = new int [n-mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}

		for(int i = mid; i < n; i++){
			r[i-mid] = a[i];
		}

		MERGE(l, mid);
		MERGE(r, n - mid);
		
		merge(a, l, r, mid,n - mid);
		
	}
	
	private static void merge( int[] a, int[] l, int[] r, int left, int right) {
 
	    int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	        if (l[i] <= r[j]) {
	            a[k++] = l[i++];
	        }
	        else {
	            a[k++] = r[j++];
	        }
	    }
	    while (i < left) {
	        a[k++] = l[i++];
	    }
	    while (j < right) {
	        a[k++] = r[j++];
	    }
	}
	
	
	//QUICK----------------------------------------------------
	
	public long quickSort2(int[] numeros) {
		
		antes = System.nanoTime();
		//randomPivot(numeros, 0, numeros.length - 1);
		QUICKSORT(numeros, 0, numeros.length - 1);
		depois = System.nanoTime();
		System.out.printf("\nTempo Quick:  %.4f/ms\n", ((depois - antes)/1000000.0));
		
		return 0;
	}
	
	@Override
	public long quickSort(int[] numeros) {
		
		antes = System.nanoTime();
		QUICKSORT(numeros, 0, numeros.length - 1);
		depois = System.nanoTime();
		tempo =   (long) ((depois - antes));
		return tempo;
	}

	public void QUICKSORT(int[] A, int left, int right) {

		if (left < right) {
			
			int pivot = PARTITION(A, left, right);
			QUICKSORT(A, left, pivot - 1);
			QUICKSORT(A, pivot + 1, right);
		}
	}

	private int PARTITION(int[] A, int left, int right) {
		
		//randomPivot(A, left, right);
		int p = A[left];
		int i = left + 1;
		int j = right;
		while (i <= j) {
			if (A[i] <= p){
				i++;
			}

			else if (A[j] > p){
				j--;
			}

			else {
				int swap = A[i] ;
				A[i] = A[j];
				A[j] = swap;
			}
		}
		int swap = A[left];
		A[left] = A[j];
		A[j] = swap;
		
		return j; // posição do pivot
	}

	public void randomPivot(int[] A, int left, int right) {
		
		Random rnd = ThreadLocalRandom.current();
	      int p = rnd.nextInt(right-left)+left;
	      // Simple swap
	      int a = A[p];
	      A[p] = A[right];
	      A[right] = a;

	}
	
	@Override
	public long quickSort_shuffle(int[] numeros) {
		
		antes = System.nanoTime();
		randomPivot(numeros, 0, numeros.length - 1);
		QUICKSORT(numeros, 0, numeros.length - 1);
		depois = System.nanoTime();
		tempo =   (long) ((depois - antes));
		return tempo;
	}

	
	//COUNTING------------------------------------------------
	
	public int valorMaxCount(int a[], int n) {
		int max = a[0];
		for (int i = 1; i<n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public int[] countingSortAux(int[] a, int n) {
		
		int[] b = new int[n+1];
		int max = valorMaxCount(a,n);
		int[] c = new int[max+1];
		
		for(int i = 0; i<=max; i++) {
			c[i] = 0;
		}
		
		for(int i = 0; i<n; i++) {
			c[a[i]]++; 
		}
		
		for(int i = 1; i<=max; i++) {
			c[i] = c[i] + c[i-1];
		}
		
		for(int i = n-1; i>=0; i--) {
			b[c[a[i]]-1] = a[i];
			c[a[i]]--;
		}
		
		for(int i = 0; i<n; i++) {
			a[i] = b[i];
		}
		return a;
		
	}
	
	@Override
	public long countingSort(int[] numeros) {
		
		antes = System.nanoTime();
		countingSortAux(numeros,  numeros.length);
		depois = System.nanoTime();
		tempo =   (long) ((depois - antes));
		return tempo;
		
	}
	
	
	
}