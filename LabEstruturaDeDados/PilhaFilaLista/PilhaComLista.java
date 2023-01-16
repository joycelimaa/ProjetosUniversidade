package atividade04;

public class PilhaComLista implements Pilha_IF {

    protected ListaEncadeada topo;
    protected int size=0;

    
    @Override
    public void push(int element) throws Exception {
    	if (isFull()) throw new Exception("Pilha Cheia");
    	ListaEncadeada nEncadeada = new ListaEncadeada();
        nEncadeada.insert(element);
        nEncadeada.prox = topo;
        topo = nEncadeada;
        size++;
    }

    @Override
    public int pop() throws Exception {
        if (isEmpty()) throw new Exception("Pilha Vazia");
        int temp = top();
        //topo.remove(temp);    
        topo = topo.prox;
        size--;
        return temp;
    }

    @Override
    public int top() throws Exception {
        if (isEmpty()) throw new Exception("Pilha Vazia");
        int c = topo.valor;
        return c;
    }

    @Override
    public boolean isEmpty() {
        if (topo == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
    	if(size == 3) {
    		return true;
    	}
        return false;
    }

}