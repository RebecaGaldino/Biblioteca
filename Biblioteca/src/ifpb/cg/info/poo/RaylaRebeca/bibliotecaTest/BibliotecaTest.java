package ifpb.cg.info.poo.RaylaRebeca.bibliotecaTest;

import static org.junit.Assert.*;
import ifpb.cg.info.poo.RaylaRebeca.biblioteca.Biblioteca;
import ifpb.cg.info.poo.RaylaRebeca.biblioteca.Livro;
import ifpb.cg.info.poo.RaylaRebeca.biblioteca.Revista;

import org.junit.Before;
import org.junit.Test;

public class BibliotecaTest {
	
	Biblioteca b1;
	Livro l1;
	Livro l2;
	Revista r1;
	Revista r2;

	@Before
	public void setUp() throws Exception {
		b1 = new Biblioteca();
		l1 = new Livro("Blabla", "aa", "PB", 1, 1, "EU", "752-8-7421-2123-0", "OI");
		l2 = l1;
		r1 = new Revista("Fofoca", "TITITI", "UE", 5, 2);
		r2 = new Revista("AIAIAI", "LUA", "AS", 19, 1);
		b1.addLivro(l1);
		b1.addLivro(l2);
		b1.addRevista(r1);
	}

	@Test
	public void test() {
		assertTrue(l1.equals(l2));
		assertFalse(r1.equals(r2));
		assertTrue(b1.findRevista(r1));
		assertTrue(b1.findLivro(l1));
		assertTrue(b1.findLivro(l2));
		assertTrue(b1.findRevista(r2));
	}
	
}
