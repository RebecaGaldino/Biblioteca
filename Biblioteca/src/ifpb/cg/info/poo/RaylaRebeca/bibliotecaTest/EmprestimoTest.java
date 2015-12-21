package ifpb.cg.info.poo.RaylaRebeca.bibliotecaTest;

import static org.junit.Assert.*;

import java.util.Date;

import ifpb.cg.info.poo.RaylaRebeca.biblioteca.Emprestimo;

import org.junit.Before;
import org.junit.Test;

public class EmprestimoTest {
	
	Emprestimo e1;
	Emprestimo e2;
	Emprestimo e3;
	Emprestimo e4;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() throws Exception {
		e1 = new Emprestimo("05/10/2015", "07/10/2015", 1, "173-9-3826-3816-8", "Nicholas Sparks");
		e2 = new Emprestimo("20/12/2015", "04/01/2016", 4, "123-4-5678-9101-1", "John Green");
		e3 = new Emprestimo("15/11/2015", "30/11/2015", 3, "Quem sabe agora", 2);
		e4 = new Emprestimo("14/11/2016", "29/11/2016", 2, "Agora não", 1);
	}

	@Test
	public void testEmprestimoDateDateIntStringString() {
		assertFalse(e1.equals(e2));
	}

	@Test
	public void testEmprestimoDateDateIntStringInt() {
		assertFalse(e3.equals(e4));
	}

}
