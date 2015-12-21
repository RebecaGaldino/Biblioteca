package ifpb.cg.info.poo.RaylaRebeca.bibliotecaTest;

import static org.junit.Assert.*;
import ifpb.cg.info.poo.RaylaRebeca.biblioteca.Professor;

import org.junit.Before;
import org.junit.Test;

public class ProfessorTest {
	
	Professor p1;
	Professor p2;

	@Before
	public void setUp() throws Exception {
		p1 = new Professor(10, "Luiz", "R.Manoel Vasconcelos, 110");
		p2 = new Professor(2, "Bárbara", "R.Pedro II, 98");
	}

	@Test
	public void testProfessor() {
		assertFalse(p1.equals(p2));
	}

}
