package ifpb.cg.info.poo.RaylaRebeca.bibliotecaTest;

import static org.junit.Assert.*;
import ifpb.cg.info.poo.RaylaRebeca.biblioteca.Aluno;
import ifpb.cg.info.poo.RaylaRebeca.biblioteca.Emprestimo;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class AlunoTest {
	Aluno a1;
	Aluno a2;
	Emprestimo e1;
	Emprestimo e2;

	@Before
	public void setUp() throws Exception {
		a1 = new Aluno(1, "João", "R.Maria das Flores, 179");
		a2 = new Aluno(2, "João", "R.José de Azevedo, 2019");
		e2 = new Emprestimo("10/08/2015", "10/09/2015", 2, "321-0-1238-8653-9", "Romero Britto");
		e1 = new Emprestimo("27/08/2015", "10/09/2015", 1, "123-0-1238-8653-9", "José de Alencar");
	}

	@Test
	public void testAluno(){
		assertFalse(a2.equals(a1));
		assertFalse(e1.equals(e2));
	}

}
