package ifpb.cg.info.poo.RaylaRebeca.bibliotecaTest;

import static org.junit.Assert.*;
import ifpb.cg.info.poo.RaylaRebeca.biblioteca.Revista;

import org.junit.Before;
import org.junit.Test;

public class RevistaTest {
	
	Revista r1;
	Revista r2;
	Revista r3;
	
	@Before
	public void setUp() throws Exception {
		r1 = new Revista("Veja", "Qualquer Coisa", "SP", 2, 6);
		r2 = new Revista("Caras", "Sei lá", "RJ", 5, 1);
		r3 = new Revista("Veja", "Qualquer Coisa", "SP", 2, 6);
	}

	@Test
	public void testRevista() {
		assertFalse(r1.equals(r2));
		assertTrue(r1.equals(r3));
		assertFalse(r2.equals(r3));
	}

}
