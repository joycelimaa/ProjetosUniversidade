package atividade01;

public class Busca implements Busca_IF{

    
    public int[] geraVetorNumericoOrdenado(int tamanho) {
        
    	final int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho ; i++) {
            vetor[i] = i ; 
        }
        //mostrar
        //for (int i = 0; i < tamanho; i++){
          //  System.out.println(vetor[i]);
        //}
        return vetor;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////////////
    public boolean buscaLinear_iterativa(int[] numeros, int num) {
    	boolean estado = false;
    	
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) { 
            	return estado = true;
            } 
        }
        //System.out.println(estado);
        return estado;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////////////
    public boolean buscaLinear_recursiva(int[] numeros, int num) {
        int i = 0;
            boolean estado = false, achou = false;

            achou = buscaLinear_recursivaAux(numeros, num, i);

            if (achou == false){
                 estado = false;
            }
            else{
                estado = true;
            }

            //System.out.println(estado);
            return estado;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////////////
    private boolean buscaLinear_recursivaAux(int[] numeros, int num, int i){
        boolean achou = false;

        if (i < numeros.length) {
            if (numeros[i] == num) {
                achou = true;
            }else{
                achou = buscaLinear_recursivaAux(numeros, num, i + 1);
            }
        }
        return achou;
    }

    
    ///////////////////////////////////////////////////////////////////////////////////////
    public boolean buscaBinaria_iterativa(int[] numeros, int num) {
        int  inicio = 1, fim = numeros.length -1 , metadeVetor = (fim + inicio)/2;

        boolean estado = false;

        if (num == metadeVetor) {
            estado = true;
        }else if(num < 0 || num > numeros.length){
            estado = false;
        }else{
            for (int i = inicio; i <= numeros.length/2; i++) {
                metadeVetor = (fim + inicio)/2;
                if(num < numeros[metadeVetor]) {
                    fim = metadeVetor;        
                }
                else if(num > numeros[metadeVetor]){
                    inicio = metadeVetor+1;    
                }
            }estado = true;
        }
        //System.out.println("\n" + metadeVetor);
        //System.out.println(num);
        //System.out.println(estado);
        return estado;
    } 
    
    
    ///////////////////////////////////////////////////////////////////////////////////////
    public boolean buscaBinaria_recursiva(int[] numeros, int num) {
        boolean achou = false, estado = false;
        int  inicio = 1, fim = numeros.length -1;

        achou = buscaBinaria_recursivaAux(numeros, inicio, fim, num);         

        if (achou == true) {
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }

    
    ///////////////////////////////////////////////////////////////////////////////////////
    private boolean buscaBinaria_recursivaAux(int[] numeros,int ini, int fim ,  int num) {
        int   meio = (fim + ini)/2;
        boolean achou = false;


        if(ini > fim){
            return achou = false;
        }

      
        if (num == meio) {
            achou = true;
        }else if(num < 0 || num > numeros.length){
            achou = false;
        }else{
            if(num < numeros[meio]) {
                fim = meio - 1;
                buscaBinaria_recursivaAux(numeros, ini, fim, num);         
            }
            else if(num > numeros[meio]){
                ini = meio + 1;
                buscaBinaria_recursivaAux(numeros, ini, fim, num);         
            }
            achou = true;
        }
        return achou;
    }

}