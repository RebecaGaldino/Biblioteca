package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

import java.util.ArrayList;

public class Professor extends AbstractAssociado{
	
	public Professor(int idAssociado, String nome, String endereco,
			ArrayList<Emprestimo> emprestimos) {
		super(idAssociado, nome, endereco, emprestimos);
	}
}
