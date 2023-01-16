package atividade04;

public class ListaEncadeada implements ListaEncadeada_IF {

	
	protected Integer valor;
	protected ListaEncadeada prox;
	
	
	@Override
	public boolean isEmpty() {
		
		if(valor == null) {
			return true;
		}
		else {
			return false;
		}		
	}

	@Override
	public int size() {
		
		if(isEmpty()) {
			return 0;
		}
		else {
			int c = 1 + prox.size();
			return c;
		}
	}

	@Override
	public int search(int element) throws Exception {
		
		if(isEmpty()) {
			return -1;
		}
		else {
			if(valor == element) {
				return valor;
			}
			else {
				return prox.search(element);
			}
		}
		
	}

	@Override
	public void insert(int element) {
		
		if(isEmpty()) {
			valor = element;
			prox = new ListaEncadeada();
		}
		else {
			prox.insert(element);
		}
		
	}

	@Override
	public void remove(int element) {
		
		if(isEmpty()) {
			
		}
		else {
			if(valor == element) {
				valor = prox.valor;
				prox = prox.prox;
			}
			else {
				prox.remove(element);
			}
		}	
	}

	@Override
	public int[] toArray() {
	
		int[] resultado = new int[10];
		toArrayAux(resultado, this);
		return resultado;
	}
	
	private void toArrayAux(int[]vetor, ListaEncadeada no) {
		if(!no.isEmpty()) {
			vetor[no.size()-1] = no.valor;
			toArrayAux(vetor, no.prox);
		}
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public ListaEncadeada getProx() {
		return prox;
	}

	public void setProx(ListaEncadeada prox) {
		this.prox = prox;
	}


}
