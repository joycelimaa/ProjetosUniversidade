package Projeto;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


public class Teste_Arvore {

	
	static ArvoreProjeto arvore;
	
	
	@Before //Instanciando a árvore antes de cada teste
	public void instanciaArvore() throws Exception{
		arvore = new ArvoreProjeto();
		
		arvore.insertIn(3);
		arvore.insertIn(5);
		arvore.insertIn(4);
		arvore.insertIn(2);	
		
	}
	
	@Test
	public void testBuscar() throws Exception{
		
		arvore.insertIn(0);
		assertFalse(arvore.achou(1));
		
		arvore.insertIn(2);
		assertTrue(arvore.achou(2));

	}

	
	@Test
	public void testDelete() throws Exception{
		
		arvore.deleteThis(5);
		arvore.deleteThis(3);
		arvore.deleteThis(4);
		arvore.deleteThis(2);
		assertFalse(arvore.achou(5));
	}
	
	@Test
	public void testMenorValor() throws Exception{
			
		assertNotNull(arvore.mostLeftChild(arvore.rootPessoa));	
	}
	
	
	@Test
	public void testAltura() throws Exception{
		
		int altura = 2;
		assertEquals(altura, arvore.height(arvore.rootPessoa));
	
	}
	
}