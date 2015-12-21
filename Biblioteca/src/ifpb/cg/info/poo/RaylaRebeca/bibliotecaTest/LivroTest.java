package ifpb.cg.info.poo.RaylaRebeca.bibliotecaTest;

import static org.junit.Assert.*;
import ifpb.cg.info.poo.RaylaRebeca.biblioteca.Livro;

import org.junit.Before;
import org.junit.Test;

public class LivroTest {
	
	Livro l1;
	Livro l2;

	@Before
	public void setUp() throws Exception {
		l1 = new Livro("O Pequeno Prícipe", "Geração Editorial", "SP", 10, 2, "Antoine De Saint-exupéry", "978-8-5813-0307-9", "Principe");
		l2 = new Livro("A Culpa é Das Estrelas", "Rocco", "SP", 3, 1, "John Green", "978-8-5805-7226-1", "August");
	}

	@Test
	public void testLivro() {
		assertFalse(l1.equals(l2));
	}

}
