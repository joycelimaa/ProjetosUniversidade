package atividade01;

public class BrincandoComBusca {
    public static void main(String[] args) {
        

        double antes, depois;
        Busca_IF b = new Busca();
        final int[] vetor = b.geraVetorNumericoOrdenado(1000000);
        //b.MostrarVetor(vetor);
        System.out.println();
        System.out.printf("-----------------BUSCA LINEAR----------------");
        System.out.println();
        
        
        antes = System.nanoTime();
        b.buscaLinear_iterativa(vetor, -1);
        depois = System.nanoTime();
        System.out.printf("\n Busca Linear Iterativa (-1):  %.4f/ms", ((depois - antes)/1000000.0));
        
        antes = System.nanoTime();
        b.buscaLinear_iterativa(vetor, 1);
        depois = System.nanoTime();
        System.out.printf("\n Busca Linear Iterativa (1):  %.4f/ms", ((depois - antes)/1000000.0));
        
        antes = System.nanoTime();
        b.buscaLinear_iterativa(vetor, 1000);
        depois = System.nanoTime();
        System.out.printf("\n Busca Linear Iterativa (1000):  %.4f/ms", ((depois - antes)/1000000.0));
        
        antes = System.nanoTime();
        b.buscaLinear_iterativa(vetor, 100000);
        depois = System.nanoTime();
        System.out.printf("\n Busca Linear Iterativa (100000):  %.4f/ms", ((depois - antes)/1000000.0));
        
        
        antes = System.nanoTime();
        b.buscaLinear_iterativa(vetor, 500000);
        depois = System.nanoTime();
        System.out.printf("\n Busca Linear Iterativa (500000):  %.4f/ms", ((depois - antes)/1000000.0));
        System.out.println();
        
       //Busca linear recursiva
        
        
        antes = System.nanoTime();
        b.buscaLinear_recursiva(vetor, 1);
        depois = System.nanoTime();
        System.out.printf("\n Busca Linear Recursiva (1):  %.4f/ms", ((depois - antes)/1000000.0) );
        
        antes = System.nanoTime();
        b.buscaLinear_recursiva(vetor, 1000);
        depois = System.nanoTime();
        System.out.printf("\n Busca Linear Recursiva (1000):  %.4f/ms", ((depois - antes)/1000000.0) );
        
     
        System.out.println();
        System.out.println();
        System.out.printf("-----------------BUSCA BINÁRIA----------------");
        System.out.println();
        
        antes = System.nanoTime();
        b.buscaBinaria_iterativa(vetor, -1);
        depois = System.nanoTime();
        System.out.printf("\n Busca Binaria Iterativa (-1):  %.4f/ms", ((depois - antes)/1000000.0) );

        antes = System.nanoTime();
        b.buscaBinaria_iterativa(vetor, 1);
        depois = System.nanoTime();
        System.out.printf("\n Busca Binaria Iterativa (1):  %.4f/ms", ((depois - antes)/1000000.0) );

        antes = System.nanoTime();
        b.buscaBinaria_iterativa(vetor, 1000);
        depois = System.nanoTime();
        System.out.printf("\n Busca Binaria Iterativa (1000):  %.4f/ms", ((depois - antes)/1000000.0) );
        
        antes = System.nanoTime();
        b.buscaBinaria_iterativa(vetor, 100000);
        depois = System.nanoTime();
        System.out.printf("\n Busca Binaria Iterativa (100000):  %.4f/ms", ((depois - antes)/1000000.0) );
        
        antes = System.nanoTime();
        b.buscaBinaria_iterativa(vetor, 500000);
        depois = System.nanoTime();
        System.out.printf("\n Busca Binaria Iterativa (500000):  %.4f/ms", ((depois - antes)/1000000.0) );
        System.out.println();
        
        // Busca binária iterativa
        
        antes = System.nanoTime();
        b.buscaBinaria_recursiva(vetor, -1);
        depois = System.nanoTime();
        System.out.printf("\n Busca Binaria Recursiva (-1):  %.4f/ms", ((depois - antes)/1000000.0) );

        antes = System.nanoTime();
        b.buscaBinaria_recursiva(vetor, 1);
        depois = System.nanoTime();
        System.out.printf("\n Busca Binaria Recursiva (1):  %.4f/ms", ((depois - antes)/1000000.0) );

        antes = System.nanoTime();
        b.buscaBinaria_recursiva(vetor, 1000);
        depois = System.nanoTime();
        System.out.printf("\n Busca Binaria Recursiva (1000):  %.4f/ms", ((depois - antes)/1000000.0) );
        
        antes = System.nanoTime();
        b.buscaBinaria_recursiva(vetor, 100000);
        depois = System.nanoTime();
        System.out.printf("\n Busca Binaria Recursiva (100000):  %.4f/ms", ((depois - antes)/1000000.0) ); 
        
        antes = System.nanoTime();
        b.buscaBinaria_recursiva(vetor, 500000);
        depois = System.nanoTime();
        System.out.printf("\n Busca Binaria Recursiva (500000):  %.4f/ms", ((depois - antes)/1000000.0) );
    }
}